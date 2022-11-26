package bailhet.boisson.evenementiel;

import java.util.ArrayList;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public abstract class Commune {
    public String nom;
    public Personne maire;
    public ArrayList<Personne> habitants = new ArrayList<>();
    public ArrayList<Evenement> listeEvenement = new ArrayList<>();

    public Commune (String nom){
        this.nom = nom;
    }
    
    public Boolean VerifierPossibilitéEvenement(TypeEvenement evenement){
        return true;
    }
    
    public void OrganiserUnEvenement(TypeEvenement evenement, Personne organisateur){
        if(VerifierPossibilitéEvenement(evenement) == true) {
          listeEvenement.add( new Evenement(organisateur, evenement, this));
        } else {
            System.out.println("Vous ne pouvez pas organiser un " + evenement + " à "+ this.nom);
        }
    }
    
    public Personne getMaire(){
        return this.maire;
    }
    public ArrayList<Personne> getHabitants(){
        return this.habitants;
    }
    
    public ArrayList<Evenement> getEvenements(){
        return this.listeEvenement;
    }
    
    public void setMaire(Personne élu){
        this.maire = élu;
    }
    
    public void setHabitant(ArrayList<Personne> habitants){
        this.habitants = habitants;
    }
    
    public void setListeEvenement(ArrayList<Evenement> listeEvenement){
        this.listeEvenement = listeEvenement;
    }
   
}
