package Exercice12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer votre age");
        int age = sc.nextInt();

        if(age>=6 && age<=7){
            System.out.println("Poussin");
        }
        else if(age<=9 && age>=8){
            System.out.println("Pupille");
        }
        else if(age>=10 && age<=11){
            System.out.println("Minime");
        }
        else if(age>=12){
            System.out.println("Cadet");
        }
        else {
            System.out.println("age invalid");
        }


    }
}
