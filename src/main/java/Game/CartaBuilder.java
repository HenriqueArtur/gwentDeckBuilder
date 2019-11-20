/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class CartaBuilder {
    private CartaProduct carta;
    
    public void buildTitulo(String titulo) {
        this.carta.setTitulo(titulo);
    }
    
    public void buildDescricao(String descricao){
        this.carta.setDescricao(descricao);
    }
    
    public void buildFaccao(String faccao) {
        this.carta.setFaccao(faccao);
    }
    
    public void buidlRaridade(String raridade){
        this.carta.setRaridade(raridade);
    }
    
    public void buildHierarquia(String hierarquia) {
        this.carta.setHierarquia(hierarquia);
    }
    
    public void buildArte(String arte) {
        this.carta.setArte(arte);
    }
    
    public void buildRestos(int restos){
        this.carta.setRestos(restos);
    }
    
    public void buildPontos(int pontos) {
        this.carta.setPontos(pontos);
    }
    
    public void buildProvisoes(int provisoes) {
        this.carta.setProvisoes(provisoes);
    }
    
    public void buildEfeitos(ArrayList<Efeito> efeitos) {
        this.carta.setEfeitos(efeitos);
    }
}
