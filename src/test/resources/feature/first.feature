#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_000 Affectation des points
  En tant que Equipe
  Je veux calculer mes points et mes points cumules en fonction du résultat du match
  Afin de de assurer la tracabilité de mes resultats dans le championnat


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