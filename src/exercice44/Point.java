package exercice44;

import java.util.Scanner;

/**
 * Point.java
 * <p>
 * Auteur: Administrateur
 */
public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public void  deplacement(double dx,double dy){
    double newX = x + dx;
    double newY = y + dy;
        x= newX;
        y= newY;
    }

    public void afficherCordonnee(){
        System.out.println("x= "+x+",y= "+y);
    }

    public void saisirLEsCoordonnes(){
        Scanner sc= new Scanner(System.in);
        double x,y;
        System.out.println("Entrer un nombre");
        x = sc.nextDouble();
        System.out.println("Entrer un autre nombre");
        y = sc.nextDouble();
    }

    public void calculDistanceEntreDeuxPoint(Point p){
        Point pInitial = new Point(x,y);
        double distanceX= pInitial.x - p.x;
        double distanceY= pInitial.y - p.y;
        System.out.println("La distance est entre les points suivant x est =:"+distanceX+" et suivantY= "+distanceY);
    }

    public void milieuSegment(Point p1){
        Point p = new Point(x,y);
        double milieu= (p.x - p1.x)/2 ;
        System.out.println("le milieu est "+ milieu);
    }

    public static void main(String[] args) {
        Point p1 = new Point(14,20);
        Point p2 = new Point(10,30);
        p1.afficherCordonnee();
        p1.deplacement(20,20);
        p1.calculDistanceEntreDeuxPoint(p2);
        p1.milieuSegment(p2);
    }
}
