package Exercice27;

import java.util.Scanner;

/**
 * Cette classe Main représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int [] tab = new int[10];

        int max=0;
        for (int i=0;i<tab.length;i++){
            System.out.println("Saisir un entier");
            Scanner sc = new Scanner(System.in);
            tab[i]=sc.nextInt();
            if(tab[i]>max){
                max = tab[i];
            }
        }
        System.out.println("le maximum des entiers entrés est = "+max);
    }
}
