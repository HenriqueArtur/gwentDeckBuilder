/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Game.CartaProduct;
import Game.Efeito;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Admin extends Usuario {
    public Admin(String nome_usuario, String email, String senha) {
        super();
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
    }
    
    public void criarCarta() {
        
    }
    
    public void editarCarta(CartaProduct carta, String titulo, String descricao,
                       String faccao, String raridade, String hierarquia, String arte,
                       int restos, int pontos, int provisoes, ArrayList<Efeito> efeitos) {
        carta.setTitulo(titulo);
        carta.setDescricao(descricao);
        carta.setFaccao(faccao);
        carta.setRaridade(raridade);
        carta.setHierarquia(hierarquia);
        carta.setArte(arte);
        carta.setRestos(restos);
        carta.setPontos(pontos);
        carta.setProvisoes(provisoes);
        carta.setEfeitos(efeitos);
    }
    
    public void removeCarta(CartaProduct carta) {
        carta = null;
    }
    
    public void removeUsuario(Usuario usuario) {
        usuario = null;
    }
}
