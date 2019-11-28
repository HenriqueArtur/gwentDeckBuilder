/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Game.CartaProduct;
import Game.Efeito;
import Game.EfeitoConsume;
import Game.EfeitoDeploy;
import Game.EfeitoHeal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */


public class CartaDAO extends DAO {
     public void inserir(CartaProduct cp) throws Exception {
        try {
            Connection c = obterConexao();

            String sql = "INSERT INTO carta (titulo, descricao, faccao, raridade, hierarquia, arte, resto, pontos, provisoes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, cp.getTitulo());
            stmt.setString(2, cp.getDescricao());
            stmt.setString(3, cp.getFaccao());
            stmt.setString(4, cp.getRaridade());
            stmt.setString(5, cp.getHierarquia());
            stmt.setString(6, cp.getArte());
            stmt.setInt(7, cp.getRestos());
            stmt.setInt(8, cp.getPontos());
            stmt.setInt(9, cp.getProvisoes());
            int resultado = stmt.executeUpdate();
            stmt.close();

            //****************************************************
            if(cp.getEfeitos()!= null){
                for(Efeito efeito : cp.getEfeitos()) {
                    inserirEfeitoCarta(qualEfeito(efeito));
                    //System.out.println(qualEfeito(efeito);
                }
            }
            //****************************************************

            fecharConexao(c);
            /*if (resultado != 1) {
                throw new Exception("Não foi possível inserir esta carta");
            }*/
        } catch (Exception e) {
            throw new Exception("Não foi possível inserir esta carta");
        }
    }
     
     public void atualizar(CartaProduct cp) throws Exception {
        
        Connection c = obterConexao();
        
        String sql = "UPDATE carta SET titulo = ?, descricao = ?, faccao = ?, raridade = ?, hierarquia = ?, arte = ?, resto = ?, pontos = ?, provisoes = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, cp.getTitulo());
        stmt.setString(2, cp.getDescricao());
        stmt.setString(3, cp.getFaccao());
        stmt.setString(4, cp.getRaridade());
        stmt.setString(5, cp.getHierarquia());
        stmt.setString(6, cp.getArte());
        stmt.setInt(7, cp.getRestos());
        stmt.setInt(8, cp.getPontos());
        stmt.setInt(9, cp.getProvisoes());
        stmt.setInt(10, cp.getId_carta());
        int resultado = stmt.executeUpdate();
        stmt.close();

        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar esta carta");
        }
    }

    public void remover(CartaProduct cp) throws Exception {
        Connection c = obterConexao();
        
        String sql = "DELETE FROM carta WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cp.getId_carta());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover esta carta");
        }
    }

    public CartaProduct obter(int id) throws Exception {
        CartaProduct cb = null;
        Connection c = obterConexao();
        
        String sql = "SELECT id, titulo, descricao, faccao, raridade, hierarquia, arte, resto, pontos, provisoes FROM carta WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            cb = new CartaProduct();
            cb.setId(rs.getInt("id"));
            cb.setTitulo(rs.getString("titulo"));
            cb.setDescricao(rs.getString("descricao"));
            cb.setFaccao(rs.getString("faccao"));
            cb.setRaridade(rs.getString("raridade"));
            cb.setHierarquia(rs.getString("hierarquia"));
            cb.setArte(rs.getString("arte"));
            cb.setRestos(rs.getInt("resto"));
            cb.setPontos(rs.getInt("pontos"));
            cb.setProvisoes(rs.getInt("provisoes"));
            //********************************************
            cb.setEfeitos(obterEfeitos(rs.getInt("id"), c));
            //********************************************
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (cb == null) {
            throw new Exception("Não foi possível localizar esta carta");
        }
        return cb;
    }

    public List<CartaProduct> obterTodos() throws Exception {
        List<CartaProduct> cartas = new ArrayList<CartaProduct>();
        Connection c = obterConexao();
        String sql = "SELECT id, titulo, descricao, faccao, raridade, hierarquia, arte, resto, pontos, provisoes FROM carta ";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            CartaProduct a = new CartaProduct();
            a.setId(rs.getInt("id"));
            a.setTitulo(rs.getString("titulo"));
            a.setDescricao(rs.getString("descricao"));
            a.setFaccao(rs.getString("faccao"));
            a.setRaridade(rs.getString("raridade"));
            a.setHierarquia(rs.getString("hierarquia"));
            a.setArte(rs.getString("arte"));
            a.setRestos(rs.getInt("resto"));
            a.setPontos(rs.getInt("pontos"));
            a.setProvisoes(rs.getInt("provisoes"));
            //********************************************
            a.setEfeitos(obterEfeitos(rs.getInt("id"), c));
            //********************************************
            cartas.add(a);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return cartas;
    }

    public ArrayList<Efeito> obterEfeitos(int id, Connection c) throws Exception{
        ArrayList<Efeito> efeitos = new ArrayList<Efeito>();
        String sql = "SELECT e.id, e.descricao FROM efeito AS e, carta AS c, efeito_carta AS ec WHERE ec.carta_id = ? AND ec.efeito_id = e.id";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs2 = stmt.executeQuery();
        while (rs2.next()) {
            switch(rs2.getInt("e.id")) {
                case 1:
                   EfeitoConsume consume = new EfeitoConsume(rs2.getString("e.descricao"));
                   efeitos.add(consume);
                   break;
                case 2:
                    EfeitoDeploy deploy = new EfeitoDeploy(rs2.getString("e.descricao"));
                   efeitos.add(deploy);
                   break;
                case 3:
                    EfeitoHeal heal = new EfeitoHeal(rs2.getString("e.descricao"));
                   efeitos.add(heal);
                   break;
                default:
                    break;
            }
        }
        rs2.close();
        return efeitos;
    }
    
    public int qualEfeito(Efeito e) throws Exception {
        if(e instanceof EfeitoConsume) {
            return 1;
        } else if(e instanceof EfeitoDeploy) {
            return 2;
        } else if(e instanceof EfeitoHeal) {
            return 3;
        }else {
            throw new Exception("Efeito invalido");
        }
    }
    
    public void inserirEfeitoCarta(int efeito_id) throws Exception {
        Connection c = obterConexao();

        String sql = "INSERT INTO efeito_carta (efeito_id, carta_id) VALUES (?, (SELECT MAX(id) FROM usuario))";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, efeito_id);
        int resultado = stmt.executeUpdate();
        stmt.close();

        fecharConexao(c);
    }
}
