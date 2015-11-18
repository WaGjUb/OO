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
	System.out.printf("%d",(digit));        
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
