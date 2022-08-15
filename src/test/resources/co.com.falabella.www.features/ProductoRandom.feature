#language: en
Feature: Busqueda de un producto
  Background:
    Given que me encuentro en la pagina de falabella https://www.falabella.com.co/falabella-co

  Scenario: Buscar un producto random en falabella
    When ingreso a una categoria
    Then selecciono un producto aleatorio