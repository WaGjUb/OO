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

/*tanto a classe mercado quanto a cliente estariam tambem num banco de dados
mas criei a classe com essas caracteristicas para mostrar como funcionaria o cadastro de novos itens*/
public class Mercado {
  
        private final Contato contato;
        private final Estoque estoque;
        private final TelaMercado tela;
        private final ArrayList<Pedido> pedidos;
    
        public Mercado (Contato contato, Estoque estoque) //aqui no caso pegariamos do banco de dados essas informações
        {
            this.contato = contato;
            this.estoque = estoque;
            this.tela = new TelaMercado();
            this.pedidos = new ArrayList<>();
            
        }
        
        public Estoque getEstoque()
        {
            return(this.estoque);
        }
        
        void novoPedido(Pedido p)
        {
            tela.novoPedido();
            tela.listaPedido(p.cliente.contato, p.carrinho); //passa o pedido pra tela
            //this.atualizaEstoque(p);
        }

    }
    
