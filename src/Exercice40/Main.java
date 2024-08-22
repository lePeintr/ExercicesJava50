package Exercice40;

import java.util.Scanner;

/**
 * Main.java
 * <p>
 * Auteur: Administrateur
 */
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int [] tableau = new int[10];
            int [] tab1 = new int[1];
            int n1 = tab1.length;
            int [] tab2 = new int[1];
            int n2 = tab1.length;
            for(int i=0;i<tableau.length;i++){
                System.out.println("saisir un entier");
                tableau[i]=sc.nextInt();
            }

            for(int i=0;i< tableau.length;i++){
                while(tableau[i]%2==0){
                    n1++;
                    for(int j=0;j<n1;j++){
                        tab1[j]=tableau[i];
                    }

                }
                while(tableau[i]%2==0){
                    n2++;
                    for(int j=0;j<n2;j++){
                        tab2[j]= tableau[i];
                    }
                }
            }
        System.out.println("tab1");
           for (int i=0;i< tab1.length;i++){
               System.out.print( tab1[i]+ " ");
           }
        System.out.println("tab2");
            for (int i=0;i< tab2.length;i++){
                System.out.print( tab2[i]+ " ");
            }
        }

}
