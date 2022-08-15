package co.com.falabella.www.tasks;

import co.com.falabella.www.interactions.ClickRandom;
import co.com.falabella.www.userInterface.ProductosUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProductoAleatorio implements Task {
    ProductosUI productosUI = new ProductosUI();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(productosUI.BTN_BANNER),
                ClickRandom.enCategoria()
        );
    }
    public static Performable enFalabella(){
        return Instrumented.instanceOf(ProductoAleatorio.class).withProperties();
    }
}
