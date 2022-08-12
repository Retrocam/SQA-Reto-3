package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.tasks.BuscarProductos;
import co.com.falabella.www.utils.Models;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.List;

public class BusquedaBGStepDefinition {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero buscar un producto$")
    public void quieroBuscarUnProducto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductos.enFalabella(arg1.get(0).getProducto()));


    }


    @Then("^valido que me haya traido productos relacionado$")
    public void validoQueMeHayaTraidoProductosRelacionado() {

    }

}
