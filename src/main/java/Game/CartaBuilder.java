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

    public CartaBuilder() {
        this.carta = new CartaProduct();
    }
    
    public void buildTitulo(String titulo) {
        getCarta().setTitulo(titulo);
    }
    
    public void buildDescricao(String descricao){
        getCarta().setDescricao(descricao);
    }
    
    public void buildFaccao(String faccao) {
        getCarta().setFaccao(faccao);
    }
    
    public void buildRaridade(String raridade){
        getCarta().setRaridade(raridade);
    }
    
    public void buildHierarquia(String hierarquia) {
        getCarta().setHierarquia(hierarquia);
    }
    
    public void buildArte(String arte) {
        getCarta().setArte(arte);
    }
    
    public void buildRestos(int restos){
        getCarta().setRestos(restos);
    }
    
    public void buildPontos(int pontos) {
        getCarta().setPontos(pontos);
    }
    
    public void buildProvisoes(int provisoes) {
        getCarta().setProvisoes(provisoes);
    }
    
    public void buildEfeitos(ArrayList<Efeito> efeitos) {
        getCarta().setEfeitos(efeitos);
    }

    public CartaProduct getCarta() {
        return this.carta;
    }
}
