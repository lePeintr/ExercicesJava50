package Exercice48;

/**
 * Forme.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(5,4);
        System.out.println("aire du rectangle: " +r.aire());
        System.out.println("aire du triangle: " +t.aire());
    }
}
