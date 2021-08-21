package co.com.empresa.newexperience.stepdefinitions;

import co.com.empresa.newexperience.excepcion.ExcepcionesDeValidacion;
import co.com.empresa.newexperience.models.CrearCuentaBuilder.CrearCuentaBuilder;
import co.com.empresa.newexperience.questions.factories.Validar;
import co.com.empresa.newexperience.tasks.factories.Gestiona;
import co.com.empresa.newexperience.utils.constant.MensajesDeExcepciones;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class CrearCuentaStepdefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario de New Experience");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Cuando("ingresa su información personal")
    public void ingresaSuInformacionPersonal() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.crearCuenta(CrearCuentaBuilder.crearCuenta().crearCuentaEnNewExperience()));
    }

    @Entonces("el debera tener acceso a su cuenta")
    public void elDeberaTenerAccesoASuCuenta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.cuenta(), Matchers.equalTo(true))
                .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR));
    }


}
