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
        Crypteur_Transpo crypt = new Crypteur_Transpo("2335847");
        String temp = crypt.cryptage("Salut je m'appelle Yoann et je suis diabétique");
        System.out.println(temp);
        System.out.println(crypt.decryptage(temp));
        
    }
    
}
