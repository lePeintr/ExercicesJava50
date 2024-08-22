package Exercice33;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Écrire un programme en Java qui permet de calculer le plus grand diviseur commun entre deux entiers
 * saisis par l'utilisateur.
 * Par exemple:  M= 15  et N=10   PGCD (15 , 10) =  5
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("entrer un entier");
            int n = sc.nextInt();
            System.out.println("entrer un entier");
            int m = sc.nextInt();
            int max = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (n % i == 0 && m % j == 0) {
                        if (i == j && i>max) {

                                max = i;
                        }
                    }
                }
            }
            System.out.println("PGCD(" + n + "," + m + ") = " + max);
        }

    }
}
