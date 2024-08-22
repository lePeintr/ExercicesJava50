package Exercice49;



/**
 * Triangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public void aire(){
        System.out.println("aire du Carre");
    }

}
