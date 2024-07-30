package Exercice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double REDUCTION = 0.15;
        final double TVA = 0.20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Le montantTTC est : "+REDUCTION);
        System.out.println("Le montantTTC est : "+TVA);
        System.out.println("Entrer le prix total d'achat");
        double prixTTC = sc.nextFloat();
         prixTTC = prixTTC + (prixTTC*TVA);

         if(prixTTC>200){
            prixTTC = prixTTC - (prixTTC*REDUCTION);
         }
         System.out.println("Le montant TTc est "+ prixTTC);



    }
}
