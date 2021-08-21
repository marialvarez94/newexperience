package co.com.empresa.newexperience.tasks;

import co.com.empresa.newexperience.userinterfaces.RealizarCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class AgregarProductos implements Task {
    private int cantidad;

    public AgregarProductos(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i =1; i<=cantidad; i++) {
            actor.attemptsTo(
                    JavaScriptClick.on(RealizarCompraPage.BTN_AGREGAR.of(String.valueOf(i))),
                    Click.on(RealizarCompraPage.BTN_CONTINUAR));
        }
    }
}
