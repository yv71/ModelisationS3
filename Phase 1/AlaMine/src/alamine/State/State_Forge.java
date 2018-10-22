/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine.State;

import alamine.Nain;

/**
 *
 * @author yv066840
 */
public class State_Forge extends State{

    public State_Forge(Nain n) {
        super(n);
    }

    @Override
    public State transition() {
        State retour = null;
        if (this.getNain().fuiteTaverne()){
            retour = new State_Taverne(this.getNain());
        }
        else {
            retour = new State_Travail(this.getNain());
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().diminuerTaPause();
        this.getNain().getCptForge().passeTranche();
    }

    @Override
    public String toString() {
        return "Un nain sans pioche, c'est comme une bière sans alcool";
    }
    
}
