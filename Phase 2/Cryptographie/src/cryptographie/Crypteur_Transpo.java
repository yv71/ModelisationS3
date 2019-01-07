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
    

    public Crypteur_Transpo(String cle) {
        this.cle = cle;
        this.nbColonnes=0;
        this.nbLignes=0;
        this.tableauCle=new char[cle.length()];
    }
    
    private void init(String chaine){
        String mot = chaine.replace(" ", "");
        this.nbLignes=mot.length()/cle.length();
        this.nbColonnes=cle.length();
        for(int i=0;i<nbColonnes;i++){
            tableauCle[i]=cle.charAt(i);
        }
    }
    
    public String cryptage(String chaine){
        String rez=null;
        init(chaine);
        //On rajoute la ligne incomplète qui n'est pas comptée
        if(chaine.length()%cle.length() != 0){
            nbLignes++;
        }
        int nb=0;
        char[][] tableauCodage = remplissage(chaine);
        for(int i=0;i<nbLignes;i++){
            for(int j=0;j<nbColonnes;j++){
                rez+=tableauCodage[traitementCle()[i]][j];
                nb++;
            }
        }
        return rez;
    }
    
    public String decryptage(String chaine){
        String rez=null;
        init(chaine);
        char[][] tableauDecodage = new char[nbLignes][nbColonnes];
        int nb=0;
        
        for(int num : traitementCle()){
            for(int i=0;i<nbLignes;i++){
                tableauDecodage[i][num]=chaine.charAt(i);
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
    
    private int[] traitementCle(){
        int[] res=null;
        for(int i=0;i<tableauCle.length;i++){
            char c = tableauCle[0];
            int num = 0;
            for(int j=1;j<tableauCle.length;j++){
                if(c>tableauCle[j]){
                    c=tableauCle[j];
                    num=j;
                }
            }
            tableauCle[num]=(char) 255;
            res[i]=num;
        }
        return res;
    }
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
}
