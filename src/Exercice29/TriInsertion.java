package Exercice29;

import java.util.Scanner;

/**
 * TriInsertion.java
 * <p>
 * Auteur: Administrateur
 */
public class TriInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];
        int n = tab.length;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("entrer un nombre");
            tab[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int key=tab[i];
            int j=i-1;
            while(j>=0 && tab[j]>key){
                tab[j+1]=tab[j];
                j--;
            }
            // Insérer la cle dans la position correcte
            tab[j + 1] = key;
        }



        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" ");
        }

    }
}
