/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie;

import cryptographie.Transposition.Cryptage_Transposition;
import cryptographie.Transposition.Decryptage_Transposition;
import java.util.HashMap;

/**
 *
 * @author yv066840
 */
public class Cryptographie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cryptage_Transposition aled = new Cryptage_Transposition("chat", "SALUT JE SUIS YOANN");        
        String motCrypte = aled.crypte();
        Decryptage_Transposition oskour = new Decryptage_Transposition("chat", motCrypte);
        System.out.println(motCrypte);
        String motDecrypte = oskour.decrypt();
        
    }
    
}
