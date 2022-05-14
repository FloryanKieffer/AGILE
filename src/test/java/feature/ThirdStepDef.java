package feature;

import sport.main.Entraineur;
import sport.main.MatchDefensif;
import sport.main.MatchOffensif;
import sport.main.MatchPossession;
import sport.main.MatchStrategy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class ThirdStepDef{
	
	private Entraineur entraineurA;

	private MatchStrategy def;
	private MatchStrategy off;
	private MatchStrategy pos;

	@Given("Un match de lEquipe de LEntraineur A")
	public void un_match_de_lEquipe_de_LEntraineur_A() {
		this.entraineurA = new Entraineur();
	    Assert.assertTrue(this.entraineurA!=null);
	    
	}

	@When("LEntraineur choisit une strategy")
	public void lentraineur_choisit_une_strategy() {
		this.off = new MatchOffensif();
		this.def = new MatchDefensif();
		this.pos = new MatchPossession();
	}

	@Then("Strategy offensive {string} ou une strategy defensive {string} ou une strategy de possession {string}")
	public void strategy_offensive_ou_une_strategy_defensive_ou_une_strategy_de_possession(String string, String string2, String string3) {
		
		this.entraineurA.setStrategyEntraineur(this.off);
    	assertEquals(string, this.off.matchStrategy());
    	assertEquals(this.off,this.entraineurA.getStrategyEntraineur());
    	
    	this.entraineurA.setStrategyEntraineur(this.def);
    	assertEquals(string2, def.matchStrategy());
    	assertEquals(this.def,this.entraineurA.getStrategyEntraineur());
    	
    	this.entraineurA.setStrategyEntraineur(this.pos);
    	assertEquals(string3, pos.matchStrategy());
    	assertEquals(this.pos,this.entraineurA.getStrategyEntraineur());
	    
	}
	
}

