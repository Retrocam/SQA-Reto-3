#language: en
Feature: Busqueda de 3 productos

  Background:
    Given que me encuentro en la pagina de falabella https://www.falabella.com.co/falabella-co


  Scenario: Buscar productos en falabella
    When quiero buscar un producto
      | Producto          |
      | Pincho de Mazorca |
    Then valido que me haya traido productos relacionado
      | Validar           |
      | Pincho de Mazorca |
    When quiero buscar un producto
      | Producto                             |
      | Risk Hasbro |
    Then valido que me haya traido productos relacionado
      | Validar                              |
      | Juego De Mesa Fan Hasbro Gaming Risk |
    When quiero buscar un producto
      | Producto                     |
      | Disfraz para Perro de HotDog |
    Then valido que me haya traido productos relacionado
      | Validar                      |
      | Disfraz para Perro de HotDog |