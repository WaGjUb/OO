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
        
        Endereco e1 = new Endereco("São Paulo", "SP", "cambuci", "Professor Demostenes", 19);
        Endereco e2 = new Endereco("São Paulo", "SP", "cambuci", "Professor Demostenes", 18);
         
        Contato c1 = new Contato("Wagjub cliente", "wagjub@hotmail.com", e1);
        Contato c2 = new Contato("Rouney mercados", "rouney@hotmail.com", e2);
      
        Cliente cliente = new Cliente(c1);
        
        ProdutoMercado pm1 = new ProdutoMercado(1, CategoriadeProduto.Cat1, "Marca1", "Nome1" );
        ProdutoMercado pm2 = new ProdutoMercado(2, CategoriadeProduto.Cat2, "Marca2", "Nome2" );
 
        Estoque estoque = new Estoque(); //criando um novo estoque par ao mercado
        estoque.addProdutoEstoque(pm1, 5, (float) 20.25);
        estoque.addProdutoEstoque(pm2, 10, (float) 11.90);
        Mercado mercado = new Mercado(c2, estoque); //cria mercado
        
        Negociacao n = new Negociacao(cliente, mercado);
        
       
        car.addProduto(car, pm1);
        
 

        
        
        p.sendPedido();
        
        
        
    }
    
}
