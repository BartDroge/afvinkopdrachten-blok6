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
public class iteratief {
    
    public static void main(String[] args) {
        
        String dna = "TCGBGCTATATCG";
        
        System.out.println(hallo(dna));
        System.out.println(isDNA(dna));
        
        
    }
    
    
    public static boolean hallo(String dna) {
        
       
         
        Boolean result = false;
        for (int i=0; i <dna.length();i++){
            if (dna.charAt(i)=='A' || dna.charAt(i)=='T' || dna.charAt(i)=='C' || dna.charAt(i)=='G'){
                result = true;
            }
            else{
                return false;
            }
        }
        return true;
    }
    

    public static boolean isDNA(String s) {
        System.out.println(s);
        char c = s.toUpperCase().charAt(0); //Bepaal of eerste karakter een DNA nucleotide is
        if (c == 'A' || c == 'T' || c == 'G' || c == 'C') {
            if (s.length() <= 1) {
                return true;
            }
        } else {
            return false;
        }
        return (isDNA(s.substring(1))); //Retourneer een call aan isDNA met alle nucleotiden min de eerste

    }
}
        
        
    

