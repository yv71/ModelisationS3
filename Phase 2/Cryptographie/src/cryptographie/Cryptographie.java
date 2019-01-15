/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie;

import cryptographie.DiffieHellman.Fenetre;
import cryptographie.Transposition.Cryptage_Transposition;
import javax.swing.JFrame;

/**
 *
 * @author yv066840
 */
public class Cryptographie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Transposition
        JFrame j = new Cryptage_Transposition();
        j.setVisible(true);
        j.setResizable(false);
        j.setTitle("Transposition");
        
        //Diffie-Hellman
        JFrame j2 = new Fenetre();
        j2.setVisible(true);
        j2.setResizable(false);
        j2.setTitle("Diffie-Hellman");
    }
    
}
