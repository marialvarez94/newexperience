package co.com.empresa.newexperience.questions;

import co.com.empresa.newexperience.userinterfaces.CrearCuentaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CuentaCreada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CrearCuentaPage.LBL_CUENTA).viewedBy(actor).asBoolean();
    }
}
