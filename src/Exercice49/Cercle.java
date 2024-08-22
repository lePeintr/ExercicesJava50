package Exercice49;



/**
 * Triangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void aire(){
        System.out.println("aire du Cercle");
    }

}
