/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink6;

/**
 *
 * @author Bartdroge
 */
public class Gen {
    
    private String header;
    private String sequentie;

    public Gen(String header, String sequentie) {
        this.header = header;
        this.sequentie = sequentie;
    }

    public String getHeader() {
        return header;
    }

    public String getSequentie() {
        return sequentie;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setSequentie(String sequentie) {
        this.sequentie = sequentie;
    }

    @Override
    public String toString() {
        return "Gen{" + "header=" + header + ", sequentie=" + sequentie + '}';
    }
    
    
    
}
