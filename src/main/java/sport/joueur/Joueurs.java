package sport.joueur;

import java.util.ArrayList;
import java.util.List;

public class Joueurs implements IComposite {
    private List<IComposite> joueurs = new ArrayList<>();

    @Override
    public float getSalaire() {
        return joueurs.stream().map(j -> j.getSalaire()).reduce((s1, s2) -> s1 + s2).orElse(0f);
    }

    @Override
    public int getNombreDeJoueurs() {
        return joueurs.stream().map(j -> j.getNombreDeJoueurs()).reduce((n1, n2)-> n1+n2).orElse(0);
    }

    @Override
    public int getTotalButes() {
        return joueurs.stream().map(j -> j.getTotalButes()).reduce((n1, n2)-> n1+n2).orElse(0);
    }

    public List<IComposite> getJoueurs() {
        return joueurs;
    }
}
