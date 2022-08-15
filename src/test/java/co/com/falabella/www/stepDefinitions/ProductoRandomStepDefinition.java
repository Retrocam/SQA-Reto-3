package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.tasks.ProductoAleatorio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.io.IOException;

public class ProductoRandomStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^ingreso a una categoria$")
    public void ingresoAUnaCategoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductoAleatorio.enFalabella());
    }
    @Then("^selecciono un producto aleatorio$")
    public void seleccionoUnProductoAleatorio() {
    }
}
