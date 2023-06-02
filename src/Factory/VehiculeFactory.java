package Factory;

public class VehiculeFactory {

    // Methode Responsable pour la creation des vehicules selon le type//
    // L'objectif est d'eviter de configurer a chaque fois dans la classe de Client (Factory)


    // Cette methode est charge pour la creation des objets
    public Vehicule createVehicule(String typeVehicule){
        if(typeVehicule.equals("VehiculeTroisRoues")){
            return new VehiculeTroisRoues();
        } else if (typeVehicule.equals("VehiculeDeuxRoues")) {
            return new VehiculeDeuxRoues();

        } else if (typeVehicule.equals("VehiculeQuatreRoues")) {
            return  new VehiculeQuatreRoues();

        }
        return  null;
    }



}
