/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Game.CartaProduct;
import Game.DeckProduct;
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


public class DeckDAO extends DAO {
     public void inserir(DeckProduct cp) throws Exception {
        Connection c = obterConexao();
        
        String sql = "INSERT INTO deck (id, usuario_id, deck_name) VALUES (?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cp.getId_deck());
        stmt.setInt(3, cp.getUsuario().getId());
        stmt.setString(3, cp.getDeck_name());
        //*****************************************
        for(CartaProduct carta : cp.getCartas()) {
            CartaDAO cartaDAO = new CartaDAO();
            cartaDAO.inserir(carta);
        }
        //*****************************************
        int resultado = stmt.executeUpdate();
        stmt.close();

        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este deck");
        }
    }
     
     public void atualizar(DeckProduct cp) throws Exception {
        Connection c = obterConexao();
        
        String sql = "UPDATE deck SET titulo = ? WHERE id = ? AND usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, cp.getDeck_name());
        stmt.setInt(2, cp.getId_deck());
        stmt.setInt(3, cp.getUsuario().getId());
        //*****************************************
        for(CartaProduct carta : cp.getCartas()) {
            CartaDAO cartaDAO = new CartaDAO();
            cartaDAO.atualizar(carta);
        }
        //*****************************************
        int resultado = stmt.executeUpdate();
        stmt.close();

        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este deck");
        }
    }

    public void remover(DeckProduct cp) throws Exception {
        Connection c = obterConexao();
        
        String sql = "DELETE FROM deck WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cp.getId_deck());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover este deck");
        }
    }

    public DeckProduct obter(int id) throws Exception {
        DeckProduct cb = null;
        Connection c = obterConexao();
        
        String sql = "SELECT id, titulo, descricao, faccao, raridade, hierarquia, arte, restos, pontos, provisoes FROM carta WHERE id = ?";
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
            cb.setRestos(rs.getInt("restos"));
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
        String sql = "SELECT id, titulo, descricao, faccao, raridade, hierarquia, arte, restos, pontos, provisoes FROM cartas";
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
            a.setRestos(rs.getInt("restos"));
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

}
