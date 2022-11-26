package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public enum TypeEvenement {
    FETE_DE_VILLAGE(100),
    CONCERT(800),
    JEUX_OLYMPIQUES(5000);
    
    int nbPersonneEvenement;
    
    TypeEvenement(int nbPersonneEvenement) {this.nbPersonneEvenement = nbPersonneEvenement;}
}
