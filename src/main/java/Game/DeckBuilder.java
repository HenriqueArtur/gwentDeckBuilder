/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Users.Usuario;

/**
 *
 * @author artur
 */
public class DeckBuilder {
    private DeckProduct deck;

    public DeckBuilder() {
        deck = new DeckProduct();
    }
    
    public void buildDeckName(String deck_name){
        this.deck.setDeck_name(deck_name);
    }
    
    public void buildUsuario(Usuario usuario) {
        this.deck.setUsuario(usuario);
    }

    public DeckProduct getDeck() {
        return this.deck;
    }
    
}
