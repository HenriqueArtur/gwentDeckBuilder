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
    private int id_efeito;
    private String descricao;

    public Efeito(String descricao) {
        this.descricao = descricao;
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
