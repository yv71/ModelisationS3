/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine;

import alamine.State.State;
import alamine.State.State_Travail;
import java.util.Random;

/**
 *
 * @author yv066840
 */
public class Nain {
    private double Ta;
    private String nom;
    private final int poids;
    private State etat;
    private final static double dT = 0.15; //Diminution du taux d'alcool quand il travaille 
    private final static double dA = 0.10; //Diminution du taux d'alcool quand il ne travaille pas
    
    public Nain(){
        Ta = 0;
        nom = "Gimli";
        this.poids = 102;
        this.etat = new State_Travail(this);
    }
    
    public void boirePinte(){
        Ta += ((500*0.06*0.8)/(0.7*poids));
    }
    
    public void boirePintes(int nb){
        Ta += nb * ((500*0.06*0.8)/(0.7*poids));
    }

    public void diminuerTaTravail(){
        if (this.Ta-dT<0){
            Ta = 0;
        }
        else {
            Ta -= dT;
        }
    }
    
    public void diminuerTaPause(){
        if (this.Ta-dA<0){
            Ta = 0;
        }
        else {
            Ta -= dA;
        }
    }
    
    public void dodo(){
        this.Ta = 0;
    }
    
    public boolean cassePioche(){
        boolean res = false;
        double prob;
        prob=0.1+(0.05*this.getTa());
        Random r = new Random();
        double proba = r.nextDouble();
        if (prob > proba){
            res = true;
        }
        return res;
    }
    
    public boolean fuiteTaverne(){
        boolean res = false;
        Random r = new Random();
        int rand = r.nextInt();
        if(rand>=60){
            res=true;
        }
        return res;
    }
    
    public boolean taperTavernier(){
        boolean res = false;
        double prob = 0.05+(0.15*this.getTa());
        Random r = new Random();
        double proba = r.nextDouble();
        if (prob > proba){
            res = true;
        }
        return res;
    }
    
    public double getTa() {
        return Ta;
    }

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }

    public State getEtat() {
        return etat;
    }

    public void setEtat(State etat) {
        this.etat = etat;
    }
    
    
}
