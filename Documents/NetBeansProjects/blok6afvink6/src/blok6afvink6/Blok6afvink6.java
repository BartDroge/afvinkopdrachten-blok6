/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bartdroge
 */
public class Blok6afvink6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String pad = "resource/dataSet.txt";

        try {
            List<Gen> lijst = readFile(pad);
            System.out.println(lijst);
            
            for(Gen a : lijst){
                for(Gen b: lijst){
                    
                    String links = a.getSequentie();
                    links = links.substring(links.length()-3);
                    String rechts = b.getSequentie().substring(0,3);
                    
                    if(a != b && links.equals(rechts)){
                        System.out.println(a.getHeader() +"\t"  +b.getHeader());
                    }   
                }
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Blok6afvink6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Gen> readFile(String pad) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(pad));

        String header = br.readLine();
        String regel = br.readLine();
        String seq = "";
        ArrayList<Gen> lijst = new ArrayList<>();

        while (regel != null) {
            if (regel.startsWith(">")) {

                Gen temp = new Gen(header, seq);
                lijst.add(temp);
                header = regel.trim().substring(1);
                seq = "";

            } else {
                seq += regel.trim();
            }
            regel = br.readLine();

        }
        lijst.add(new Gen(header,seq));
        return lijst;
    }

}
