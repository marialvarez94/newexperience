package co.com.empresa.newexperience.tasks;

import co.com.empresa.newexperience.userinterfaces.IniciarSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.empresa.newexperience.userinterfaces.IniciarSesionPage.*;
import static co.com.empresa.newexperience.utils.constant.DatosDeCuenta.*;

public class InicioSesionIncorrecto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN),
                Enter.theValue(EMAIL_INICIO_SESION.getDatosDeCuenta()).into(IniciarSesionPage.INPUT_EMAIL),
                Enter.theValue(PASSWORD_INCORRECTO.getDatosDeCuenta()).into(INPUT_PASS),
                Click.on(BTN_INICIAR_SESION)
        );
    }
}
