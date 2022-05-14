package sport.main;

public class MatchPossession implements MatchStrategy {
	
	private String strategy;
	
	public MatchPossession() {
		this.strategy = matchStrategy();
	}
	
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	public String matchStrategy() {
		return "Nous allons utiliser une stratégie de possesion pour endormir l'adversaire et gagner le match";
	}
}
