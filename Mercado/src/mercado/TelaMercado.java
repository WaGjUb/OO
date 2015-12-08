/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.ArrayList;
import java.util.Iterator;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author wagjub
 */
public class TelaMercado{
    
  
   
    void novoPedido(){
        showMessageDialog(null, "Voce recebeu um novo pedido!");
    }
    
    void listaPedido(Contato c, Carrinho car){ /*OBSERVAÇÂO: essa classe nao deve acessar esses dados
                                 o objetivo foi apenas demontrar o processo de compra
                                 aqui a classe MERCADO que teria a responsabilidade extrair e de passar esses elementos para a tela
                                 */
       System.out.printf("Cliente:%s\nEmail: %s\n\nCidade: %s\nRua: %s\nNumero: %d\n\n", c.nome, c.email, c.endereco.cidade, c.endereco.rua, c.endereco.numero);
       System.out.printf("Produtos:\n");
       
     
       Produtos p;
     
        ArrayList<ProdutoMercado> produto = car.produtos;
       

            System.out.println("dois");
        }
    }
    

