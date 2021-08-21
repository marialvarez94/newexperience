package co.com.empresa.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuentaOrientadaAFalloPage {
    private CrearCuentaOrientadaAFalloPage() {
        throw new IllegalStateException("Esta clase no se debe instanciar");
    }

    public static final Target BTN_SIGN = Target.the("Login").located(By.xpath("//a[@class='login']"));
    public static final Target LBL_CREATE_ACCOUNT = Target.the("Crear Cuenta").located(By.xpath("//*[text()='Create an account']"));
    public static final Target INPUT_EMAIL = Target.the("Ingresar Email").located(By.id("email_create"));
    public static final Target BTN_CREAR_CUENTA = Target.the("Selecciona Crear Cuenta").located(By.id("SubmitCreate"));
    public static final Target LBL_ERROR = Target.the("Mensaje de Error").located(By.xpath("//div[@class='alert alert-danger']"));
    public static final Target BTN_REGISTRAR = Target.the("Boón Registrar").located(By.id("submitAccount"));



}
