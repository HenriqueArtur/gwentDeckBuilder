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
public class CartaProduct {
    private static int next_id_carta = 1;
    private int id_carta;
    private String titulo;
    private String descricao;
    private String faccao;
    private String raridade;
    private String hierarquia;
    private String arte;
    private int restos;
    private int pontos;
    private int provisoes;
    private ArrayList<Efeito> efeitos;

    public CartaProduct() {
        this.id_carta = next_id_carta;
        next_id_carta++;
    }

    // GETS
    public int getId_carta() {
        return id_carta;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFaccao() {
        return faccao;
    }

    public String getRaridade() {
        return raridade;
    }

    public String getHierarquia() {
        return hierarquia;
    }

    public String getArte() {
        return arte;
    }

    public int getRestos() {
        return restos;
    }

    public int getPontos() {
        return pontos;
    }

    public int getProvisoes() {
        return provisoes;
    }

    public ArrayList<Efeito> getEfeitos() {
        return efeitos;
    }

    public static int getNext_id_carta() {
        return next_id_carta;
    }
    
    
    // SETs
    public void setId(int id_carta) {
        this.id_carta = id_carta;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFaccao(String faccao) {
        this.faccao = faccao;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    public void setRestos(int restos) {
        this.restos = restos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setProvisoes(int provisoes) {
        this.provisoes = provisoes;
    }

    public void setEfeitos(ArrayList<Efeito> efeitos) {
        this.efeitos = efeitos;
    }

    public static void setNext_id_carta(int next_id_carta) {
        CartaProduct.next_id_carta = next_id_carta;
    }
    
}
