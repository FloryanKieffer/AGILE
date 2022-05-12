package sport.main;

import sport.joueur.Joueurs;

public class Equipe {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int points;
    private String name;
    private int pointsCumul;

    public int getPointsCumul() {
        return pointsCumul;
    }

    public void setPointsCumul(int pointsCumul) {
        this.pointsCumul = pointsCumul;
    }

    /**
     * Constructeur d'objets de classe Equipe
     */
    public Equipe() {
        // initialisation des variables d'instance
        this.points = 0;
        this.name = null;
        this.pointsCumul = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    Joueurs joueurs;

    public static void match(Equipe a, int scoreA, Equipe b, int scoreB) {
        if (scoreA > scoreB) {
            a.setPoints(3);
            a.setPointsCumul(a.getPointsCumul() + 3);
        } else if (scoreA < scoreB) {
            b.setPoints(3);
            b.setPointsCumul(b.getPointsCumul() + 3);
        } else {
            a.setPoints(1);
            a.setPointsCumul(a.getPointsCumul() + 1);
            b.setPoints(1);
            b.setPointsCumul(b.getPointsCumul() + 1);
        }
    }
}
