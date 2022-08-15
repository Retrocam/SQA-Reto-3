package co.com.falabella.www.stepDefinitions;

import co.com.falabella.www.tasks.BuscarExcel;
import co.com.falabella.www.tasks.ValidarExcel;
import co.com.falabella.www.utils.VariableGlobal;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


public class BusquedaExcelStepDefinition {
    @When("^ingreso una palabra  al buscador$")
    public void ingresoUnaPalabraAlBuscador() {
        VariableGlobal.indice = 0;
        for (int i =0; i < 3; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(BuscarExcel.enFalabella());
            OnStage.theActorInTheSpotlight().attemptsTo(ValidarExcel.enPDPFalabella());
            VariableGlobal.indice++;
        }

    }

    @Then("^valido que me haya traido el producto relacionado$")
    public void validoQueMeHayaTraidoElProductoRelacionado() {

    }
}
