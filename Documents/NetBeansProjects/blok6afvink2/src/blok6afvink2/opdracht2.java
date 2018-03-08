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
public class opdracht2 {

    public static void main(String[] args) {
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[val.length];

        System.out.println("Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3]
        );
        // Construeer een array voor twice
        for (int i = 0; i<val.length;i++){
            twice[i] = val[i]*2;
        }
        // Stop in twice de dubbele waardes van val
        System.out.println("New Array: "
                + twice[0] + " " + twice[1] + " " + twice[2] + " "
                + twice[3]);
    }
}


