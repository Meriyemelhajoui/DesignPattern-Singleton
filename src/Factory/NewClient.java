package Factory;

public class NewClient {
    public VehiculeFactory pvehicule;
    public NewClient(){
        this.pvehicule= new VehiculeFactory();
    }


    // Cette methode est charge pour le renvoi de vehicule deja cree avec la factory
    // C est a dire dans la classe de Factory on a pas besoin de changer a chaque fois le code si'il y a un nv type de vehicule il suffit de passer le type de vehicule Souhaite
    public Vehicule formerVehicule(String typeVehicule){
        return pvehicule.createVehicule(typeVehicule);
    }

    public static void main(String[] args) {
        NewClient c1= new NewClient();
        c1.formerVehicule("VehiculeTroisRoues").AfficherVehicule();

        NewClient c2= new NewClient();
        c2.formerVehicule("VehiculeQuatreRoues").AfficherVehicule();
    }
}
