/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine;

/**
 *
 * @author yv066840
 */
public class AlaMine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nain n = new Nain();
        boolean b = true;
        while(b){
            n.getEtat().agir();
            System.out.println(n.getNom()+"\t"+n.getEtat().toString());
            n.setEtat(n.getEtat().transition());
        }
    }
    
}
