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
public class OperacaoMultiplicacao implements Operacao {

    @Override
    public float operate(float operand1, float operand2) {

        return operand1 * operand2;
    }

}
