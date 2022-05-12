package sport.match;

public class MatchDefensif implements MatchStrategy {
	
	private String strategy;
	
	public MatchDefensif() {
		this.strategy = matchStrategy();
	}
	
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	
	public String matchStrategy() {
		return "Nous allons utiliser une stratégie défensive pour ne pas perdre le match";
	}

}
