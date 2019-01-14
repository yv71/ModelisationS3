package cryptographie.DiffieHellman;

public class Aled {

    public Aled() {
    }

    private final static int nombrePremier = 65537;
    public static int calculCléInter(int entierCommun, int nombreSecret) {
        int resultat = puissance(entierCommun,nombreSecret);
        return resultat;
    }

    public static int calculCle(int nombreAmis, int nombreSecret) {
        int resultat2 = puissance(nombreAmis,nombreSecret);
        return resultat2;
    }
    public static int puissance(int nb, int pow){
        int resultat=nb;
        for(int i=0;i<pow;i++){
            resultat=(resultat*nb)%nombrePremier;
        }
        return resultat;
    }
}