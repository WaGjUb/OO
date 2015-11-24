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
    
    public DigitoNumerico Conversao(int val){
        switch (val){
            case 0:
                 return D0;
            case 1:
                return D1;
            case 2:
                return D2;
            case 3:
                return D3;
            case 4:
                 return D4;
            case 5:
                return D5;
            case 6:
                return D6;
            case 7:
                return D7;
            case 8:
                 return D8;
            case 9:
                return D9; 
        }
        return null;
    }
            
    
    
    
    
    
    
    
}
