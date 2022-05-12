package sport.joueur;

public class Gardien extends Joueur {
    int tires_rendus;
    int tires_echoues;

    public Gardien(int nombre_de_butes, String nom, float salaire, int tires_rendus, int tires_echoues) {
        super(nombre_de_butes, nom, salaire);
        this.tires_echoues = tires_echoues;
        this.tires_rendus = tires_rendus;
    }

    @Override
    public float getSalaire() {
        return 2500 + 20*tires_rendus - 18*tires_echoues;
    }

    public int getTires_rendus() {
        return tires_rendus;
    }

    public int getTires_echoues() {
        return tires_echoues;
    }
}
