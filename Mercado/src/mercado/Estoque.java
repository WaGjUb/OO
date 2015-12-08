/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.ArrayList;

/**
 *
 * @author wagjub
 */
public class Estoque {
    
    
    private final ArrayList<ProdutoMercado> produtos;
    private final ArrayList<Integer> quantidade;
    private final ArrayList<Float> preco;
    
    public Estoque(ArrayList<Produtos> produto)
    {
        this.preco = new ArrayList<>();
        this.quantidade = new ArrayList<>();
        this.produtos =  new ArrayList<>();            
    }

    
   void addProdutoEstoque(ProdutoMercado produto, int quantidade, float preco)
   {
       this.produtos.add(produto);
       this.quantidade.add(quantidade);
       this.preco.add(preco);
   }
   
   void corrigirPreco(ProdutoMercado produto, float Novopreco)
   {
        for (ProdutoMercado produto1 : this.produtos) {
            
        //atualiza o preço
            
        }
   }
   
   void corrigirQuantidade(ProdutoMercado produto, int NovaQuantidade)
   {
        for (ProdutoMercado produto1 : this.produtos) {
            
        //atualiza a quantidade
            
        }
   }
   
   }

    
