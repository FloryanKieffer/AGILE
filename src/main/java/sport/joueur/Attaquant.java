package sport.joueur;

public class Attaquant extends Joueur {
    public Attaquant(int nombre_de_butes, String nom, float salaire) {
        super(nombre_de_butes, nom, salaire);
    }

    @Override
    public float getSalaire() {
        return 3000 + getNombre_de_butes()*10;
    }
}
