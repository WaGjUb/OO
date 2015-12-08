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
    
    private final ArrayList<Produtos> produtos;
         
    public Carrinho()
            {
                this.produtos = new ArrayList<>();
            }
    
   
    public float getBalanco()
    {
        return ((float)110.50);
    } 
    
    void addProduto(Carrinho c, Produtos p)
    {
        c.produtos.add(p);
    }
    
    
     
}
