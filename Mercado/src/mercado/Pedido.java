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
    
    private Carrinho car;
    public Cliente cliente;
    private Mercado mercado;
    private  boolean status;
    public Carrinho carrinho;
    
    public Pedido (Cliente cli, Mercado mercado)
    {
       this.car = new Carrinho();
       this.cliente = cli;
       this.mercado = mercado;
       this.status = false; //indica que nao foi finalizado
    }
    
    void AddProdutoCarrinho (ProdutoMercado prod)
    {
        this.car.addProduto(prod);
    }

    Carrinho getCarrinho()
    {
        return this.car;
    }
    
    Cliente getCliente()
    {
        return this.cliente;
    }
    
    void sendPedido()
    {
        this.status = true;
        mercado.novoPedido(this);
    }

    
            
    
    
}

