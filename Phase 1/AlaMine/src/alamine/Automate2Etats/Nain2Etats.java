/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine.Automate2Etats;

import alamine.Nain;
import alamine.State.State2Etats.State_Mine;

/**
 *
 * @author yv066840
 */
public class Nain2Etats extends Nain{

    
    public Nain2Etats() {
        super();
        this.setEtat(new State_Mine(this));
    }
}
