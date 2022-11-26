import bailhet.boisson.evenementiel.TypeEvenement;
import bailhet.boisson.evenementiel.Ville;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VilleTest {


    public Ville ville = new Ville("Le village");

    @Test

    void VerifierPossibilitéEvenementTest_true() {
        //Arrange
        TypeEvenement evenement = TypeEvenement.FETE_DE_VILLAGE;

        //Act
        Boolean result = this.ville.VerifierPossibilitéEvenement(evenement);

        //Assert
        assertTrue(result);
    }

    @Test
    void VerifierPossibilitéEvenementTest_false() {
        //Arrange
        TypeEvenement evenement = TypeEvenement.JEUX_OLYMPIQUES;

        //Act
        Boolean result = this.ville.VerifierPossibilitéEvenement(evenement);

        //Assert
        assertFalse(result);
    }
}
