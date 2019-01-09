/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie;

import java.util.Random;

/**
 *
 * @author dj715494
 */
public class Crypteur_Transpo {
    private String cle;
    
    private int nbLignes;
    private int nbColonnes;
    private char[] tableauCle;
    private String mot;
    

    public Crypteur_Transpo(String cle) {
        this.cle = cle;
        this.nbColonnes=0;
        this.nbLignes=0;
        this.tableauCle=new char[cle.length()];
    }
    
    private void init(String chaine){
        mot = chaine.replace(" ", "");
        this.nbLignes=mot.length()/cle.length();
        this.nbColonnes=cle.length();
        for(int i=0;i<nbColonnes;i++){
            tableauCle[i]=cle.charAt(i);
        }
    }
    
    public String cryptage(String chaine){
        String rez="";
        init(chaine);
        //On rajoute la ligne incomplète qui n'est pas comptée
        if(mot.length()%cle.length() != 0){
            nbLignes++;
        }
        char[][] tableauCodage = new char[nbLignes][nbColonnes];
        tableauCodage = remplissage(mot);
        int[] tableau = traitement();
        for(int i=0;i<nbColonnes;i++){
            for(int j=0;j<nbLignes;j++){
                rez+=tableauCodage[j][tableau[i]];
            }
        }
        return rez;
    }
    
    public String decryptage(String chaine){
        String rez="";
        init(chaine);
        char[][] tableauDecodage = new char[nbLignes][nbColonnes];
        int nb=0;
        
        for(int num : traitement()){
            for(int i=0;i<nbLignes;i++){
                tableauDecodage[i][num]=mot.charAt(nb);
                nb++;
            }
        }
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                rez+=tableauDecodage[i][j];
            }
        }
        return rez;
    }
    /**
     * complete la chaine pour que le tableau 2 dimensions n'ai pas de case vide
     * @param chaine
     * @return 
     */
    private char[][] remplissage(String chaine){
        char[][] tableauCodage = new char[nbLignes][nbColonnes];
        int nb=0;
        
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                if(nb<chaine.length()){
                    tableauCodage[i][j]=chaine.charAt(nb);
                    nb++;
                }
                else{
                    Random r = new Random();
                    int valeur = 65+r.nextInt(90-65);
                    tableauCodage[i][j]=(char) valeur;
                }
            }
        }
        return tableauCodage;
    }
    /**
     * donne l'ordre des colonnes à traiter
     * @return 
     */
    private int[] traitement(){
        int nb=-1;
        int[] rez = new int[cle.length()];
        for(int i=0;i<cle.length();i++){
            char c = tableauCle[0];
            for(int j=0;j<cle.length();j++){
                if(c>tableauCle[j]){
                    c=tableauCle[j];
                }
            }
            for(int j=0;j<cle.length();j++){
                if(c==tableauCle[j]){
                    nb=j;
                }
            }
            tableauCle[nb]=(char) 255;
            rez[i]=nb;
        }
        return rez;
    }
}
