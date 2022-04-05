#Author: Floryan Kieffer & Celine Djeddi
@tag
Feature: US_001 Attribution de la performance de lentraineur
  En tant que Entraineur
  Je veux m’affecter une performance selon le dernier résultat de mon Equipe
  Afin de connaitre l’état de mes performances actuelles (Bon Moyen ou Mauvais).

  @tag1
  Scenario Outline: LEquipe de LEntraineur A joue un match contre LEquipe de LEntraineur B
    Given Un match le lEquipe de LEntraineur A contre LEquipe de lEntraineur B
    When Le match se termine sur le score Equipe de LEntraineur A <scoreA> vs <scoreB> Equipe de LEntraineur B
    Then Equipe A obtient <pointA> et Equipe B obtient <pointB> et Entraineur A est <perfA> Entraineur B est <perfB>

    Examples: 
      | scoreA  | scoreB | pointA  | pointB  | perfA  |   perfB     |
      |    2    |    1   |    3    |    0    | "Bon"  |  "Mauvais"  |
      |    2    |    2   |    1    |    1    | "Moyen"|  "Moyen"    |
