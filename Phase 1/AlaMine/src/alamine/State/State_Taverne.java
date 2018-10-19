/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamine.State;

import alamine.Nain;

/**
 *
 * @author yv066840
 */
public class State_Taverne extends State{

    private static int nbC=0;
    private static int maxTav=0;
    private static int nbTour=0;
    public State_Taverne(Nain n) {
        super(n);
    }

    @Override
    public State transition() {
        State retour = null;
        if (this.getNain().getTa()>=8){
            retour = new State_Dodo(this.getNain());
            nbC=0;
            if (nbTour>maxTav){
                this.maxTav=nbTour;
            }
            nbTour=0;
        }
        else if (this.getNain().taperTavernier()){
            retour = new State_Travail(this.getNain());
            nbC=0;
            if (nbTour>maxTav){
                this.maxTav=nbTour;
            }
            nbTour=0;
        }
        else{
            retour = new State_Taverne(this.getNain());
            if(nbC<9){
                nbC+=1;
            }
            else nbC=0;
            this.nbTour++;
        }
        return retour;
    }

    @Override
    public void agir() {
        this.getNain().boirePintes(3);
        this.getNain().diminuerTaPause();
        this.getNain().getCptTaverne().passeTranche();
        
    }

    @Override
    public String toString() {
        String res=null;
        switch(nbC){
            case 0:res="Voici l'histoire d'un nain capable\n" +
                "De courir vite, et de voyager loin\n" +
                "Dans son épopée formidable,\n" +
                "Nous le suivrons, une bière à la main!";
            break;
            case 1:res="Nous sommes les nains sous la montagne,\n" +
                "On creuse le jour, on boit la nuit,\n" +
                "Et on aime pas ceux d'la surface";
            break;
            case 2:res="Un jour, mon ancêtre Gurdil fut envoyé creuser dans la forêt,\n" +
                "Y'avait soit disant du mithril, \n" +
                "Si y'en avait on sait pas où il s'trouvait\n" +
                "\n" +
                "Il fit sa cabane en bordure,\n" +
                "D'un bois touffu, peuplé d'elfes sylvains,\n" +
                "Des gens qui bouffent de la verdure,\n" +
                "Évidemment sa n'fait pas de bons voisins.";
            break;
            case 3:res="Nous sommes les nains sous la montagne,\n" +
                "On creuse le jour, on boit la nuit,\n" +
                "Et on aime pas ceux d'la surface";
            break;
            case 4:res="Arrière tu n'es pas bienvenu\n" +
                "Lui dirent les elfes, en lui jetant des pierres,\n" +
                "Voyant que tout était foutu,\n" +
                "Il prit la fuite, en suivant la rivière,\n" +
                "\n" +
                "Il fut recueilli par les fées,\n" +
                "Ondines bleues, bullant sur le rivage,\n" +
                "De l'eau de pluie lui fut donnée,\n" +
                "Il recracha (pfoua !) tout dans leurs visages";
            break;
            case 5:res="Nous sommes les nains sous la montagne,\n" +
                "On creuse le jour, on boit la nuit,\n" +
                "Et on aime pas ceux d'la surface";
            break;
            case 6:res="Courant à travers les fougères, \n" +
                "Il arriva, près d'un village humain,\n" +
                "Bien sûr qu'on y vendait d'la bière, \n" +
                "Mais aucun homme ne voulait servir un nain!\n" +
                "\n" +
                "Gurdil, massacra le patron\n" +
                "D'une taverne, à coups de tabouret\n" +
                "Puis il rentra a la maison,\n" +
                "Et de la mine il ne repartit jamais!";
            break;
            case 7:res="Nous sommes les nains sous la montagne,\n" +
                "On creuse le jour, on boit la nuit,\n" +
                "Et on aime pas ceux d'la surface";
            break;
            case 8:res="mis restons bien a l'abri,\n" +
                "Mangeons buvons, dans nos maisons de pierres\n" +
                "Là-haut, c'est peuplé d'abrutis\n" +
                "Allez patron, ressers donc une bière";
            break;
            case 9:res="Nous sommes les nains sous la montagne,\n" +
                "On creuse le jour, on boit la nuit,\n" +
                "Et on aime pas ceux d'la surface";
            break;
        }
        return res;
    }

    public static int getMaxTav() {
        return maxTav;
    }

    
    
}
