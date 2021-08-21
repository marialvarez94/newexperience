package co.com.empresa.newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.empresa.newexperience.userinterfaces.CrearCuentaOrientadaAFalloPage.*;
import static co.com.empresa.newexperience.userinterfaces.CrearCuentaOrientadaAFalloPage.BTN_CREAR_CUENTA;
import static co.com.empresa.newexperience.utils.constant.DatosDeCuenta.EMAIL_VALIDO;

public class CrearCuentaSinRegistrarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN),
                Ensure.that(LBL_CREATE_ACCOUNT).isDisplayed(),
                Enter.theValue(EMAIL_VALIDO.getDatosDeCuenta()).into(INPUT_EMAIL),
                Click.on(BTN_CREAR_CUENTA),
                Ensure.that(LBL_CREATE_ACCOUNT).isDisplayed(),
                Click.on(BTN_REGISTRAR)
        );
    }

}
