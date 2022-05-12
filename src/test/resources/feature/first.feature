#Author: Floryan Kieffer & Celine Djeddi
@tag
Feature: US_000 Affectation des points
  En tant que Equipe
  Je veux calculer mes points et mes points cumules en fonction du résultat du match
  Afin d assurer la tracabilité de mes resultats dans le championnat


  @tag1
  Scenario Outline: Equipe A joue un match contre Equipe B
    Given Le match opposant equipe A et equipe B 
    When le match se termine sur le score de <scoreA> - <scoreB>
    Then Equipe A obtient <pointA> et Equipe B obtient <pointB> et Equipe A a <cumulA> Equipe B a <cumulB>

    Examples: 
      |  scoreA | scoreB | pointA  | pointB | cumulA | cumulB |
      | 	 2    |     1  | 		3    |    0   |		 3	 |    0   |
      | 	 3    |     0  | 		3    |    0   |		 3	 |    0   |
      | 	 1    |     1  | 		1    |    1   |		 1	 |    1   |
      | 	 0    |     0  | 		1    |    1   |		 1	 |    1   |