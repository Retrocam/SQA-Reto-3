package co.com.falabella.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co.com.falabella.www.features/BusquedaExcel.feature",
        glue = "co.com.falabella.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class BusquedaExcelRunner {
}
