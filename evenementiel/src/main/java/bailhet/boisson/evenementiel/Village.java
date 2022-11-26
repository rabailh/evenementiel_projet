package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Village extends Commune{
    
    public Village(String nom) {
        super(nom);
    }
    
    @Override
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return true;
    }
    
    @Override
    public void OrganiserUnEvenement(TypeEvenement evenement){
        
    }
    
}
