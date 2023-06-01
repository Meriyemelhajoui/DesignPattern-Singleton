package Singleton;

public class CompteBancaire {

    Journalisation j= Journalisation.getUniqueInstance();




    private int numero;
    private double solde;

    public CompteBancaire(int numero , Double solde) {
        this.numero = numero;
        this.solde=solde;
    }

    public CompteBancaire() {

    }


    // Utilisation de l objet unique de la classe Journalisation pour laisser une tracabilite des operations //



    public void DeposerArgent(Double argent){
        this.solde+=argent;
        j.AjouterLog("Un montant de : "+ argent+"a ete depose sur ce compte de numero : "+this.numero); //Journaliser l operation
        System.out.println(j.afficherLog()); // Display the message


    }



    public void RetirerArgent(Double argent){
        if(solde>=argent){
            this.solde-=argent;
            j.AjouterLog("un montant de : "+ argent + "a ete retire de ce compte de numero :"+this.numero);
            System.out.println(j.afficherLog());

        }
        else{

            j.AjouterLog("La banque n autorise pas le decouvert , car le solde est insuffisant  ");
            System.out.println(j.afficherLog());

        }


    }





    public static void main(String[] args) {


        // Test de l application //
        CompteBancaire c1 = new CompteBancaire(001,3000.0);
        c1.DeposerArgent(1000.0);
       c1.RetirerArgent(5000.0);


    }






}
