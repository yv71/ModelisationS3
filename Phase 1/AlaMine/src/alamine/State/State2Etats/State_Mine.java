/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine.State.State2Etats;

import alamine.Nain;
import alamine.State.State;
import java.util.Random;

/**
 *
 * @author yv066840
 */
public class State_Mine extends State {

    
    public State_Mine(Nain n) {
        super(n);
    }


    @Override
    public State transition() {
        Random r = new Random();
        double d = r.nextDouble();
        State retour = new State_Mine(this.getNain());
        if(d<=0.08){
            retour = new State_Taverne2Etats(this.getNain());
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().getCptMine().passeTranche();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
