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

public void resetCalc()
{
	this.tela.clear();
	operando2Count = 0;
	operando1Count = 0;
	operador = null;
}
    public void newDigit(DigitoNumerico digit){
        if(operador == null){
            operando1[operando1Count++] = digit;
        }else{
            if(operando2Count == 0)
                this.tela.clear();
                
            operando2[operando2Count++] = digit;
        }
	else
	{
		resetCalc();
	}
        
        this.tela.showDigit(digit);
        
    }
    
    public void sendOp(DigitoOperador operador){
        this.operador = operador;
    }

    public void sendReturn(){

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
	
	int result = this.operador.operacao.operate(op1,op2);
	
	while (result != 0)
	{
		this.tela.showDigit(result%10);
		result /= 10;
	}	
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraOO cal1 = new CalculadoraOO(new Teclado(), new Tela());
        
        cal1.start();
        
    }

    private void start() {
        this.tela.start();
        this.teclado.start(this);
    }
    
}
