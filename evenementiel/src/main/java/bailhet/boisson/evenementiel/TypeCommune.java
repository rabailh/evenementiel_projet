package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public enum TypeCommune {
    VILLAGE(500),
    VILLE(4000), 
    MEGALOPOLE(100000);
    
    int nbHabitants;
    
    TypeCommune(int nbHabitants) {this.nbHabitants = nbHabitants;}
}
