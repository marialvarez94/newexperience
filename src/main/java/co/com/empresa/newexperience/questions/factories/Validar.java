package co.com.empresa.newexperience.questions.factories;

import co.com.empresa.newexperience.questions.CuentaCreada;
import co.com.empresa.newexperience.questions.MensajeError;
import net.serenitybdd.screenplay.Question;

public class Validar {
    private Validar() {
    }

    public static Question<Boolean> mensadeDeError(){
        return new MensajeError();
    }
    public static Question<Boolean> cuenta(){
        return new CuentaCreada();
    }


}
