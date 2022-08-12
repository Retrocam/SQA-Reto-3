package co.com.falabella.www.tasks;

import co.com.falabella.www.userInterface.ProductosUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class BuscarProductos implements Task {
    ProductosUI productosUI = new ProductosUI();
    private String producto;

    public BuscarProductos(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(productosUI.TXT_BARRA),
                Enter.keyValues(Keys.ENTER).into(productosUI.TXT_BARRA)
        );

    }
    public static Performable enFalabella(String Producto){
        return Instrumented.instanceOf(BuscarProductos.class).withProperties(Producto);
    }
}
