/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Bartdroge
 */
public class GeneLezer{
    
    public static ArrayList<Gene> lijst;
    
    public static void main(String[] args) throws FileNotFoundException {
         try (Scanner scan = new Scanner(new File("C:\\Users\\Bartdroge\\Documents\\school\\Bioinformatica owe6\\Informatica\\Homo_sapiens.gene_info"))) {
            ArrayList<String> gene_ids = new ArrayList<>();
            ArrayList<String> symbols = new ArrayList<>();
            ArrayList<String> chromosome_map_locations = new ArrayList<>();
            
            ArrayList<Gene> genes = new ArrayList<Gene>();
            
             while(scan.hasNext()){
                String curLine = scan.nextLine();
                String[] splitted = curLine.split("\t");
                String geneID = splitted[1].trim();
                String Symbol = splitted[2].trim();
                String chromosome_map_location = splitted[7].trim();
                genes.add(new Gene(geneID,Symbol,chromosome_map_location));
                if(!"gene_id".equals(geneID)){
                    gene_ids.add(geneID);
                }
                if(!"symbol".equals(Symbol)){
                    symbols.add(Symbol);
                }
                if(!"chromosome map location".equals(chromosome_map_location)){
                    chromosome_map_locations.add(chromosome_map_location);
                }
            }
            Gene g1 = new Gene("123", "12345", "jjsk");
             System.out.println(genes.get(50).toString());
             Collections.sort(genes);
             System.out.println(genes);
    }
    
}

 
} 