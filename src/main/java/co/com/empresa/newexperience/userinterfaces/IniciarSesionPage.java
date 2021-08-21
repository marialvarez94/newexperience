package co.com.empresa.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage {
    private IniciarSesionPage() {
        throw new IllegalStateException("Esta clase no se debe instanciar");
    }

    public static final Target BTN_SIGN = Target.the("Login").located(By.xpath("//a[@class='login']"));
    public static final Target INPUT_EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target INPUT_PASS = Target.the("Password").located(By.id("passwd"));
    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar Sesion").located(By.id("SubmitLogin"));


}
