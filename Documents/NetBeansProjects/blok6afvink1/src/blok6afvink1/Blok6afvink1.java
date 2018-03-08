/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink1;

import java.util.Random;

/**
 *
 * @author Bartdroge
 * 
 * antwoorden op de vragen:
 * a = O(n) 1 vergelijking
 * b = O(n^2) 2 vergelijkingen
 * c = O(n^3) 3 vergelijkingen
 * d = O(n) 2 losse for loops
 * e = O(n^2) nested for loops. 2 vergelijkingen
 * f = O(n)
 * g = O(log(n))
 * h = O(n!)
 * i = O(n)
 */
public class Blok6afvink1 {
     static void bubbleSort(int[] ar1) {  
        int n = ar1.length;
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(ar1[j-1] > ar1[j]){  
                                 //swap elements  
                                 temp = ar1[j-1];  
                                 ar1[j-1] = ar1[j];  
                                 ar1[j] = temp;  
                         }  
                          
                 }  
         } 
    } 
  
    public static void main(String[] args) {    
        
        Random r = new Random();
        int[] ar1 = new int[2000];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
        
        }
        //System.out.println("Array Before Bubble Sort");  
           //     for(int i=0; i < ar1.length; i++){  
             //           System.out.print(ar1[i] + " ");  
               // }  
        //System.out.println("");
        
        
        bubbleSort(ar1);
        //System.out.println("Array after using Bubble Sort");
         // for(int i=0; i < ar1.length; i++){  
           //             System.out.print(ar1[i] + " ");  
             //   }  
        
        
    }
   
}