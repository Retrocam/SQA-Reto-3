package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.driver.DriverScreenplay;
import co.com.falabella.www.tasks.BuscarProductos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class BusquedaOutlineStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que me encuentro en la pagina de falabella(.*)$")
    public void queMeEncuentroEnLaPaginaDeFalabella(String url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverScreenplay.chromeDrive(url)));

    }


    @When("^ingreso la palabra (.*) al buscador$")
    public void ingresoLaPalabraRelojTissotAlBuscador(String Producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductos.enFalabella(Producto));

    }

    @Then("^valido que me haya traido el producto buscado$")
    public void validoQueMeHayaTraidoElProductoBuscado() {

    }
    }
