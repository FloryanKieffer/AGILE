package sport.joueur;

public abstract class Joueur implements IComposite {
    private int nombre_de_butes;
    private String nom;
    private float salaire;

    public Joueur(int nombre_de_butes, String nom, float salaire) {
        this.nombre_de_butes = nombre_de_butes;
        this.nom = nom;
        this.salaire = salaire;
    }

    @Override
    public int getNombreDeJoueurs() {
        return 1;
    }

    @Override
    public int getTotalButes() {
        return nombre_de_butes;
    }

    public int getNombre_de_butes() {
        return nombre_de_butes;
    }

    public void setNombre_de_butes(int nombre_de_butes) {
        this.nombre_de_butes = nombre_de_butes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
}
