/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public class UsuarioDAO extends DAO {
    public void inserir(Usuario u) throws Exception {
        Connection c = obterConexao();
        String sql = "INSERT INTO usuario (id, nome_usuario, email, senha) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, u.getID());
        stmt.setString(2, u.getNomeUsuario());
        stmt.setString(3, u.getEmail());
        stmt.setString(4, u.getSenha());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível inserir este usuário");
        }
    }

    public void atualizar(Usuario u) throws Exception {
        Connection c = obterConexao();
        String sql = "UPDATE usuario SET nome_usuario = ?, email = ?, senha = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, u.getNomeUsuario());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setInt(4, u.getID());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível atualizar este usuário");
        }
    }

    public void remover(Usuario u) throws Exception {
        Connection c = obterConexao();
        String sql = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, u.getID());
        int resultado = stmt.executeUpdate();
        stmt.close();
        fecharConexao(c);
        if (resultado != 1) {
            throw new Exception("Não foi possível remover este usuário");
        }
    }

    public Usuario obter(int id) throws Exception {
        Usuario u = null;
        Connection c = obterConexao();
        String sql = "SELECT id, nome_usuario, email, senha FROM pessoa WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            u = new Usuario();
            u.setID(rs.getInt("id"));
            u.setNomeUsuario(rs.getString("nome_usuario"));
            u.setEmail(rs.getString("email"));
            u.setSenha(rs.getString("senha"));
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (u == null) {
            throw new Exception("Não foi possível localizar este usuario");
        }
        return u;
    }

    public List<Usuario> obterTodos() throws Exception {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Connection c = obterConexao();
        String sql = "SELECT id, nome_usuario, email, senha FROM usuario";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Usuario u = new Usuario();
            u.setID(rs.getInt("id"));
            u.setNomeUsuario(rs.getString("nome_usuario"));
            u.setEmail(rs.getString("email"));
            u.setSenha(rs.getString("senha"));
            usuarios.add(u);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return usuarios;
    }

}
