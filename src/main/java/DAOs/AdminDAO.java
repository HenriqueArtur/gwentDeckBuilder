/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Game.DeckProduct;
import Users.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */

public class AdminDAO extends DAO {
     public void inserir(Admin a) throws Exception {
        Connection c = obterConexao();
        
        String sql = "INSERT INTO usuario (nome_usuario, email, senha) VALUES (?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, a.getNome_usuario());
        stmt.setString(2, a.getEmail());
        stmt.setString(3, a.getSenha());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        sql = "INSERT INTO admin (usuario_id) VALUES ((SELECT MAX(id) FROM usuario))";
        stmt = c.prepareStatement(sql);
        resultado = stmt.executeUpdate();
        stmt.close();;
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este admin");
        }
    }
     
     public void atualizar(Admin a) throws Exception {
        Connection c = obterConexao();
        
        String sql = "UPDATE usuario SET nome_usuario = ?, email = ?, senha = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, a.getNome_usuario());
        stmt.setString(2, a.getEmail());
        stmt.setString(3, a.getSenha());
        stmt.setInt(4, a.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
<<<<<<< HEAD
        /*sql = "UPDATE admin SET usuario_id = ?";
        stmt = c.prepareStatement(sql);
        stmt.setInt(1, a.getId());
        resultado = stmt.executeUpdate();
        stmt.close();*/
        
=======
>>>>>>> b1ed2fcf365c4611770d41628f6d287f0092450a
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este admin");
        }
    }

    public void remover(Admin a) throws Exception {
        Connection c = obterConexao();
        
        String sql = "DELETE FROM admin WHERE usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, a.getId());
        int resultado = stmt.executeUpdate();
        stmt.close();
        
        sql = "DELETE FROM usuario WHERE id = ?";
        stmt = c.prepareStatement(sql);
        stmt.setInt(1, a.getId());
        resultado = stmt.executeUpdate();
        stmt.close();
        
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover este admin");
        }
    }

    public Admin obter(int id) throws Exception {
        Admin a = null;
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, admin AS a WHERE u.id = ? AND a.usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            a = new Admin();
            a.setId(rs.getInt("id"));
            a.setNome_usuario(rs.getString("nome_usuario"));
            a.setEmail(rs.getString("email"));
            a.setSenha(rs.getString("senha"));
            //****************************
            a.setDecks(obterDecks(rs.getInt("id"), c));
            //****************************
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (a == null) {
            throw new Exception("Não foi possível localizar este usuario");
        }
        return a;
    }

    public Admin obterParaDeck(int id) throws Exception {
        Admin a = null;
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, admin AS a WHERE u.id = ? AND a.usuario_id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            a = new Admin();
            a.setId(rs.getInt("id"));
            a.setNome_usuario(rs.getString("nome_usuario"));
            a.setEmail(rs.getString("email"));
            a.setSenha(rs.getString("senha"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (a == null) {
            throw new Exception("Não foi possível localizar este usuario");
        }
        return a;
    }

    
    public List<Admin> obterTodos() throws Exception {
        List<Admin> admins = new ArrayList<Admin>();
        Connection c = obterConexao();
        String sql = "SELECT u.id, u.nome_usuario, u.email, u.senha FROM usuario AS u, admin AS a WHERE a.usuario_id = u.id";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Admin a = new Admin();
            a.setId(rs.getInt("id"));
            a.setNome_usuario(rs.getString("nome_usuario"));
            a.setEmail(rs.getString("email"));
            a.setSenha(rs.getString("senha"));
            a.setDecks(obterDecks(rs.getInt("id"), c));
            admins.add(a);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return admins;
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
