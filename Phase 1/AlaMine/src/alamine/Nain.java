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
    private double TaMax;
    private Temps cptMine;
    private Temps cptTaverne;
    private Temps cptDodo;
    
    public Nain(){
        Ta = 0;
        nom = "Gimli";
        this.poids = 102;
        this.etat = new State_Travail(this);
        this.cptMine = new Temps();
        this.cptTaverne = new Temps();
        this.cptDodo = new Temps();
        TaMax=0;
    }
    /**
     * Fait boire une pinte au nain
     */
    public void boirePinte(){
        Ta += ((500*0.06*0.8)/(0.7*poids));
    }
    /**
     * Fait boire nb pinte(s) au nain
     * @param nb Le nombre de pintes
     */
    public void boirePintes(int nb){
        Pinte p = new Pinte();
        Ta += nb * ((p.getVolume()*p.getDegre()*0.8)/(0.7*poids));
    }
    /**
     * Fait redescendre l'alcoolémie durant le travail
     */
    public void diminuerTaTravail(){
        if (this.Ta-dT<0){
            Ta = 0;
        }
        else {
            Ta -= dT;
        }
    }
    /**
     * Fait redescendre l'alcoolémie en dehors du travail
     */
    public void diminuerTaPause(){
        if (this.Ta-dA<0){
            Ta = 0;
        }
        else {
            Ta -= dA;
        }
    }
    /**
     * Reset l'alcoolémie
     */
    public void dodo(){
        if (Ta>TaMax){
            TaMax=Ta;
        }
        this.Ta = 0;
    }
    /**
     * La vie des nains est dure et les pioches peuvent casser 
     * @return Si le nain casse sa pioche ou non
     */
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
    /**
     * Le travail ca fatigue, direction la taverne
     * @return Si le nain arrive à échapper aux gardes et aller à la taverne
     */
    public boolean fuiteTaverne(){
        boolean res = false;
        Random r = new Random();
        int rand = r.nextInt();
        if(rand>=60){
            res=true;
        }
        return res;
    }
    /**
     * Le travail d'un tavernier est de servir des pintes et des pains
     * @return Si le nain se bat avec le tavernier
     */
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
    /**
     * Un nain sobre n'est pas un vrai nain
     * @return L'alcoolémie
     */
    public double getTa() {
        return Ta;
    }
    
    public String getNom() {
        return nom;
    }
    /**
     * A votre discrétion messire
     * @return Le poids
     */
    public int getPoids() {
        return poids;
    }
    /**
     * Ou suis-je ?
     * @return L'état de l'automate
     */
    public State getEtat() {
        return etat;
    }

    public void setEtat(State etat) {
        this.etat = etat;
    }

    public Temps getCptMine() {
        return cptMine;
    }

    public Temps getCptTaverne() {
        return cptTaverne;
    }
    
    public String toString(){
        return this.getNom()+" :\t\""+this.getEtat().toString()+"\"";
    }

    public double getTaMax() {
        return TaMax;
    }

    public Temps getCptDodo() {
        return cptDodo;
    }
    
    
}
