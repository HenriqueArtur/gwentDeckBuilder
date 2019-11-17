/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Game.DeckProduct;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Usuario {
    private int id;
    private String nome_usuario;
    private String email;
    private String senha;
    private ArrayList<DeckProduct> decks;
    
    public void editarUsuario(int id, String nome_usuario, String email, String senha) {
        this.id = id;
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
    }
    
    public void removerDeckNome(String deck_name) {
        for(DeckProduct deck : decks) {
            if(deck.getDeck_name() == deck_name) {
                deck.removeToDeckList();
                break;
            }
        }
    }
    
    public void removerDeckID(int deck_id) {
        for(DeckProduct deck : decks) {
            if(deck.getId_deck() == deck_id) {
                deck.removeToDeckList();
                break;
            }
        }
    }

    public ArrayList<DeckProduct> getDecks() {
        return decks;
    }
    
    
}
