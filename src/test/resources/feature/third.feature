#Author: Floryan Kieffer & Celine Djeddi
@tag
Feature: US_002 Strategy de lentraineur
  En tant que Entraineur
  Je veux mettre en place une strategy pour mon prochain match.
  Afin de gagner ou ne pas perdre un match.

  @tag1
  Scenario Outline: LEntraineur A met en place une strategy pour son prochain match
    Given Un match de lEquipe de LEntraineur A
    When LEntraineur choisit une strategy
    Then Strategy offensive <strategyOff> ou une strategy defensive <strategyDef> ou une strategy de possession <strategyPos>

    Examples: 
      |                                    strategyOff                                  |                                 strategyDef                                     |                                               strategyPos                                                   | 
      |      "Nous allons utiliser une stratégie offensive pour gagner le match"        |     "Nous allons utiliser une stratégie défensive pour ne pas perdre le match"  |       "Nous allons utiliser une stratégie de possesion pour endormir l'adversaire et gagner le match"       |    