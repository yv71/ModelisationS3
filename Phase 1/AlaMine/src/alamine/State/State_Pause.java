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
public class State_Pause extends State{

    public State_Pause(Nain n) {
        super(n);
    }

    @Override
    public State transition() {
        State retour = null;
        if (this.getNain().getTa() >= 8){
            retour = new State_Dodo(this.getNain());
        }
        else {
            retour = new State_Travail(this.getNain());
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().boirePinte();
        this.getNain().diminuerTaPause();
        this.getNain().getCptMine().passeTranche();
    }

    @Override
    public String toString() {
        return "J'ai un caillou dans ma botte et j'ai soif ! Tavernier ! Une bière !";
    }
    
}
