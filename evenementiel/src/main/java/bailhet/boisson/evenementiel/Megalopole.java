package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Megalopole extends Commune{
    
    public Megalopole(String nom) {
        super(nom);
    }

    @Override
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return (TypeCommune.MEGALOPOLE.nbHabitants > evenement.nbPersonneEvenement);

    }

    @Override
    public void OrganiserUnEvenement(TypeEvenement evenement){
        if(VerifierPossibilitéEvenement(evenement) == true) {
            //Evenement evt = new Evenement();
        } else {
            System.out.println("Vous ne pouvez pas organiser un " + evenement + ". ");
        }
    }
}
