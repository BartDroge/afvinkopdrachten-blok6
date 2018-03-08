/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink5;

import java.util.HashSet;

/**
 *
 * @author Bartdroge
 */
public class Blok6afvink5 {
    
    public static String hallo(int optie,String veld1, String veld2, String veld3){
        
        HashSet set1 = toSet(veld1);
        HashSet set2 = toSet(veld2);
        HashSet set3 = toSet(veld3);
        HashSet output = null;
        
        switch(optie){
            case 0:
                output = intersect(set1,set2);
                output = intersect(output,set3);
                break;                
            case 1:
                output = intersect(set1,set2);
                break;
            case 2:
                output = intersect(set2,set3);
                break;
                
            case 3:
                output = intersect(set1,set3);
                break;
        }
        return toString(output);
    }
    
    public static HashSet toSet(String tekst){
        
        HashSet set = new HashSet();
        for(String s : tekst.split("\n")){
            set.add(s);
            
        }
        return set;
    }  
    public static HashSet intersect(HashSet a, HashSet b){
        HashSet c = new HashSet(a);
        c.retainAll(b);
        return c;
    
        
    }
    public static String toString(HashSet a){
        String output = "";
        
        for(Object s: a.toArray()){
            output+= s+"\n";
            
        }
        return output;
        
    }
    
    
}
