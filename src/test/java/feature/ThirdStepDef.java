package feature;

import sport.main.Entraineur;
import sport.match.MatchDefensif;
import sport.match.MatchOffensif;
import sport.match.MatchPossession;
import sport.match.MatchStrategy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class ThirdStepDef{
	
	private Entraineur entraineurA;
	@Given("Un match de lEquipe de LEntraineur A")
	public void un_match_de_lEquipe_de_LEntraineur_A() {
		entraineurA = new Entraineur();
	    Assert.assertTrue(this.entraineurA!=null);
	    throw new PendingException();
	}

	@When("LEntraineur choisit une strategy")
	public void lentraineur_choisit_une_strategy() {
	   
	    throw new PendingException();
	}

	@Then("Strategy offensive {string} ou une strategy defensive {string} ou une strategy de possession {string}")
	public void strategy_offensive_ou_une_strategy_defensive_ou_une_strategy_de_possession(String string, String string2, String string3) {
		MatchStrategy off = new MatchOffensif();
		entraineurA.setStrategyEntraineur(off);
    	assertEquals(string, off.matchStrategy());
    	assertEquals(off,entraineurA.getStrategyEntraineur());
    	MatchStrategy def = new MatchDefensif();
    	entraineurA.setStrategyEntraineur(def);
    	assertEquals(string2, def.matchStrategy());
    	assertEquals(def,entraineurA.getStrategyEntraineur());
    	MatchStrategy pos = new MatchPossession();
    	entraineurA.setStrategyEntraineur(pos);
    	assertEquals(string3, pos.matchStrategy());
    	assertEquals(pos,entraineurA.getStrategyEntraineur());
	    throw new PendingException();
	}
	
}

