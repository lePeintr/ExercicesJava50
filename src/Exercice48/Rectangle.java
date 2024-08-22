package Exercice48;

/**
 * Rectangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Rectangle extends Forme{
    public Rectangle(double largeur, double hauteur) {
        super(largeur, hauteur);
    }

    @Override
    public double aire() {
        return getLargeur()*getHauteur();
    }
}
