/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink4;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author Bartdroge
 */
public class Blok6afvink4 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new Blok6afvink4();
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tree");
        frame.setContentPane(new Boom());
        frame.setVisible(true);
        
        
        // TODO code application logic here
    }
    
}

class Boom extends JTree{
    private DefaultTreeModel treeModel;
    
    public Boom(){
        DefaultMutableTreeNode derdeJaar, stage,nederland,nijmegen,umc,uni,wageningen,wur,keyGene,geneTwister,utrecht,buitenland,europa,minor,han,andere,master;
        
        
        derdeJaar = new DefaultMutableTreeNode("Derde Jaar");
        stage = new DefaultMutableTreeNode("Stage");
        nederland = new DefaultMutableTreeNode("Nederland");
        nijmegen = new DefaultMutableTreeNode("Nijmegen");
        umc = new DefaultMutableTreeNode("Radboud UMC");
        uni = new DefaultMutableTreeNode("Radboud uni");
        wageningen = new DefaultMutableTreeNode("Wageningen");
        wur = new DefaultMutableTreeNode("WUR");
        keyGene=new DefaultMutableTreeNode("KeyGene");
        geneTwister = new DefaultMutableTreeNode("GeneTwister");
        utrecht = new DefaultMutableTreeNode("Utrecht");
        buitenland = new DefaultMutableTreeNode("Buitenland");
        europa = new DefaultMutableTreeNode("Europa");
        minor = new DefaultMutableTreeNode("Minor");
        han = new DefaultMutableTreeNode("HAN");
        andere = new DefaultMutableTreeNode("Andere Hogeschool");
        master = new DefaultMutableTreeNode("Master");
        
       derdeJaar.add(stage);
       derdeJaar.add(minor);
       stage.add(nederland);
       stage.add(buitenland);
       nederland.add(nijmegen);
       nijmegen.add(umc);
       nijmegen.add(uni);
       nederland.add(wageningen);
       nederland.add(utrecht);
       wageningen.add(wur);
       wageningen.add(keyGene);
       wageningen.add(geneTwister);
       buitenland.add(europa);
       minor.add(han);
       minor.add(andere);
       minor.add(master);
       
       treeModel = new DefaultTreeModel(derdeJaar);
       setModel(treeModel);
       
    }
    
}