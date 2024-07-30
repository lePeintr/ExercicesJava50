package Exercice8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("La valeur absolue est "+ (-1*n));
        }
        else {
            System.out.println("La valeur absolue est "+ n);
        }
    }
}
