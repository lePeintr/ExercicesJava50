package Exercice49;



/**
 * Triangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Triangle extends Forme {
    private double base,hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    public void aire(){
        System.out.println("aire du Triangle");
    }

}
