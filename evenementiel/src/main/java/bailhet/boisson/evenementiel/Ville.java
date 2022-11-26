package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Ville extends Commune{
    
    public Ville(String nom) {
        super(nom);
    }

    @Override
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return (TypeCommune.VILLE.nbHabitants > evenement.nbPersonneEvenement);

    }

    @Override
    public void OrganiserUnEvenement(TypeEvenement evenement){
        if(VerifierPossibilitéEvenement(evenement) == true) {
            //Evenement evt = new Evenement();
        } else {
            System.out.println("Vous ne pouvez pas organiser un " + evenement + ". ");
        }
    }
    //Todo evenement et TU
}
