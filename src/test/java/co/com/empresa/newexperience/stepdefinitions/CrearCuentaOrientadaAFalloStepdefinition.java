package co.com.empresa.newexperience.stepdefinitions;

import co.com.empresa.newexperience.excepcion.ExcepcionesDeValidacion;
import co.com.empresa.newexperience.questions.factories.Validar;
import co.com.empresa.newexperience.tasks.factories.Gestiona;
import co.com.empresa.newexperience.utils.constant.Constantes;
import co.com.empresa.newexperience.utils.constant.MensajesDeExcepciones;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class CrearCuentaOrientadaAFalloStepdefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario de New Experience");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    //Crear cuenta con email invalido
    @Dado("un usuario que desea crear una cuenta")
    public void unUsuarioQueDeseaCrearUnaCuenta() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constantes.URL_NEWEXPERIENCE));
    }

    @Cuando("registra un email invalido")
    public void registraUnEmailInvalido() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.emailInvalido());
    }

    @Entonces("el debera ver un mensaje de error")
    public void elDeberaVerUnMensajeDeError() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensadeDeError(), Matchers.equalTo(true))
                .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR));
    }

    //Crear cuenta sin ingresar campos requeridos
    @Cuando("no llena los campos requeridos")
    public void noLlenaLosCamposRequeridos() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.cuentaSinRegistrarDatos());
    }

    @Entonces("vera un mensaje de error con los campos requeridos")
    public void veraUnMensajeDeErrorConLosCamposRequeridos() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensadeDeError(), Matchers.equalTo(true))
                .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR));
    }

}
