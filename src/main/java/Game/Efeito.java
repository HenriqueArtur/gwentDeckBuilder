/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author artur
 */
public abstract class Efeito {
    private static int next_id = 1; 
    private final int id_efeito;
    private String descricao;

    public Efeito(String descricao) {
        this.id_efeito = next_id;
        this.descricao = descricao;
        next_id++;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_efeito() {
        return id_efeito;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public abstract void funcao();
}
