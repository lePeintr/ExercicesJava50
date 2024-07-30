package Exercice5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un premier nombre");
        int a=sc.nextInt();
        System.out.println("Entrer un deuxieme nombre");
        int b=sc.nextInt();
        System.out.println("Entrer un troisieme nombre");
        int c=sc.nextInt();
        int max = a;
        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }
        System.out.println("Le nombre max est " +max);

    }
}
