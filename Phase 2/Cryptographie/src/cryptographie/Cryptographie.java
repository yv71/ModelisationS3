/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie;

import cryptographie.Transposition.Crypteur_Transpo;

/**
 *
 * @author yv066840
 */
public class Cryptographie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String temp = Crypteur_Transpo.cryptage("2335847","Salut je m'appelle Yoann et je suis diabétique");
        System.out.println(temp);
        System.out.println(Crypteur_Transpo.decryptage("2335847",temp));
        
    }
    
}
