package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.driver.DriverScreenplay;
import co.com.falabella.www.tasks.BuscarProductos;
import co.com.falabella.www.userInterface.PDPUserInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import java.io.IOException;

public class BusquedaOutlineStepDefinition {
    PDPUserInterface pdpUserInterface= new PDPUserInterface();

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
    @Then("^valido que me haya traido el producto buscado (.*)$")
    public void validoQueMeHayaTraidoElProductoBuscado(String validar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(pdpUserInterface.TXT_TITULO.of()), WebElementStateMatchers.containsText(validar)));
    }
}
