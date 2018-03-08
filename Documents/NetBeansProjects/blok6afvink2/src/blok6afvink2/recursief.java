/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink2;

/**
 *
 * @author Bartdroge
 */
public class recursief {
    
    
    public static void main(String[] args) {
        String input = "ATGCGA";
         String dna = recursie(input);
         
       
        
    }
    
    public static boolean recursie(String s){
        char dna = s.toUpperCase().charAt(0);
        
             if (dna == 'A' || dna == 'T' || dna == 'G' || dna == 'C') {
            return s.length() <=1;
        }
        return (recursie(s.substring(1)));
    }
}
    

