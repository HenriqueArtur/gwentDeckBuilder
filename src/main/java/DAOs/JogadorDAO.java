/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Game.DeckProduct;
import Users.Jogador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */

public class JogadorDAO extends DAO {
     public void inserir(Jogador j) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO usuario (nome_usuario, email, senha) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, j.getNome_usuario());
        stmt.setString(2, j.getEmail());
        stmt.setString(3, j.getSenha());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        sql = "INSERT INTO jogador (usuario_id) VALUES ((SELECT MAX(id) FROM usuario))";
        stmt = c.prepareStatement(sql);
        resultado = stmt.executeUpdate();
        stmt.close();
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este jogador");
        }
    }
     
     public void atualizar(Jogador j) throws Exception {
        Connection c = obterConexao();
        
        String sql = "UPDATE usuario SET nome_usuario = ?, email = ?, senha = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, j.getNome_usuario());
        stmt.setString(2, j.getEmail());
        stmt.setString(3, j.getSenha());
        stmt.setInt(4, j.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();   
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este jogador");
        }
    }

    public void remover(Jogador j) throws Exception {
        Connection c = obterConexao();
        
        String sql = "DELETE FROM jogador WHERE usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, j.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        sql = "DELETE FROM usuario WHERE id = ?";
        stmt = c.prepareStatement(sql);
        stmt.setInt(1, j.getId());
        resultado = stmt.executeUpdate();
        stmt.close();
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover este jogador");
        }
    }

    public Jogador obter(int id) throws Exception {
        Jogador j = null;
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, jogador AS j WHERE u.id = ? AND j.usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            j = new Jogador();
            j.setId(rs.getInt("id"));
            j.setNome_usuario(rs.getString("nome_usuario"));
            j.setEmail(rs.getString("email"));
            j.setSenha(rs.getString("senha"));
            j.setDecks(obterDecks(rs.getInt("id"), c));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (j == null) {
            throw new Exception("Não foi possível localizar este usuario");
        }
        return j;
    }
    
    public Jogador obterParaDeck(int id) throws Exception {
        Jogador j = null;
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, jogador AS j WHERE u.id = ? AND j.usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            j = new Jogador();
            j.setId(rs.getInt("id"));
            j.setNome_usuario(rs.getString("nome_usuario"));
            j.setEmail(rs.getString("email"));
            j.setSenha(rs.getString("senha"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (j == null) {
            throw new Exception("Não foi possível localizar este usuario");
        }
        return j;
    }


    public List<Jogador> obterTodos() throws Exception {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, jogador AS a WHERE a.usuario_id = u.id";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Jogador j = new Jogador();
            j.setId(rs.getInt("id"));
            j.setNome_usuario(rs.getString("nome_usuario"));
            j.setEmail(rs.getString("email"));
            j.setSenha(rs.getString("senha"));
            j.setDecks(obterDecks(rs.getInt("id"), c));
            jogadores.add(j);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return jogadores;
    }

    public ArrayList<DeckProduct> obterDecks(int id_usuario, Connection c) throws Exception{
        ArrayList<DeckProduct> decks = new ArrayList<DeckProduct>();
        DeckDAO deck = new DeckDAO();
        String sql = "SELECT d.deck_id FROM deck AS d WHERE d.usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id_usuario);
        ResultSet rs2 = stmt.executeQuery();
        while (rs2.next()) {
            decks.add(deck.obter(rs2.getInt("d.id")));
        }
        rs2.close();
        return decks;
    }
}
