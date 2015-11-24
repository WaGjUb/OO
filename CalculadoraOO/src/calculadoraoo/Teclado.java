/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraoo;

import java.io.IOException;

/**
 *
 * @author WaGjUb
 */
public interface Teclado {

    void newOp(DigitoOperador dop);

    void sendDigit(DigitoNumerico d) throws IOException;

    void start(CalculadoraOO dono) throws IOException;
    
}
