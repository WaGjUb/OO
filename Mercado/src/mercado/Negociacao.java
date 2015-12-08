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

//essa classe é basicamente um gerenciador de transações
 
public class Negociacao {
    
    public Cliente cliente;
    public Mercado mercado;
    public Pedido p;
    
    Negociacao(Cliente c, Mercado m)
    {
        this.cliente = c;
        this.mercado = m;
        p = new Pedido(cliente, mercado);
         
    }
    
    void addProduto(ProdutoMercado produto)
    {
        p.AddProdutoCarrinho(produto);
    }
    
    
   void finalizarCompra()
    {
        //criar metodo que muda a interface para que o usuario nao possa add ou remover mais nada
        p.sendPedido();
        
        
        
    }
    
    void listarMercados()
    {
        
    }
    
    void listarProdutos()
    {
        
    }
    
    void setMercado()
    {
        
    }
    
    
    
    
    
   
    
}
