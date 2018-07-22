/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingskill;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProgrammingSkill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char last ='E', alphabet = 'A';
        for (int i = 1; i <= (last - 'A'+1); ++i) {
            
        for (int j = 1; j <= i; ++j) {
           System.out.print(alphabet+" "); 
        } ++ alphabet;
        System.out.println();   
        }
        
    }
}
