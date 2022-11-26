package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public abstract class Commune {
    public String nom;
    

    public Commune (String nom){
        this.nom = nom;
    }
    
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return true;
    }
    
    public void OrganiserUnEvenement(TypeEvenement evenement){
        
    }
}
