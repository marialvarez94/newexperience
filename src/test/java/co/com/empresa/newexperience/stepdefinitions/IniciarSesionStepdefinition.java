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

public class IniciarSesionStepdefinition {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario de New Experience");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    //Inicio de Sesion Incorrecto
    @Dado("un usuario con una cuenta activa")
    public void unUsuarioConUnaCuentaActiva() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constantes.URL_NEWEXPERIENCE));
    }

    @Cuando("el envia sus credenciales incorrectas")
    public void elEnviaSusCredencialesIncorrectas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.inicioDeSesionIncorrecto());
    }

    @Entonces("no podrá tener acceso a su cuenta y verá un error")
    public void noPodraTenerAccesoASuCuentaYVeraUnError() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensadeDeError(), Matchers.equalTo(true))
                .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR));
    }

    //Inicio de Sesion Correcto
    @Cuando("el envia sus credenciales correctas")
    public void elEnviaSusCredencialesCorrectas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.inicioDeSesionCorrecto());
    }

    @Entonces("debera tener acceso para gestionar su cuenta")
    public void deberaTenerAccesoParaGestionarSuCuenta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.cuenta(), Matchers.equalTo(true))
                .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR));
    }
}
