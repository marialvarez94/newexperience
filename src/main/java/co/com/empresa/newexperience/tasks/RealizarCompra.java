package co.com.empresa.newexperience.tasks;

import co.com.empresa.newexperience.tasks.factories.Gestiona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.empresa.newexperience.userinterfaces.RealizarCompraPage.*;


public class RealizarCompra implements Task {
    private final int cantidad;

    public RealizarCompra(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_WOMEN),
                Gestiona.agregarProductosAlCarrito(cantidad),
                Click.on(BTN_CART),
                JavaScriptClick.on(BTN_CHECKOUT),
                Scroll.to(BTN_SCROLL),
                JavaScriptClick.on(BTN_PROCEED_CHECKOUT),
                Ensure.that(NAV_DIRECCION).isDisplayed(),
                Click.on(BTN_PROCEED),
                Click.on(CHECK_TERMINOS),
                Click.on(BTN_PROCEED_TO_CHECKOUT),
                Click.on(BTN_PAY_BANK),
                Click.on(BTN_PROCEED)
        );
    }
}
