package co.com.falabella.www.tasks;

import co.com.falabella.www.userInterface.PDPUserInterface;
import co.com.falabella.www.utils.Excel;
import co.com.falabella.www.utils.VariableGlobal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ValidarExcel implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    PDPUserInterface pdpUserInterface = new PDPUserInterface();


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            leerExcel = Excel.readExcel("Reto#3.xlsx","Validaciones");
        }catch (IOException E){
            E.printStackTrace();
        }
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(pdpUserInterface.TXT_TITULO
                .of()), WebElementStateMatchers.containsText(leerExcel.get(VariableGlobal.indice).get("Validar"))));

    }
    public static Performable enPDPFalabella(){
        return Instrumented.instanceOf(ValidarExcel.class).withProperties();
    }
}
