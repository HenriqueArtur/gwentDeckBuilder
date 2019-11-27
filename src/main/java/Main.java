
import DAOs.AdminDAO;
import DAOs.JogadorDAO;
import Users.Admin;
import Users.Jogador;

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
        //Jogador j = new Jogador("Amigo", "teste", "teste");
        //j.setId(5);
        JogadorDAO jd = new JogadorDAO();
        
        //jd.inserir(j);
        System.out.println(jd.obterTodos());
    }
}
