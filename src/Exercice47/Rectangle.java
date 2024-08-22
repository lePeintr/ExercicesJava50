package Exercice47;

/**
 * Rectangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Rectangle {
   private double longueur;
   private double largeur;

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

    public double perimetre(Rectangle rectangle){
        return (rectangle.longueur + rectangle.largeur)*2;
    }
    public double surface(Rectangle rectangle){
        return rectangle.longueur * rectangle.largeur;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(14,2);
        System.out.println(rectangle.toString());

        rectangle.surface(rectangle);
        System.out.println("perimetre= "+rectangle.perimetre(rectangle));
        System.out.println("surface= "+rectangle.surface(rectangle));
    }
}
