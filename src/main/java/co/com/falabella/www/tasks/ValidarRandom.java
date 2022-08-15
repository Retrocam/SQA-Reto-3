package co.com.falabella.www.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ValidarRandom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static Performable enPDPFalabella(){
        return Instrumented.instanceOf(ValidarRandom.class).withProperties();
    }

}
