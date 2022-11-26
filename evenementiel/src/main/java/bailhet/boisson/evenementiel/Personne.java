/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailhet.boisson.evenementiel;

/**
 *
 * @author Raphael BAILHET & Manon BOISSON
 */
public class Personne {
    public String nom;
    public String prenom;
    public int age;

    public Personne(String nom, String prenom, int age){
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    }
    public void emmenager(Commune commune){
        commune.habitants.add(this);
    }
        
    public Boolean participationEvenement(Evenement e){
      if(e.listeDeParticipants.size() < e.type.nbPersonneEvenement-1 && !e.listeDeParticipants.contains(this)){  
        e.listeDeParticipants.add(this);
        return true;
      } else {
          return false;
      }
    }
}
