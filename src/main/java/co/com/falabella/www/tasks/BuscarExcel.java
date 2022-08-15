package co.com.falabella.www.tasks;

import co.com.falabella.www.userInterface.ProductosUI;
import co.com.falabella.www.utils.Excel;
import co.com.falabella.www.utils.VariableGlobal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarExcel implements Task {
    ProductosUI productosUI = new ProductosUI();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            leerExcel = Excel.readExcel("Reto#3.xlsx","Productos");
        }catch (IOException E){
            E.printStackTrace();
        }
        actor.attemptsTo(
                Enter.keyValues(leerExcel.get(VariableGlobal.indice).get("Producto")).into(productosUI.TXT_BARRA),
                Click.on(productosUI.BTN_BUSCAR)
        );

    }
    public static Performable enFalabella(){
        return Instrumented.instanceOf(BuscarExcel.class).withProperties();
    }
}
