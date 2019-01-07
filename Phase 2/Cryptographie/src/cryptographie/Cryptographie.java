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
        /*Cryptage_Transposition aled = new Cryptage_Transposition("trombonne", "SALUT JE SUIS YOANN ET JE SUIS DEBILE");        
        String motCrypte = aled.crypte();
        System.out.println(motCrypte);
        Decryptage_Transposition oskour = new Decryptage_Transposition("trombonne");
        
        String motDecrypte = oskour.decrypt(motCrypte);
        System.out.println(motDecrypte);
*/
        Crypteur_Transpo crypt = new Crypteur_Transpo("chat");
        System.out.println(crypt.cryptage("Salut je susi une bite"));
        
    }
    
}
