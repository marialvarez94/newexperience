package co.com.empresa.newexperience.stepdefinitions;

import co.com.empresa.newexperience.excepcion.ExcepcionesDeValidacion;
import co.com.empresa.newexperience.questions.factories.ElementoVisible;
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

import static co.com.empresa.newexperience.userinterfaces.RealizarCompraPage.*;

public class RealizarCompraStepdefinition {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario de New Experience");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constantes.URL_NEWEXPERIENCE));
    }

    @Dado("un usuario con una cuenta activa e inicia sesión")
    public void unUsuarioConUnaCuentaActivaEIniciaSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.inicioDeSesionCorrecto());
    }
    @Cuando("^agrega (.*) productos al carrito y realiza el flujo de compra$")
    public void agregaProductosAlCarritoYRealizaElFlujoDeCompra(int cantidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(Gestiona.unFlujoDeCompra(cantidad));
    }
    @Entonces("verá su orden completada")
    public void veraSuOrdenCompletada() {
        OnStage.
                theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(ElementoVisible.validarElemento(LBL_ORDEN_COMPLETADA), Matchers.equalTo("ORDER CONFIRMATION"))
                        .orComplainWith(ExcepcionesDeValidacion.class, MensajesDeExcepciones.MENSAJE_ERROR)
                );
    }

}
