package co.com.falabella.www.interactions;

import co.com.falabella.www.userInterface.PDPUserInterface;
import co.com.falabella.www.utils.VariableGlobal;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import java.util.List;
import java.util.Random;

public class ClickRandom implements Interaction {
    PDPUserInterface pdpUserInterface = new PDPUserInterface();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Random random = new Random();
        List<WebElementFacade> listaBtnProductos = pdpUserInterface.BTN_PRODUCTO.resolveAllFor(actor);
        List<WebElementFacade> listaLblProductos = pdpUserInterface.LBL_PRODUCTO.resolveAllFor(actor);
        int numRandom = random.nextInt(listaBtnProductos.size());
        VariableGlobal.productoAleatorio = listaLblProductos.get(numRandom).getText();
        listaBtnProductos.get(numRandom).click();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public static Performable enCategoria(){
        return Instrumented.instanceOf(ClickRandom.class).withProperties();
    }
}
