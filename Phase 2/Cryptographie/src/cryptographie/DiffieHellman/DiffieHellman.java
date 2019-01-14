package cryptographie.DiffieHellman;

public class DiffieHellman {

    public DiffieHellman() {
    }

    public final static double nombrePremier = 24036583;
    
    public static double calculCle(double nb, double nombreSecret) {
        return puissance(nb,nombreSecret);
    }
    public static double puissance(double nb, double pow){
        double resultat=nb;
        for(int i=1;i<pow;i++){
            resultat=(resultat*nb)%nombrePremier;
        }
        return resultat;
    }
}