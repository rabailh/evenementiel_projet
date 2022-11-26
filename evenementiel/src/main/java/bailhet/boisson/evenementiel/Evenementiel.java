package bailhet.boisson.evenementiel;

import java.util.ArrayList;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Evenementiel {

    public static void main(String[] args) {

        // Creation des personnes
        Personne p1 = new Personne("To", "Toto", 20 );
        Personne p2 = new Personne("Ta", "Tata", 30 );
        Personne p3 = new Personne("Tu", "Tutu", 40 );
        Personne p4 = new Personne("Te", "Tete", 50 );
        Personne p5 = new Personne("Ti", "Titi", 60 );
        Personne p6 = new Personne("Ty", "Tyty", 70 );

        System.out.println("Six personnes ont été crées, il s'agit de " + p1.prenom +
                ", " + p2.prenom +
                ", " + p3.prenom +
                ", " + p4.prenom +
                ", " + p5.prenom +
                ", " + p6.prenom);

        // Creation de communes
        Village village = new Village("Martignas");
        Ville ville = new Ville("Merignac");
        Megalopole megalopole = new Megalopole("Paris");
        System.out.println("Les communes " + village.nom + ", "
                                            + ville.nom + ", "
                                            + megalopole.nom + " ont été crées");

        //Emmenagements
        p1.emmenager(village);
        p2.emmenager(village);
        p3.emmenager(ville);
        p4.emmenager(ville);
        p5.emmenager(megalopole);
        p6.emmenager(megalopole);
        System.out.println("Les personnes peuvrent emmenager dans des communes, les habitants de la commune de " + megalopole.nom + " sont : ");
        for(int i = 0; i < megalopole.habitants.size(); i++) {
            System.out.println(megalopole.habitants.get(i).prenom);
        }


        //Elire un maire
        village.setMaire(p1);
        ville.setMaire(p3);
        megalopole.setMaire(p5);
        System.out.println("Les habitants des communes peuvent élire un maire, le maire de la ville de " + ville.nom + " est " + ville.getMaire().prenom);

        //Organisation d'évènements
        village.OrganiserUnEvenement(TypeEvenement.FETE_DE_VILLAGE, village.getMaire());
        village.OrganiserUnEvenement(TypeEvenement.CONCERT, village.getMaire());
        village.OrganiserUnEvenement(TypeEvenement.CONCERT, ville.getMaire());
        village.OrganiserUnEvenement(TypeEvenement.FETE_DE_VILLAGE, ville.getMaire());
        village.OrganiserUnEvenement(TypeEvenement.JEUX_OLYMPIQUES, megalopole.getMaire());
        System.out.println("Les habitants peuvent créer des évènements");

        //Afficher la liste des evenements:
        village.listeEvenement.get(0);
        System.out.println("La liste des evenements organisés au village est : ");

        for(int i = 0; i < village.listeEvenement.size(); i ++) {
            System.out.println(village.listeEvenement.get(i).type);
        }

        //Participations aux évènements
        p1.participationEvenement(village.listeEvenement.get(0));
        p5.participationEvenement(village.listeEvenement.get(0));

        System.out.println("La liste des participants à l'évenement " + village.listeEvenement.get(0).type + " est : ");
        for(int i =  0; i < village.listeEvenement.get(0).listeDeParticipants.size(); i++) {
            System.out.println(village.listeEvenement.get(0).listeDeParticipants.get(i).prenom);
        }


    }
}
