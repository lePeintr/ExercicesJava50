package Exercice29;

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
        int [] tabfinal = new int[10];
        int n;
        for(int i=0;i<tab.length;i++){
            System.out.println("entrer un nombre");
            tab[i]=sc.nextInt();
        }

        for (int i=0;i< tabfinal.length;i++){
            System.out.println(tabfinal[i]);
        }























 /*       for (int i=0;i<tab.length;i++){
            for(int j=0;j<tabfinal.length;j++){
                if(tab[i]<tab[j]){
                    n=tab[i];
                    tab[i]=tab[j];
                    tab[j]=n;
                }
                System.out.println(tab[j]);
            }
        }*/

    }
}
