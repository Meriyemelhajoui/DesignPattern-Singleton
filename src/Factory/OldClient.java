package Factory;

public class OldClient {
    public Vehicule pvehicule; // un objet de type Vehicule
    // La construction de cette objet sera dans cette classe Client qui represente La factory
    public OldClient(int nb ){
        if(nb==2){
            pvehicule= new VehiculeDeuxRoues();
        } else if (nb==4) {
            pvehicule= new VehiculeQuatreRoues();

        } else if (nb==3) {
            pvehicule= new VehiculeTroisRoues(); // Lorsqu'on introduit une nv classe ou nouveu type de vehicule on doit modifier la factory de construction des vehicules ...

        } else {
            throw  new IllegalArgumentException("Ce nombre de roues n'est pas pris en charge");
        }

    }
    // Methode pour retourner l objet de type Vehicule

    public Vehicule getPvehicule(){
        return  this.pvehicule;
    }


    public static void main(String[] args) {
        // On ne sait le type de voiture souhaite qu'au moment de l execution de code //
        OldClient c1= new OldClient(2);
        c1.getPvehicule().AfficherVehicule(); // Je suis vehicule a deux roues
        OldClient c2 = new OldClient(4);
        c2.getPvehicule().AfficherVehicule(); // Je suis vehicule a quatres roues
        OldClient c3=new OldClient(3);
        c3.getPvehicule().AfficherVehicule(); // Je suis vehicule a 3 roues

        /////// On remarque que a chaque fois on a besoin d un autre type de Vehicule , on doit ajouter cette classe et moifier la factory client ! -> C est la raison pour laquel , on va utiliser une Factory Abstraite qui englobe des sous classes qui seront charges de la creation des vehicules et notre factory sera charge de retourner le type cree

    }


}