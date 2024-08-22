package Exercice49;



/**
 * Triangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Rectangle extends Forme {
    private double longueur,largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void aire(){
        System.out.println("aire du Rectangle");
    }

}
