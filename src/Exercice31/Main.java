package Exercice31;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int n = sc.nextInt();

            System.out.println("Les nombres pairs entre 0 et " + n + " sont : ");
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
