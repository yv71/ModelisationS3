/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine;

import alamine.State.State_Taverne;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yv066840
 */
public class AlaMine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, InterruptedException {
        // TODO code application logic here
        Nain n = new Nain();
        Temps t = new Temps();
        t.resetHorloge();
        Lecteur.play("Ressources/DiggyDiggyHole.mp3", 20);        
        for(int i=0;i<(24*200*3);i++){
            n.getEtat().agir();
            /*System.out.println(t.toString());
            System.out.println(n.toString());
            if(i%(24*3)==0){
                System.out.println(n.getCptTaverne().toString("Taverne"));
                System.out.println(n.getCptMine().toString("Mine"));
            }*/
            n.setEtat(n.getEtat().transition());
            t.passeTranche();            
            //TimeUnit.MILLISECONDS.sleep((long) 1);
        }
        System.out.println(n.getCptTaverne().toString("Taverne"));
        System.out.println(n.getCptMine().toString("Mine"));
        System.out.println(State_Taverne.getMaxTav());
        Lecteur.stopAllAudio();
        
    }
    
}
