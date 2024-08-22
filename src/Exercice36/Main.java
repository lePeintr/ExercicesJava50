package Exercice36;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            int r=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("entrer un entier");
            int n = sc.nextInt();
            while(n>0){
                r=r*10;
                r=r+(n%10);
                n=n/10;
            }
            System.out.println(r);
        }
    }
}
