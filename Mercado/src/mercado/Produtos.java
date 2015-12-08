/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import static mercado.CategoriadeProduto.Cat1;
import static mercado.CategoriadeProduto.Cat2;

/**
 *
 * @author wagjub
 */

//Essa classe serve apenas para simular o banco de dados com dois elementos cadastrados
public class Produtos {
    
   /* Produto1(1, Cat1, "Marca1", "Nome1" ),
    Produto2(2, Cat2, "Marca2", "Nome2");*/
    
    public int id;
    public CategoriadeProduto categoria;
    public String marca;
    public String nome;

   /* private Produtos(int id, CategoriadeProduto categoria, String marca, String nome)
   {
       this.id = id;
       this.categoria = categoria;
       this.marca = marca;
       this.nome = nome;
   }*/
    
    
    
 /*   public Produtos ProdutoPorID(int id){
        
        switch (id){
            case 1:
                return Produto1;
            case 2:
                return Produto2;
        default:
        return null;
        }
    }*/
}
