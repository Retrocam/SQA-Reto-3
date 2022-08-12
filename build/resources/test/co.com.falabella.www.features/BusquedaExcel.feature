#language: en
Feature: Busqueda de 3 productos

  Scenario: Buscar 3 productos en falabella
    Given que me encuentro en la pagina de falabella
    When ingreso una palabra  al buscador
    Then valido que me haya traido el producto relacionado