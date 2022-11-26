package test;

import bailhet.boisson.evenementiel.TypeEvenement;
import bailhet.boisson.evenementiel.Village;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Type;


public class VillageTest {


    public Village village = new Village("Le village");

    @Test

    void VerifierPossibilitéEvenementTest_true() {
        //Arrange
        TypeEvenement evenement = TypeEvenement.FETE_DE_VILLAGE;

        //Act
        Boolean result = this.village.VerifierPossibilitéEvenement(evenement);

        //Assert
        assertTrue(result);
    }

    @Test
    void VerifierPossibilitéEvenementTest_false() {
        //Arrange
        TypeEvenement evenement = TypeEvenement.CONCERT;

        //Act
        Boolean result = this.village.VerifierPossibilitéEvenement(evenement);

        //Assert
        assertFalse(result);
    }
}
