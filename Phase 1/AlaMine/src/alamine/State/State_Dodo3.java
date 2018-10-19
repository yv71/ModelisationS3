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
public class State_Dodo3 extends State{

    public State_Dodo3(Nain n) {
        super(n);
    }

    @Override
    public State transition() {       
        return new State_Travail(this.getNain());
    }

    @Override
    public void agir() {
        this.getNain().getCptMine().passeTranche();
    }

    @Override
    public String toString() {
        return "Rrrhh! Ah j'ai bien pioncé !";
    }
    
}
