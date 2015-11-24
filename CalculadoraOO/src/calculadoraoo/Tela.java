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
public interface Tela {

    void clear() throws IOException;

    void showDigit(DigitoNumerico digit);

    void showOp(DigitoOperador op);
    
}
