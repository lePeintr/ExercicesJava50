package Exercice49;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        Forme[]  T = new Forme[4];
        T[0]= new Triangle(6,5);
        T[1]= new Carre(5);
        T[2]= new Cercle(6);
        T[3]= new Rectangle(3,4) ;
        T[0].aire();
        T[1].aire();
        T[2].aire();
        T[3].aire();
    }
}
