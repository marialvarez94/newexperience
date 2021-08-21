package co.com.empresa.newexperience.questions;

import co.com.empresa.newexperience.userinterfaces.CrearCuentaOrientadaAFalloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class MensajeError implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CrearCuentaOrientadaAFalloPage.LBL_ERROR).viewedBy(actor).asBoolean();
    }
}
