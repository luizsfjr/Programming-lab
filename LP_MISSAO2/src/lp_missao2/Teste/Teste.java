/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_missao2.Teste;

import lp_missao2.Litro;
import lp_missao2.LitroCheioException;

public class Teste {
    
    public static void main(String[] args) {
        
        Litro l1 = new Litro(5);
        try {
            l1.encher(2);
            l1.encher(6);
            l1.encher(10);
        } catch (LitroCheioException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
    
}
