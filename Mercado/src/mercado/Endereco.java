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
public class Endereco {
    
    public Endereco(String estado, String cidade, String bairro, String rua, int numero)
    {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
    // protegido para exibiçao na tela
    protected final String estado;
    protected final String cidade;
    protected final String bairro;
    protected final String rua;
    protected final int numero;

    Endereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
