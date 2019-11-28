/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Users.Usuario;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class DeckProduct {
    private int id_deck;
    private String deck_name;
    private Usuario usuario;
    private ArrayList<CartaProduct> cartas = new ArrayList<CartaProduct>();

    public DeckProduct() {}
    
    public void addCarta(CartaProduct carta) {
        if(retornaProvisoes() + carta.getProvisoes() <= 165 /*&& cartaPorHierarquia(carta)*/) {
            getCartas().add(carta);
        }
    }
    
    public void removeCarta(CartaProduct cartaInserida) {
        for(CartaProduct cartaComparada : cartas){
            if(cartaComparada.equals(cartaInserida)) {
                getCartas().remove(cartaInserida);
                break;
            }
        }
    }
    
    public void addToDeckList() {
        getUsuario().getDecks().add(this);
    }
    
    public void removeToDeckList() {
        getUsuario().getDecks().remove(this);
    }
    
    private int retornaProvisoes() {
        int soma = 0;
        if(cartas != null) {
            for(CartaProduct carta : cartas){
                soma += carta.getProvisoes();
            }
        }
        return soma;
    }
    
    private boolean cartaPorHierarquia(CartaProduct cartaInserida){
        int cont;
        if (cartaInserida.getHierarquia() == "ouro") {
            cont = 1;
        } else {
            cont = 2;
        }
        
        for(CartaProduct cartaComparada : cartas){
            if(cartaComparada.equals(cartaInserida)) {
                cont--;
            }
        }
        
        return cont > 0;
    }
    
    // GETs
    public int getId_deck() {
        return id_deck;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ArrayList<CartaProduct> getCartas() {
        return cartas;
    }

    public String getDeck_name() {
        return deck_name;
    }
    
    // SETs
    public void setDeck_name(String deck_name) {
        this.deck_name = deck_name;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setId_deck(int id_deck) {
        this.id_deck = id_deck;
    }

    public void setCartas(ArrayList<CartaProduct> cartas) {
        this.cartas = cartas;
    }
    
}
