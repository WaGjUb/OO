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
public class CalculadoraOO {
    public CalculadoraOO(Teclado teclado, Tela2 tela){
        this.tela = tela;
        this.teclado = teclado;
    }
    
    private Tela tela;
    private Teclado teclado;
    
    private DigitoNumerico[] operando1= new DigitoNumerico[10];
    private byte operando1Count = 0;
       
    private DigitoNumerico[] operando2= new DigitoNumerico[10];
    private byte operando2Count = 0;
    
    private DigitoOperador operador = null;

public void resetCalc() throws IOException
{
	operando2Count = 0;
	operando1Count = 0;
	operador = null;
}

    public void newDigit(DigitoNumerico digit) throws IOException {
  
        if(operador == null){
           operando1[operando1Count++] = digit;
           if (operando1Count == 1)
           {
               this.tela.clear();
           }
        }else{
            if(operando2Count == 0){
                this.tela.clear();
                
            operando2[operando2Count++] = digit;
        }
	else
	{
                operando2[operando2Count++] = digit;
	}
            
        }
        this.tela.showDigit(digit);
        
    }
    
    public void sendEqual() throws IOException
    {
        sendReturn();
        this.resetCalc();
    }
    
    public void sendOp(DigitoOperador operador){
        this.operador = operador;
        this.tela.showOp(operador);
        
    }

    public void sendReturn() throws IOException{
          this.tela.clear();
        float op1 = 0;
        for(int i = 0; i < operando1Count; i++)
	{
            op1 += Math.pow(10,(operando1Count-1-i)) * operando1[i].toInt;
        }
	
	float op2 = 0;
	for (int j = 0; j < operando2Count; j++)
	{
		op2 += Math.pow(10,(operando2Count-1-j)) * operando2[j].toInt;
	}
	
	float result = this.operador.operacao.operate(op1,op2);
        int aux;
        int i;
        
	while (Math.round(result) != 0)
	{
            i = 0;
            while (Math.pow(10,i) < Math.round(result))
            {
                i++;
            }
        i--;   
            aux = ((int)Math.round(result)/(int)Math.pow(10, i));
             
            
               this.tela.showDigit(DigitoNumerico.D0.Conversao(aux));
		result = (float)((int)Math.round(result) - (aux*(int)Math.pow(10, i)));
	}	
    }
    
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        CalculadoraOO cal1 = new CalculadoraOO(new Teclado(), new Tela2());
        
        cal1.start();
        
    }

    private void start() throws IOException {
        this.tela.start();
        this.teclado.start(this);
    }
    
}
