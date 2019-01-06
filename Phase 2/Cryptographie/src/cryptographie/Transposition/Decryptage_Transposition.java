/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie.Transposition;

/**
 *
 * @author yv066840
 */
public class Decryptage_Transposition {
    private String mot;
    private String cle;

    public Decryptage_Transposition(String cle, String mot) {
        this.mot = mot.replace(" ", "");
        System.out.println(this.mot);
        this.cle = cle;
    }
    
   
    public String decrypt(){
        String rez = "";
        int nbLignes = mot.length()/cle.length();
        int nbColonnes = cle.length();
        //if (mot.length()%cle.length())
        char [][] tableauDecodage = new char [nbColonnes][nbLignes];
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
        int aled = 0;
        for (int i = 0; i < nbColonnes; i++){
            for (int j = 0; j < nbLignes; j++){
                tableauDecodage[tableauCle[j]][i] = mot.charAt(aled) ;
                aled++;
            }
        }
        
                
                
        for(int i = 0; i < nbColonnes; i++){
            for (int j = 0; j < nbLignes; j++){
               
            }
        }
        return rez;
    }
}
