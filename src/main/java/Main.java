
import DAOs.AdminDAO;
import DAOs.CartaDAO;
import DAOs.JogadorDAO;
import Game.CartaProduct;
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
        /*ArrayList<Efeito> efeitos = new ArrayList<Efeito>();
        EfeitoConsume com = new EfeitoConsume("esse");
        EfeitoConsume aaa = new EfeitoConsume("aaa");
        efeitos.add(com);
        efeitos.add(aaa);
        
        CartaProduct c = new CartaProduct();
        c.setArte("b");
        c.setDescricao("des2");
        c.setEfeitos(efeitos);
        c.setFaccao("fac2");
        c.setHierarquia("hie2");
        c.setPontos(1);
        c.setProvisoes(2);
        c.setRaridade("nor2");
        c.setRestos(200);
        c.setTitulo("tit2");
        c.setId(0);
        */
        CartaDAO carta = new CartaDAO();
        
        System.out.println(carta.obterTodos());
    }
}
