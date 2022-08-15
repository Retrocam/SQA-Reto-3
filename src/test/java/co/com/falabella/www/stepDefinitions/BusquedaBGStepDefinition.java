package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.tasks.BuscarProductos;
import co.com.falabella.www.userInterface.PDPUserInterface;
import co.com.falabella.www.utils.Models;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.List;

public class BusquedaBGStepDefinition {
    PDPUserInterface pdpUserInterface= new PDPUserInterface();

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^quiero buscar un producto$")
    public void quieroBuscarUnProducto(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarProductos.enFalabella(arg1.get(0).getProducto()));
    }
    @Then("^valido que me haya traido productos relacionado$")
    public void validoQueMeHayaTraidoProductosRelacionado(List<Models> arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(pdpUserInterface.TXT_TITULO
                .of()), WebElementStateMatchers.containsText(arg1.get(0).getValidar())));
    }
}
