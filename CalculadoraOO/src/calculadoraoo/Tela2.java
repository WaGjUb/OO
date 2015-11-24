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
public class Tela2 extends Tela{
    
    @Override
    public void showDigit(DigitoNumerico digit)
	{
		char charprint;
	charprint = (char)(digit.toInt + '0');
	      Printchar(charprint);
    }
   
	public void Printchar(char c)
	{
		System.out.printf("%c",(c));
	} 

    @Override
    public void clear()
	{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Override
    void start() {
	this.clear();
	System.out.printf("Tela iniciada!,\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
