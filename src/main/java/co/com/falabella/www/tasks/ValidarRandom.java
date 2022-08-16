package co.com.falabella.www.tasks;

import co.com.falabella.www.userInterface.PDPUserInterface;
import co.com.falabella.www.utils.VariableGlobal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class ValidarRandom implements Task {
    PDPUserInterface pdpUserInterface = new PDPUserInterface();

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(pdpUserInterface.TXT_TITULO
                .of()), WebElementStateMatchers.containsText(VariableGlobal.productoAleatorio)));

    }
    public static Performable enPDPFalabella(){
        return Instrumented.instanceOf(ValidarRandom.class).withProperties();
    }

}
