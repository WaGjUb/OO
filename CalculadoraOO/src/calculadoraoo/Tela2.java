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
public class Tela {
    
    public void showDigit(DigitoNumerico digit)
	{
		char charprint;
	charprint = digit.ToString;
	      Printchar(charprint);
    }
   
	public void Printchar(char c)
	{
		System.out.printf("%c",(c));
	} 

    public void clear()
	{
        Runtime.getRuntime().exec("clear");
    }

    void start() {
	this.clear();
	System.out.printf("Tela iniciada!\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
