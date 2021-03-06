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
public enum DigitoOperador {
    D_SOMA('+', new OperacaoSoma()),
    D_SUBTRACAO('-', new OperacaoSubtracao()),
    D_DIVISAO('/', new OperacaoDivisao()),
    D_MULTIPLICACAO('*', new OperacaoMultiplicacao());
    
    public Operacao operacao;
	public char toChar;
    
    private DigitoOperador(char c, Operacao op){
	this.toChar = c;
        this.operacao = op;
    }
    
    public DigitoOperador RetornaOperacao(char c)
    {
        switch (c)
                {
            case '+':
                return(D_SOMA);
            case '-':
                return(D_SUBTRACAO);
            case '/':
                    return(D_DIVISAO);
            case '*':
                return(D_MULTIPLICACAO);
            default:
                return(null);
        }
    }
}
