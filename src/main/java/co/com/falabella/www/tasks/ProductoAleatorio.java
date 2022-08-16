package co.com.falabella.www.tasks;

import co.com.falabella.www.interactions.ClickRandom;
import co.com.falabella.www.userInterface.PDPUserInterface;
import co.com.falabella.www.userInterface.ProductosUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoAleatorio implements Task {
    ProductosUI productosUI = new ProductosUI();
    PDPUserInterface pdpUserInterface = new PDPUserInterface();


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(productosUI.BTN_BANNER, isVisible()),
                Click.on(productosUI.BTN_BANNER),
                WaitUntil.the(pdpUserInterface.BTN_PRODUCTO, isVisible()),
                ClickRandom.enCategoria()
        );
    }
    public static Performable enFalabella(){
        return Instrumented.instanceOf(ProductoAleatorio.class).withProperties();
    }
}
