import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import bailhet.boisson.evenementiel.Personne;
import bailhet.boisson.evenementiel.Village;
import java.util.ArrayList;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class PatientTest {
    
    public PatientTest() {
    }

     @Test
     public void personneTest() {
        Personne jonnhy = new Personne("Hall", "Jonny", 49);

        assertEquals("Hall", jonnhy.nom) ;
        assertEquals("Jonny", jonnhy.prenom) ;
        assertEquals(49, jonnhy.age) ;
     }
     
     @Test
     public void emmenagerTest() {
        Personne jonnhy = new Personne("Hall", "Jonny", 49);
        Village MarlinLesMoulineaux = new Village("Marlin-Les-Moulineaux");
        ArrayList<Personne> habitants = new ArrayList<>();
        habitants.add(jonnhy);
        jonnhy.emmenager(MarlinLesMoulineaux);
        assertEquals(habitants.contains(jonnhy), MarlinLesMoulineaux.habitants.contains(jonnhy)) ;
        assertEquals(habitants.size(), MarlinLesMoulineaux.habitants.size()) ;
     }
     
     @Test
     public void participerTest() {
        //TODO
     }
}
