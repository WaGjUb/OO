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

/*tanto a classe mercado quanto a cliente estariam tambem num banco de dados
mas criei a classe com essas caracteristicas para mostrar como funcionaria o cadastro de novos itens*/
public class Mercado {
  
        private final Contato contato;
        private final Estoque estoque;
    
        public Mercado (Contato contato, Estoque estoque) //aqui no caso pegariamos do banco de dados essas informações
        {
            this.contato = contato;
            this.estoque = estoque;
        }
        
        public Estoque getEstoque()
        {
            return(this.estoque);
        }
        
        

    }
    
