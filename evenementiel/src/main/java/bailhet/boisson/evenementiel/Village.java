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
    
    @Override
    public void OrganiserUnEvenement(TypeEvenement evenement){
        if(VerifierPossibilitéEvenement(evenement) == true) {
          //Evenement evt = new Evenement();
        } else {
            System.out.println("Vous ne pouvez pas organiser un " + evenement + ". ");
        }
    }
    // Todo Tu
    
}
