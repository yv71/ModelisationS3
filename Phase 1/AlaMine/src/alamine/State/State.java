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
public abstract class State {
    
    private final int duree = 20;
    private Nain nain;
    
    public State(Nain n){
        this.nain = n;
    }
    public abstract State transition();
    public abstract void agir();
    public int getDuree(){
        return this.duree;
    }

    public Nain getNain() {
        return nain;
    }
    
    
    
}
