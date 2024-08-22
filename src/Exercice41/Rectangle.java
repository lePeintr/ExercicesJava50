package Exercice41;

/**
 * Rectangle.java
 * <p>
 * Auteur: Administrateur
 */
public class Rectangle {
    float a,b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float surface(){
        return a*b;
    }

    public static void main(String[] args) {
        Rectangle r2 = new Rectangle (5,4);
        System.out.println("la surface est:"+r2.surface());
    }
}
