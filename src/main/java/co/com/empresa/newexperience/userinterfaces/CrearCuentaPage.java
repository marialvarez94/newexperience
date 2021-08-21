package co.com.empresa.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuentaPage {
    private CrearCuentaPage() {
        throw new IllegalStateException("Esta clase no se debe instanciar");
    }

    public static final Target INPUT_NOMBRE = Target.the(" Nombre").located(By.id("customer_firstname"));
    public static final Target INPUT_APELLIDO = Target.the("Apellido").located(By.id("customer_lastname"));
    public static final Target INPUT_DIRECCION = Target.the("Direccion").located(By.id("address1"));
    public static final Target INPUT_PASSWORD = Target.the("Password").located(By.id("passwd"));
    public static final Target INPUT_EMPRESA = Target.the("Empresa").located(By.id("company"));
    public static final Target INPUT_CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target SELECT_ESTADO = Target.the("Estado").located(By.id("id_state"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Codigo Postal").located(By.id("postcode"));
    public static final Target INPUT_CELULAR = Target.the("Celular").located(By.id("phone_mobile"));
    public static final Target INPUT_ALIAS_DIRECCION = Target.the("Alias Direccion").located(By.id("alias"));
    public static final Target LBL_CUENTA = Target.the("Cuenta").located(By.xpath("//p[@class='info-account']"));

}
