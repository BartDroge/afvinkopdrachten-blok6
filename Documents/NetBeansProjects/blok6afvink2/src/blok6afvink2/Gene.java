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
public class Gene implements Comparable<Gene> {
    public String gene_id;
    public String symbol;
    public String chromosome_map_location;
    
    Gene(String gene_id, String symbol, String chromosome_map_location){
        this.gene_id = gene_id;
        this.symbol = symbol;
        this.chromosome_map_location = chromosome_map_location;
    }
    
    public String getGene_id(){
        return gene_id;
    }
    
    public void setGene_id(String gene_id){
        this.gene_id = gene_id;
    }
    public String getSymbol(){
        return symbol;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    
    public String getChromosome_Map_Location(){
        return chromosome_map_location;
    }
    public void setChromosome_Map_Location(String chromosome_map_location){
        this.chromosome_map_location = chromosome_map_location;
    }
   
    @Override
    public String toString() {
		return "Gene [gene_id="+gene_id+",symbol=" + symbol + ", chromosome_map_location=" + chromosome_map_location + "]";
	}
  
       

    @Override
    public int compareTo(Gene o) {
       Gene g = (Gene) o;
        return this.chromosome_map_location.compareTo(g.chromosome_map_location);
    }
    
}

   