package co.com.empresa.newexperience.tasks;

import co.com.empresa.newexperience.models.CrearCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.empresa.newexperience.userinterfaces.CrearCuentaOrientadaAFalloPage.*;
import static co.com.empresa.newexperience.userinterfaces.CrearCuentaOrientadaAFalloPage.BTN_CREAR_CUENTA;
import static co.com.empresa.newexperience.userinterfaces.CrearCuentaPage.*;

public class CrearCuentaEnTienda implements Task {
    private final CrearCuenta crearUnaCuenta;

    public CrearCuentaEnTienda(CrearCuenta crearUnaCuenta){
        this.crearUnaCuenta=crearUnaCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN),
                Ensure.that(LBL_CREATE_ACCOUNT).isDisplayed(),
                Enter.theValue(crearUnaCuenta.getEmail()).into(INPUT_EMAIL),
                Click.on(BTN_CREAR_CUENTA),
                Enter.theValue(crearUnaCuenta.getNombre()).into(INPUT_NOMBRE),
                Enter.theValue(crearUnaCuenta.getApellido()).into(INPUT_APELLIDO),
                Enter.theValue(crearUnaCuenta.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(crearUnaCuenta.getEmpresa()).into(INPUT_EMPRESA),
                Enter.theValue(crearUnaCuenta.getDireccion()).into(INPUT_DIRECCION),
                Enter.theValue(crearUnaCuenta.getCiudad()).into(INPUT_CIUDAD),
                Click.on(SELECT_ESTADO),
                SelectFromOptions.byVisibleText(crearUnaCuenta.getEstado()).from(SELECT_ESTADO),
                Enter.theValue(crearUnaCuenta.getCodigoPostal()).into(INPUT_CODIGO_POSTAL),
                Enter.theValue(crearUnaCuenta.getCelular()).into(INPUT_CELULAR),
                Enter.theValue(crearUnaCuenta.getAliasDireccion()).into(INPUT_ALIAS_DIRECCION),
                Click.on(BTN_REGISTRAR)

        );
    }
}
