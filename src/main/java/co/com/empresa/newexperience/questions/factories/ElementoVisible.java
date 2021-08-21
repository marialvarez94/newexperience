package co.com.empresa.newexperience.questions.factories;

import co.com.empresa.newexperience.questions.ValidarTexto;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoVisible {
    private ElementoVisible() {
    }

    public static Question<String> validarElemento(Target objeto){
        return new ValidarTexto(objeto);
    }
}
