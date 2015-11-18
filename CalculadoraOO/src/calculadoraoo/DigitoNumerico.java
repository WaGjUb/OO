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
public enum DigitoNumerico {
    D1(1, "um"),
    D2(2, "dois"),
    D3(3, "três"),
    D4(4, "quatro"),
    D5(5, "cinco"),
    D6(6, "seis"),
    D7(7, "sete"),
    D8(8, "oito"),
    D9(9, "nove"),
    D0(0, "Zero");
    
    public int toInt;
    public String toString;

    private DigitoNumerico(int dig, String name) {
        this.toInt = dig;
        this.toString = name;
    }
    
    
    
    
    
    
    
}
