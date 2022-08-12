#language: en
Feature: Busqueda de 3 productos

  Background:
    Given que me encuentro en la pagina de falabella https://www.falabella.com.co/falabella-co


  Scenario: Buscar productos en falabella
    When quiero buscar un producto
      | Producto            |
      | Pincho de Mazorca |
    Then valido que me haya traido productos relacionado
    When quiero buscar un producto
      | Producto    |
      | Juego De Mesa Fan Hasbro Gaming Risk|
    Then valido que me haya traido productos relacionado
    When quiero buscar un producto
      | Producto    |
      | Disfraz para Perro de HotDog|
    Then valido que me haya traido productos relacionado