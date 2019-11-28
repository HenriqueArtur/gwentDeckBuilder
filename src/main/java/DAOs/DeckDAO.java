/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Game.CartaProduct;
import Game.DeckProduct;
import Users.Usuario;
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
        CartaDAO cartaDAO = new CartaDAO();
        Connection c = obterConexao();
        
        String sql = "INSERT INTO deck (usuario_id, titulo) VALUES (?, ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, cp.getUsuario().getId());
        stmt.setString(2, cp.getDeck_name());
        //*****************************************
        for(CartaProduct carta : cp.getCartas()) {
            //inserirCartaDeck(carta.getId_carta());
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
        
        String sql = "SELECT id, usuario_id, deck_name FROM deck WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            cb = new DeckProduct();
            cb.setId_deck(rs.getInt("id"));
            cb.setDeck_name(rs.getString("deck_name"));
            Usuario u = new Usuario();
            cb.setUsuario(u);
            //********************************************
            cb.setCartas(obterCartas(rs.getInt("id"), rs.getInt("usuario_id"), c));
            //********************************************
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        if (cb == null) {
            throw new Exception("Não foi possível localizar este deck");
        }
        return cb;
    }

    public List<DeckProduct> obterTodos() throws Exception {
        List<DeckProduct> decks = new ArrayList<DeckProduct>();
        Connection c = obterConexao();
        String sql = "SELECT id, usuario_id, deck_name FROM deck";
        PreparedStatement stmt = c.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            DeckProduct a = new DeckProduct();
            a.setId_deck(rs.getInt("id"));
            a.setDeck_name(rs.getString("deck_name"));
            Usuario u = new Usuario();
            a.setUsuario(u);
            //********************************************
            a.setCartas(obterCartas(rs.getInt("id"), rs.getInt("usuario_id"), c));
            //********************************************
            decks.add(a);
        }
        rs.close();
        stmt.close();
        fecharConexao(c);
        return decks;
    }
    
    public ArrayList<CartaProduct> obterCartas(int id_deck, int id_usuario, Connection c) throws Exception{
        ArrayList<CartaProduct> cartas = new ArrayList<CartaProduct>();
        CartaDAO carta = new CartaDAO();
        String sql = "SELECT c.id FROM carta AS c, carta_deck AS cd, deck AS d WHERE cd.deck_id = ? AND cd.usuario_id = ? AND cd.carta_id = c.id";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, id_deck);
        stmt.setInt(2, id_usuario);
        ResultSet rs2 = stmt.executeQuery();
        while (rs2.next()) {
            cartas.add(carta.obter(rs2.getInt("c.id")));
        }
        rs2.close();
        return cartas;
    }

    public void inserirCartaDeck(int carta_id) throws Exception {
        Connection c = obterConexao();
        
        String sql = "INSERT INTO carta_deck (deck_id, carta_id) VALUES ((SELECT MAX(deck_id) FROM deck), ?)";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, carta_id);
        int resultado = stmt.executeUpdate();
        stmt.close();

        fecharConexao(c);
    }
}
