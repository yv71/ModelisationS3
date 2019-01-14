package cryptographie.DiffieHellman;

public class DiffieHellman {

    public DiffieHellman() {
    }

    private final static double nombrePremier = 65537;
    
    public static double calculCle(double nb, double nombreSecret) {
        return puissance(nb,nombreSecret);
    }
    public static double puissance(double nb, double pow){
        double resultat=nb;
        for(int i=0;i<pow;i++){
            resultat=(resultat*nb)%nombrePremier;
        }
        return resultat;
    }
}