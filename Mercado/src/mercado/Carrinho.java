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

//acabado
public class Carrinho {
    
    public ArrayList<ProdutoMercado> produtos;
         
    public Carrinho()
            {
                this.produtos =  new ArrayList<ProdutoMercado>();
            }
    
   
    public float getBalanco()
    {
        return ((float)110.50);
    } 
    
    void addProduto(ProdutoMercado p)
    {
        this.produtos.add(p);
    }
    
     
}
