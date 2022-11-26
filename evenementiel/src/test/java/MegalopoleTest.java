import bailhet.boisson.evenementiel.Megalopole;
import bailhet.boisson.evenementiel.TypeEvenement;
import bailhet.boisson.evenementiel.Ville;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MegalopoleTest {


    public Megalopole megalopole = new Megalopole("La mégalopole");

    @Test

    void VerifierPossibilitéEvenementTest_true() {
        //Arrange
        TypeEvenement evenement = TypeEvenement.FETE_DE_VILLAGE;

        //Act
        Boolean result = this.megalopole.VerifierPossibilitéEvenement(evenement);

        //Assert
        assertTrue(result);
    }
}
