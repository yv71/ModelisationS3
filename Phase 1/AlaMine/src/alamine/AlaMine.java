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
        Temps t = new Temps();
        t.resetHorloge();
        for(int i=0;i<(24*3);i++){
            n.getEtat().agir();
            
            System.out.println(t.toString());
            System.out.println(n.toString());
            System.out.println(n.getCptTaverne().toString("Taverne"));
            
            n.setEtat(n.getEtat().transition());
            t.passeTranche();
            
        }
    }
    
}
