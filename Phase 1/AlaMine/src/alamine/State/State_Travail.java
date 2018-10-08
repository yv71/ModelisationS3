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
public class State_Travail extends State{

    public State_Travail(Nain nain) {
        super(nain);
    }

    @Override
    public State transition() {
        State retour = null;
        if (this.getNain().cassePioche()){
            retour = new State_Forge(this.getNain());
        }
        else {
            retour = new State_Pause(this.getNain());
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().diminuerTaTravail();
    }
    
}
