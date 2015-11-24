/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraoo;

import java.io.IOException;

/**
 *
 * @author lgvalentin
 */
public class TelaImpl implements Tela {
    
    @Override
    public void showOp(DigitoOperador op)
    {
        System.out.printf("%c", (op.toChar));
    }
    
    @Override
    public void showDigit(DigitoNumerico digit)
	{
	System.out.printf("%d",(digit.toInt));        
    }
    
    @Override
    public void clear() throws IOException
	{
        Runtime.getRuntime().exec("clear");
    }

    void start() throws IOException {
	this.clear();
	System.out.printf("Tela iniciada!\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
