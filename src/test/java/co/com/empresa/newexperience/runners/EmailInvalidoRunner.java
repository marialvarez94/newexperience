package co.com.empresa.newexperience.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CrearCuentaOrientadaAFallo.feature",
        glue = "co.com.empresa.newexperience.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@emailInvalido")



public class EmailInvalidoRunner {
}
