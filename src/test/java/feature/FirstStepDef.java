package feature;

import sport.main.Equipe;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class FirstStepDef{
	
	private Equipe a;
	private Equipe b;
	
	@Given("Le match opposant equipe A et equipe B")
	public void le_match_opposant_equipe_A_et_equipe_B() {
		this.a = new Equipe();
		this.b = new Equipe();
	    Assert.assertTrue(this.a!=null);
	    Assert.assertTrue(this.b!=null);
	}

	@When("le match se termine sur le score de {int} - {int}")
	public void le_match_se_termine_sur_le_score_de(Integer int1, Integer int2) {
	    Equipe.match(a, int1, b, int2);
	}

	@Then("Equipe A obtient {int} et Equipe B obtient {int} et Equipe A a {int} Equipe B a {int}")
	public void equipe_A_obtient_et_Equipe_B_obtient_et_Equipe_A_a_Equipe_B_a(Integer int1, Integer int2, Integer int3, Integer int4) {
		Integer scoreA = new Integer(this.a.getPoints());
		Integer scoreB = new Integer(this.b.getPoints());
	    assertEquals(int1, scoreA);
	    assertEquals(int2, scoreB);
	    Integer cumulA = new Integer(this.a.getPointsCumul());
	    Integer cumulB = new Integer(this.b.getPointsCumul());

		Integer scoreA1 = a.getPoints();
		Integer scoreB1 = b.getPoints();
	    assertEquals(int1, scoreA1);
	    assertEquals(int2, scoreB1);
	    assertEquals(int3, scoreA1);
	    assertEquals(int4, scoreB1);
	}
	
}


