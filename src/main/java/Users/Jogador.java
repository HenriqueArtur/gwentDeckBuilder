/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author artur
 */
public class Jogador extends Usuario {
    
    public Jogador(String nome_usuario, String email, String senha) {
        super();
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.senha = senha;
    }

    public Jogador() {}
    
}
