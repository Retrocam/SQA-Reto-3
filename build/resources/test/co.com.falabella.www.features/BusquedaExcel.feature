#language: en
Feature: Busqueda de 3 productos
  Background:
    Given que me encuentro en la pagina de falabella https://www.falabella.com.co/falabella-co
  Scenario: Buscar 3 productos en falabella
    When ingreso una palabra  al buscador
    Then valido que me haya traido el producto relacionado