package sport.main;

import java.util.ArrayList;

public class Entraineur {

	// variables d'instance - remplacez l'exemple qui suit par le vôtre
	private Equipe equipe;
	private String perf;
	private ArrayList<Equipe> historique;
	private MatchStrategy strategyEntraineur;

	/**
	 * Constructeur d'objets de classe Entraineur
	 */
	public Entraineur() {
		// initialisation des variables d'instance
		equipe = null;
		perf = "";
		historique = new ArrayList<Equipe>();
		strategyEntraineur = null;
	}

	public ArrayList<Equipe> getHistorique() {
		return historique;
	}

	public void setHistorique(Equipe equipe) {
		this.historique.add(equipe);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe a) {
		this.equipe = a;
		this.setHistorique(a);
	}

	public void setPerf(String perf) {
		this.perf = perf;
	}

	public String getPerf() {
		return this.perf;
	}
	
	public MatchStrategy getStrategyEntraineur() {
		return strategyEntraineur;
	}

	public void setStrategyEntraineur(MatchStrategy strategy) {
		this.strategyEntraineur = strategy;
	}

	public void performance() {
		performanceEntraineur();
	}

	public void performanceEntraineur() {
		if (equipe.getPoints() == 3) {
			perf = "Bon";
		} else if (equipe.getPoints() == 1) {
			perf = "Moyen";
		} else {
			perf = "Mauvais";
		}
	}

	public void ajouterEquipe(Equipe equipe) {
		this.historique.add(equipe);
	}

	public void supprimerEquipe(Equipe equipe) {
		this.historique.remove(equipe);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + ((historique == null) ? 0 : historique.hashCode());
		result = prime * result + ((perf == null) ? 0 : perf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entraineur other = (Entraineur) obj;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (historique == null) {
			if (other.historique != null)
				return false;
		} else if (!historique.equals(other.historique))
			return false;
		if (perf == null) {
			if (other.perf != null)
				return false;
		} else if (!perf.equals(other.perf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entraineur [equipe=" + equipe + ", historique=" + historique + ", perf=" + perf + "]";
	}

}
