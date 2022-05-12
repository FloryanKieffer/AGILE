package sport.joueur;

public class Defenseur extends Joueur {
    private int reprise_de_balles;

    public Defenseur(int nombre_de_butes, String nom, float salaire, int reprise_de_balles) {
        super(nombre_de_butes, nom, salaire);
        this.reprise_de_balles = reprise_de_balles;
    }

    @Override
    public float getSalaire() {
        return 3000 + 5*reprise_de_balles;
    }

    public int getReprise_de_balles() {
        return reprise_de_balles;
    }
}
