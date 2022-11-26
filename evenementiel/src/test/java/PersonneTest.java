import bailhet.boisson.evenementiel.Evenement;
import bailhet.boisson.evenementiel.Megalopole;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import bailhet.boisson.evenementiel.Personne;
import bailhet.boisson.evenementiel.TypeEvenement;
import bailhet.boisson.evenementiel.Village;
import java.util.ArrayList;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class PersonneTest {
    
    public PersonneTest() {
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
     public void participerTest(){
        Personne jonnhy = new Personne("Hall", "Jonny", 49);
        Personne jonna = new Personne("Halle", "Jonna", 12);
        Megalopole MarlinLesMoulineaux = new Megalopole("Marlin-Les-Moulineaux");
        Evenement concert = new Evenement(jonnhy, TypeEvenement.CONCERT, MarlinLesMoulineaux);
        
        assertFalse(jonnhy.participationEvenement(concert));
        assertTrue(jonna.participationEvenement(concert));
        assertFalse(jonna.participationEvenement(concert));
     }
}
