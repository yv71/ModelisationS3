/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptographie;

import cryptographie.DiffieHellman.Attaque_Homme_Milieu;
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
        
        //Attaque de l'homme du milieu
        JFrame j3 = new Attaque_Homme_Milieu();
        j3.setVisible(true);
        j3.setResizable(false);
        j3.setTitle("Attaque de l'homme du milieu");
    }
    
}
