/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraoo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lgvalentin
 */
public class TecladoImpl implements Teclado {

    private CalculadoraOO calc;
    
	public TecladoImpl()

	{
         
	}

	private boolean isDigit(String c)
	{
          int aux;                
                try {
                    aux = Integer.parseInt(c);
                } catch (NumberFormatException e)
                {
                    return false;
                }
		for(DigitoNumerico digito : DigitoNumerico.values())
		{
			if (digito.toInt == aux)
			{
				return true;
			}
		}
	return false;
	}


	private boolean isOp(char c)
	{
               for (DigitoOperador d : DigitoOperador.values())
                {
                    if (d.toChar == c){
                  
				return true;
			}
                }
       	 
	return false;
	}

    @Override
	public void sendDigit(DigitoNumerico d) throws IOException
	{
		calc.newDigit(d);
        }
    @Override
	public void newOp(DigitoOperador dop)
	{
		calc.sendOp(dop);
	}

    @Override
	public void start(CalculadoraOO dono) throws IOException{
                calc = dono;
		Scanner reader = new Scanner(System.in); //cria o scan para leitura
    		while (dono != null)
		{     
			char c = (char)System.in.read();

			boolean dverific = false;
			boolean overific = false;

			dverific = this.isDigit(String.valueOf(c)); //corrigir
			overific = this.isOp(c); //corrigir

			if (dverific == true)
			{
    
				this.sendDigit(DigitoNumerico.D0.Conversao((int)Character.getNumericValue(c)));
				dverific = false;
			}
		
			if (overific == true)
			{
                               
                                
                                    this.newOp(DigitoOperador.D_SOMA.RetornaOperacao(c));
				overific = false;
			}
                        
                        if (c == '=')
                        {
                            calc.sendEqual();
                        }
		}
	}

}
