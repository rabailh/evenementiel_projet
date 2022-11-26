package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Village extends Commune{
    
    public Village(String nom) {
        super(nom);
    }
    //Todo ajouter maire
    
    @Override
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return (TypeCommune.VILLAGE.nbHabitants > evenement.nbPersonneEvenement);
    }
}
