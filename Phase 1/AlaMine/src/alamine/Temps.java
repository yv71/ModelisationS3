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
    private static int jour;
    private static int heure;
    private static int minute;
    
    public Temps(){
        reset();
    }
    public void passeTranche(){
        minute+=20;
        update();
    }
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
    public void reset(){
        jour=1;
        heure=0;
        minute=0;
    }
    public String toString(){
        return "Jour "+jour+" : "+heure+":"+minute;
    }
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
}
