package Exercice45;

/**
 * Account.java
 * <p>
 * Auteur: Administrateur
 */
public class Account {
    private float soldeInitial;
    private float balance;
    public Account() {
        this.soldeInitial = 0;
    }

    public Account(float soldeInitial) {
        this.soldeInitial = soldeInitial;
        this.balance=soldeInitial;
    }

    public float getBalance() {
        return balance;
    }
    public float deposer(float montant){
        balance =  getBalance() + montant;
        return balance;
    }
    public float retirer(float montant){
        balance =  getBalance() - montant;
        return balance;
    }
    public float ajouterInteret(float tauxInteret){
        balance = getBalance() * (1+tauxInteret);
        return balance;

    }

    public static void main(String[] args) {

        Account compte1 = new Account();
        Account compte2 = new Account(3000);
        System.out.println("new balance: "+ compte1.deposer(100));;
        System.out.println("new balance: "+ compte2.retirer(1000));;
        System.out.println("new balance: "+ compte1.ajouterInteret(0.3f));
        System.out.println(compte1.getBalance());
        System.out.println(compte2.getBalance());
    }
}
