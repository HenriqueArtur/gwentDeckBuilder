
import DAOs.AdminDAO;
import DAOs.CartaDAO;
import DAOs.DeckDAO;
import DAOs.JogadorDAO;
import Game.CartaProduct;
import Game.DeckProduct;
import Game.Efeito;
import Game.EfeitoConsume;
import Game.EfeitoDeploy;
import Game.EfeitoHeal;
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
        CartaDAO c = new CartaDAO();
        CartaProduct cp = new CartaProduct();
        ArrayList<Efeito> efeitos = new ArrayList<>();
        efeitos.add(new EfeitoConsume("Consome uma carta aliada"));
        efeitos.add(new EfeitoDeploy("Ao ser posto em campo executa o efeito de Consume"));
        efeitos.add(new EfeitoHeal("Cura um aliado"));
        
        cp.setArte("/Pictures/Geralt_de_Rivia.png");
        cp.setDescricao("Bruxo da escola do Lobo");
        cp.setFaccao("Neutro");
        cp.setHierarquia("ouro");
        cp.setPontos(10);
        cp.setProvisoes(16);
        cp.setRaridade("lendario");
        cp.setRestos(800);
        cp.setTitulo("Geralt de Rivia");
        cp.setEfeitos(efeitos);
        
        c.inserir(cp);
    }
}
