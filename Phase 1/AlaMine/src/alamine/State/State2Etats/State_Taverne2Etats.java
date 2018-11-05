/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine.State.State2Etats;

import alamine.Nain;
import alamine.State.State;

/**
 *
 * @author yv066840
 */
public class State_Taverne2Etats extends State{

    public State_Taverne2Etats(Nain n) {
        super(n);
    }

    @Override
    public State transition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agir() {
        this.getNain().getCptTaverne().passeTranche();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
