package sport.match;

public class MatchOffensif implements MatchStrategy {
	
	private String strategy;
	
	public MatchOffensif() {
		this.strategy = matchStrategy();
	}
	
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String matchStrategy() {
		return "Nous allons utiliser une stratégie offensive pour gagner le match";
	}

}
