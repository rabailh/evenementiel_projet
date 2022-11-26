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
}
