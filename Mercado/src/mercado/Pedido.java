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
public class Pedido {
    
    private final Carrinho car;
    private final Cliente cliente;
    private final Mercado mercado;
    
    public Pedido (Cliente cli, Mercado mercado)
    {
       this.car = new Carrinho();
       this.cliente = cli;
       this.mercado = mercado;
    }
    
    

    Carrinho getCarrinho()
    {
        return this.carrinho;
    }
    
    void sendPedido()
    {
        
    }
    
            
    
    
}

