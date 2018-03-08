/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink4;

/**
 *
 * @author Bartdroge
 */
public class opdracht3 {
    
    public static void main(String[] args) {
        String dna = "tatgccaatgcatttttgcccgcatgaagcatgtagcgcgcatgcctacctgcacgc" ;
        char a = 'a';
        char c = 'c';
        char g = 'g';
        char t = 't';
        int acount = 0;
        int tcount = 0;
        int ccount = 0;
        int gcount = 0;
        
        
        for(int i =0; i<dna.length();i++){
            if(dna.charAt(i)==a){
                acount++;
                
            }
            if(dna.charAt(i)==c){
                ccount++;
            }
            if(dna.charAt(i)==g){
                gcount++;
            }
           if(dna.charAt(i)==t){
               tcount++;
           }
        }
        int totalcount = acount+ccount+gcount+tcount;
        System.out.println(totalcount);
    }
}
