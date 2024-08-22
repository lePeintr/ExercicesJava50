package Exercice29;

import java.util.Scanner;

/**
 * Cette classe Main représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class TriSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];
        int n = tab.length;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("entrer un nombre");
            tab[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int indexmin = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[indexmin]) {
                    indexmin = j;
                }
            }

            int temp = tab[indexmin];
            tab[indexmin]=tab[i];
            tab[i]=temp;

        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" ");
        }

    }
}
