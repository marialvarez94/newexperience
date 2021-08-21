package co.com.empresa.newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTexto implements Question<String> {
    private  final Target objeto;

    public ValidarTexto(Target objeto) {
        this.objeto = objeto;
    }

    @Override
    public String answeredBy(Actor actor) {
        return objeto.resolveFor(actor).getText();
    }
}
