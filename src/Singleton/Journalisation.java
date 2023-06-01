package Singleton;

public class Journalisation {

    public static void main(String[] args) {

    }

    private static Journalisation uniqueInstance ; //Pour assurer que cette instance sera toujours dans l application , et ne modifie pas d'etat

    private Journalisation(){}; // Constructeur Privee pour assurer qu'il ne soit pas accessible en dehors


    private String log;



    //Constructeur pour creer l instance Log
    public Journalisation(String log) {
        this.log = log;
    }

    // methode appele dans le main pour creer l'objet , cette methode est static pour pouvoir l'appeler par la classe Journalisation et nn pas un objet
    public static Journalisation getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance= new Journalisation(); // si l'objet est null on va le creer une et 1 seule fois
            System.out.println("Creation d une seule instance de l objet ");
        }
        return uniqueInstance;
    }



    // Les methodes pour l attribut Log


    public String afficherLog(){
        return this.log;
    }

    public void AjouterLog(String log){
        this.log=log;
    }





}
