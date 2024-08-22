package Exercice48;

/**
 * Forme.java
 * <p>
 * Auteur: Administrateur
 */
public abstract class Forme {
    private double largeur;
    private double hauteur;

    public Forme(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Forme{" +
                "largeur=" + largeur +
                ", hauteur=" + hauteur +
                '}';
    }

    public abstract double aire();

}
