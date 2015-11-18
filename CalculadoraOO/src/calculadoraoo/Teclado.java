/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraoo;

/**
 *
 * @author lgvalentin
 */
public class Teclado {

	public Teclado()

	{

	}

	private boolean isDigit(char c)
	{
		for(DigitoNumerico digito : DigitoNumerico.values())
		{
			if (digito == c)
			{
				return true;
			}
		}
	return false;
	}


	private boolean isOp(char c)
	{
		for(DigitoOperador digito : DigitoOperador.values())
		{
			if (digito.ToChar == c)
			{
				return true;
			}
		}
	return false;
	}

	public void sendDigit(char val)
	{
		calc.newDigit(val);
	}

	public void sendOp(char val)
	{
		calc.newOp(val);
	}

	public void start(CalculadoraOO dono){
		Scanner reader = new Scanner(System.in); //cria o scan para leitura
		while (dono != null)
		{     
			char c = reader.next().charArt(0);

			boolean dverifc = false;
			boolean overific = false;

			dverifc = this.isDigit(c); //corrigir
			overific = this.isOp(c); //corrigir

			if ((overific == true) || (dverific == true))
			{
				this.sendDigit(c);
				dverific = false;
			}
		
			if (overific == true)
			{
				this.sendOp(c);
				overific = false;
			}
		}
	}

}
