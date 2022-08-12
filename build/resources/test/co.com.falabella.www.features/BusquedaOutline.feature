#language: en
Feature: Busqueda de 5 productos

  Scenario Outline: <Caso><Producto>
    Given que me encuentro en la pagina de falabella<Url>
    When ingreso la palabra <Producto> al buscador
    Then valido que me haya traido el producto buscado

    Examples:
      | Caso            | Producto         | Url                                       |
      | Buscar producto | Masas y Plastilinas Play Doh Core Dentista Bromista| https://www.falabella.com.co/falabella-co |
      | Buscar producto | Como Se Dicen Mil Palabras Inglés - Lexus| https://www.falabella.com.co/falabella-co |
      | Buscar producto | Hielera Bash Plata 23x50 cm| https://www.falabella.com.co/falabella-co |
      | Buscar producto | Posavasos de Pizarra       | https://www.falabella.com.co/falabella-co |
      | Buscar producto | Krypto & Superman       | https://www.falabella.com.co/falabella-co |

