/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

/**
 *
 * @author wagjub
 */
public class Contato {
    
    Contato(String nome, String email, Endereco endereco)
    {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    
    private final String nome;
    private final String email;
    private final Endereco endereco;

    Contato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

