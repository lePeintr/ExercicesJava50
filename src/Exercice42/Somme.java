package Exercice42;

import java.util.Scanner;

/**
 * Somme.java
 * <p>
 * Auteur: Administrateur
 */
public class Somme {
     int n1,n2;

    public Somme(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int somme(){
        return n1+n2;
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        n1 = sc.nextInt();
        System.out.println("Entrer un autre nombre");
        n2 = sc.nextInt();
        Somme s = new Somme(n1,n2);
        System.out.println(s.somme());
    }
}
