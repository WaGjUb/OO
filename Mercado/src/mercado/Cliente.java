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

//acabado;
public class Cliente {
    
    private Contato contato;
        
    public Cliente(Contato contato){
        this.contato = contato;
    }
    

    Contato getContato()
    {
        return this.contato;
    }
    
}