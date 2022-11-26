package bailhet.boisson.evenementiel;

import java.util.ArrayList;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Evenement {
    ArrayList<Personne> listeDeParticipants = new ArrayList<>();
    Personne organisateur;
    TypeEvenement type;
    Commune commune;
    
    public Evenement(Personne organisateur, TypeEvenement type, Commune commune){
        this.organisateur = organisateur;
        this.type = type;
        this.commune = commune;
        this.listeDeParticipants.add(organisateur);
    }
    
    public void enregistrerUnGroupeDeParticipants( ArrayList<Personne> groupe){
        if(this.listeDeParticipants.size()+groupe.size() < type.nbPersonneEvenement){
            for (Personne personne : groupe) {
                if(!this.listeDeParticipants.contains(personne)){
                    this.listeDeParticipants.add(personne);
                }
            }
        }
    }
}
