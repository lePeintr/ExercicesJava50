package Exercice28;

import java.util.Scanner;

/**
 * Cette classe Main représente ...
 *
 * @author Utilisateur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tab = new int [10];
        int nombreOccurrence = 0;
        for(int i=0;i<tab.length;i++){
            System.out.println("entrer un nombre");
            tab[i]=sc.nextInt();
        }
        System.out.println("Saisir un nombre n pour compter ses occurrences dans le tableau");
        int n= sc.nextInt();
        for (int i=0;i<tab.length;i++){
            if(tab[i]==n)
                nombreOccurrence ++;
        }
        System.out.println("le nombre d'occurrence de "+n+ " est : "+nombreOccurrence );
    }
}
