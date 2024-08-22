package Exercice48;

/**
 * Triangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Triangle extends Forme{
    public Triangle(double largeur, double hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public double aire() {
        return getLargeur()*getHauteur()/2;
    }
}
