package co.com.empresa.newexperience.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CrearCuenta.feature",
        glue = "co.com.empresa.newexperience.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@crearCuenta")



public class CrearCuentaRunner {
}
