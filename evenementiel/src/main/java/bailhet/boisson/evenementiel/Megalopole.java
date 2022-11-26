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
}
