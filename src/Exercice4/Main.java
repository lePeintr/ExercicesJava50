package Exercice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Le nombre entré est pair");
        }else {
            System.out.println("Le nombre entré est impair");
        }
    }
}
