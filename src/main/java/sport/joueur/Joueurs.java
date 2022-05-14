package sport.joueur;

import java.util.ArrayList;
import java.util.List;

public class Joueurs implements IComposite {
    private List<IComposite> joueurs = new ArrayList<>();

    @Override
    public float getSalaire() {
    	float totalSalaire = 0;
    	for(int i = 0 ; i<this.joueurs.size();i++) {
    		totalSalaire = totalSalaire + this.joueurs.get(i).getSalaire();
    	}
        return totalSalaire;
    }

    @Override
    public int getNombreDeJoueurs() {
    	int totalNombreJoueurs = 0;
    	for(int i = 0 ; i<this.joueurs.size();i++) {
    		totalNombreJoueurs = totalNombreJoueurs + this.joueurs.get(i).getNombreDeJoueurs();
    	}
        return totalNombreJoueurs;
    }

    @Override
    public int getTotalButes() {
    	int totalButs = 0;
    	for(int i = 0 ; i<this.joueurs.size();i++) {
    		totalButs = totalButs + this.joueurs.get(i).getTotalButes();
    	}
        return totalButs;
    }

    public List<IComposite> getJoueurs() {
        return joueurs;
    }
}
