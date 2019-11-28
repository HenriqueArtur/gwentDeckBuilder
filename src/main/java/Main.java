
import DAOs.AdminDAO;
import DAOs.CartaDAO;
import DAOs.DeckDAO;
import DAOs.JogadorDAO;
import Game.CartaProduct;
import Game.DeckProduct;
import Game.Efeito;
import Game.EfeitoConsume;
import Users.Admin;
import Users.Jogador;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artur
 */
public class Main {
    public static void main(String[] args) throws Exception {
        AdminDAO j = new AdminDAO();
        DeckDAO d = new DeckDAO();
        CartaDAO c = new CartaDAO();
        
        DeckProduct dp = new DeckProduct();
        
        //dp.setDeck_name("deck_name");
        //dp.setUsuario(j.obterParaDeck(6));
        
        /*for(int i = 1; i < 21; i++) {
            System.out.println(c.obter(i).getId_carta());
            dp.addCarta(c.obter(i));
        }*/
        
        //d.inserir(dp);
        
        System.out.println(d.obter(6).getCartas());
    }
}
