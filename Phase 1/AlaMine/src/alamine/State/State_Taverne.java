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
public class State_Taverne extends State{

    public State_Taverne(Nain n) {
        super(n);
    }

    @Override
    public State transition() {
        State retour = null;
        if (this.getNain().getTa()>=8){
            retour = new State_Dodo(this.getNain());
        }
        else if (this.getNain().taperTavernier()){
            retour = new State_Travail(this.getNain());
        }
        else{
            retour = new State_Taverne(this.getNain());
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().boirePintes(3);
        this.getNain().diminuerTaPause();
        this.getNain().getCptTaverne().passeTranche();
    }

    @Override
    public String toString() {
        return "Voici l'histoire d'un nain capable\n" +
        "De courir vite, et de voyager loin\n" +
        "Dans son épopée formidable,\n" +
        "Nous le suivrons, une bière à la main!";
    }

    
    
}
