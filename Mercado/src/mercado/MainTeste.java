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
public class MainTeste {
    
     public static void main(String[] args) {
        
        Endereco e1 = new Endereco("São Paulo", "SP", "cambuci", "Professor Demostenes", 19); //endereço cliente
        Endereco e2 = new Endereco("São Paulo", "SP", "cambuci", "Professor Demostenes", 18); //endereço mercado
         
        Contato c1 = new Contato("Wagjub cliente", "wagjub@hotmail.com", e1); //contato cliente
        Contato c2 = new Contato("Rouney mercados", "rouney@hotmail.com", e2); //contato mercado
      
        Cliente cliente = new Cliente(c1); //cria cliente com contato c1
        
        ProdutoMercado pm1 = new ProdutoMercado(1, CategoriadeProduto.Cat1, "Marca1", "Nome1" ); //cria prod1
        ProdutoMercado pm2 = new ProdutoMercado(2, CategoriadeProduto.Cat2, "Marca2", "Nome2" ); //cria prod2
 
        Estoque estoque = new Estoque(); //criando um novo estoque par ao mercado
        estoque.addProdutoEstoque(pm1, 5, (float) 20.25); //add pm1 no estoque
        estoque.addProdutoEstoque(pm2, 10, (float) 11.90); //add pm2 no estoque
        Mercado mercado = new Mercado(c2, estoque); //cria mercado
        
        Negociacao n = new Negociacao(cliente, mercado); //aqui eu crio uma negociação e faço uma compra
        n.addProduto(pm1); //add pm1 no carrinho
        n.addProduto(pm2); //add pm2 no carrinho
        n.finalizarCompra();    //finaliza compra
    }
    
}
