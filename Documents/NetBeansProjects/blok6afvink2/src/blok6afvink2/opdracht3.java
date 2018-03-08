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
public class opdracht3 {

    public static void main(String[] args) {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = {0, 0, 0, 0};
        
        for(int i=0;  i< valA.length;i++){
            sum[i] = valA[i]+valB[i];
        
    }

        // Schrijf de code om de optelling van A en B
        // uit te voeren en de resultante in sum te plaatsen
        System.out.println("sum: "
                + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]
        );
    }
}
