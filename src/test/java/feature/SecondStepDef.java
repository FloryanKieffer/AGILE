package feature;

import sport.main.Equipe;
import sport.main.Entraineur;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class SecondStepDef{
	
	private Equipe a;
	private Equipe b;
	private Entraineur entraineurA;
	private Entraineur entraineurB;
	
	@Given("Un match le lEquipe de LEntraineur A contre LEquipe de lEntraineur B")
	public void un_match_le_lEquipe_de_LEntraineur_A_contre_LEquipe_de_lEntraineur_B() {
		a = new Equipe();
	    b = new Equipe();
	    entraineurA = new Entraineur();
	    entraineurB = new Entraineur();
	    entraineurA.setEquipe(a);
	    entraineurB.setEquipe(b);
	    Assert.assertTrue(this.a!=null); Assert.assertTrue(this.b!=null);
	    Assert.assertTrue(this.entraineurA!=null);
	  	Assert.assertTrue(this.entraineurB!=null);
	    Assert.assertTrue(this.entraineurA.getEquipe()!=null);
	    Assert.assertTrue(this.entraineurB.getEquipe()!=null);
	}

	@When("Le match se termine sur le score Equipe de LEntraineur A {int} vs {int} Equipe de LEntraineur B")
	public void le_match_se_termine_sur_le_score_Equipe_de_LEntraineur_A_vs_Equipe_de_LEntraineur_B(Integer int1, Integer int2) {
		Equipe.match(a, int1, b, int2);
	}

	@Then("Equipe A obtient {int} et Equipe B obtient {int} et Entraineur A est {string} Entraineur B est {string}")
	public void equipe_A_obtient_et_Equipe_B_obtient_et_Entraineur_A_est_Entraineur_B_est(Integer int1, Integer int2, String string, String string2) {

	    Integer scoreA = new Integer(a.getPoints());
		Integer scoreB = new Integer(b.getPoints());
	    assertEquals(int1, scoreA);
	    assertEquals(int2, scoreB);
	    entraineurA.performance();
	    entraineurB.performance();
	    assertEquals(string, entraineurA.getPerf());
	    assertEquals(string2, entraineurB.getPerf());
	}
}

