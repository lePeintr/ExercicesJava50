package Exercice37;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {

        while (true) {

                int i, j, N;
                Scanner sc = new Scanner(System.in);
                System.out.print("Entrer un entier:");
                N = sc.nextInt();

                for (i = 0; i < N; i++) {
                    for (j = 1; j <= (N * 2) - 1; j++) {
                        if (j >= N - i && j <= N + i)
                            System.out.print("*");
                        else System.out.print("@");
                    }
                    System.out.print("\n");
                }
            }
        }

}
