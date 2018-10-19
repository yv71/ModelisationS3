/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine;

/**
 *
 * @author Damien
 */
public class Temps {
    private int jour;
    private int heure;
    private int minute;
    
    public Temps(){
        reset();
    }
    /**
     * Fait passer le temps de 20 minutes
     */
    public void passeTranche(){
        minute+=20;
        update();
    }
    /**
     * Actualise le temps et convertit les minutes/heures en heures/jours
     */
    private void update(){
        if(minute>=60){
            heure+=minute/60;
            minute=minute%60;
        }
        if(heure>=24){
            jour+=heure/24;
            heure=heure%24;
        }
    }
    /**
     * Passe tous les attributs à 0
     */
    public void reset(){
        jour=0;
        heure=0;
        minute=0;
    }
    /**
     * Passe les heures et les minutes à 0 et le jour à 1
     */
    public void resetHorloge(){
        jour=1;
        heure=0;
        minute=0;
    }
    public String toString(){
        return "Jour "+jour+" : "+heure+":"+minute;
    }
    /**
     * 
     * @param s Mine pour le cptMine et Taverne pour le cptTaverne
     * @return 
     */
    public String toString(String s){
        String res=null;
        if(s.equalsIgnoreCase("Mine")){
            res="Temps passé à la mine : ";
        }
        else if(s.equalsIgnoreCase("Taverne")){
            res="Temps passé à la taverne : ";
        }
        if(jour>0){
            res+=jour+" jour(s) "+heure+" heure(s) et "+minute+"minute(s)";
        }
        else if(heure>0){
            res+=heure+" heure(s) et "+minute+"minute(s)";
        }
        else if(minute>0){
            res+=minute+"minute(s)";
        }
        else{
            res+="Gimli est un nain capable";
        }
        return res;
    }
    
    public int getJour(){
        return this.jour;
    }
}
