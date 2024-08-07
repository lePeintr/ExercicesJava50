package Exercice21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un entier");
        int n = sc.nextInt();
        int s=0;
        for(int i=0;i<=10;i++){
            s=n*i;
            System.out.println(n+"*"+i+ "="+s);
        }
    }
}
