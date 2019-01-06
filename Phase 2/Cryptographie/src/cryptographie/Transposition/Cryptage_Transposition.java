/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie.Transposition;

import java.util.Random;

/**
 *
 * @author yv066840
 */
public class Cryptage_Transposition {
    private String cle;
    private String mot;

    public Cryptage_Transposition(String cle, String mot) {
        this.cle = cle;
        this.mot = mot.replace(" ", "");
    }
    
    public String crypte(){
        int nbCharPlus = 0;
        int nbLignes = (mot.length()/cle.length());
        if (mot.length()%cle.length() != 0){
            nbCharPlus = cle.length() - (mot.length()%cle.length());
            nbLignes++;
        }
        int nbCharTotal = nbCharPlus+ mot.length();
        
        char[][] tableauCodage = new char[cle.length()][nbLignes];   
        int aled =0;
        for(int i = 0; i < nbLignes; i++){
            for (int j= 0; j <cle.length(); j++){
                if (aled < mot.length()){
                    tableauCodage[j][i] = mot.charAt(aled);
                    aled++;
                }
                else {                   
                    Random r = new Random();
                    int valeur = 65 + r.nextInt(90 - 65);
                    tableauCodage[j][i] = (char)valeur;                   
                }               
            }
        }
        
        int[] tableauCle = new int[cle.length()];
        char[] tableau = new char[cle.length()];
        for(int i = 0; i < cle.length();i++){
            tableau[i] = cle.charAt(i);
        }
        
        for (int i = 0; i < cle.length(); i++){
            char c = tableau[0];
            int num = 0;
            for(int j = 1; j < cle.length();j++){
                if ((c > tableau[j])){
                    c = tableau[j];
                    num = j;
                }
            }
            tableau[num] = (char) 255;
            tableauCle[i] = num;
        }
        String rez = "";
        aled = 0;
        for (int i = 0; i < cle.length(); i++){
            for (int j = 0; j < nbLignes; j++){ 
                rez += tableauCodage[tableauCle[i]][j];
                aled++;
                if (aled%5 == 0){
                    rez += " ";
                }
            }
        }
        return rez;
    }
    
    
    
    
}
