#language: en
Feature: Busqueda de 5 productos

  Scenario Outline: <Caso> <Producto>
    Given que me encuentro en la pagina de falabella<Url>
    When ingreso la palabra <Producto> al buscador
    Then valido que me haya traido el producto buscado <Validar>

    Examples:
      | Caso            | Producto                                            | Url                                       | Validar                                             |
      | Buscar producto | Masas y Plastilinas Play Doh Core Dentista Bromista | https://www.falabella.com.co/falabella-co | Masas y Plastilinas Play Doh Core Dentista Bromista |
      | Buscar producto | Como Se Dicen Mil Palabras Ingles - Lexus           | https://www.falabella.com.co/falabella-co | Como Se Dicen Mil Palabras Ingles - Lexus           |
      | Buscar producto | Hielera Bash Plata 23x50 cm                         | https://www.falabella.com.co/falabella-co | Hielera Bash Plata 23x50 cm                         |
      | Buscar producto | Posavasos de Pizarra                                | https://www.falabella.com.co/falabella-co | Posavasos de Pizarra                                |
      | Buscar producto | Krypto & Superman                                   | https://www.falabella.com.co/falabella-co | Krypto & Superman                                   |

