package co.com.empresa.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RealizarCompraPage {
    private RealizarCompraPage() {
        throw new IllegalStateException("Esta clase no se debe instanciar");
    }

    public static final Target BTN_WOMEN = Target.the("Selecciona Women").located(By.xpath("(//li//a[@class='sf-with-ul'])[1]"));
    public static final Target BTN_AGREGAR = Target.the("Agregar al carrito").locatedBy("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[{0}]");
    public static final Target BTN_CONTINUAR = Target.the("Selecciona Continuar").located(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']"));
    public static final Target BTN_CART = Target.the("Selecciona Carrito").located(By.xpath("//a[@title='View my shopping cart']"));
    public static final Target BTN_CHECKOUT = Target.the("Selecciona Checkout").located(By.id("button_order_cart"));
    public static final Target BTN_SCROLL = Target.the("scroll").located(By.xpath("//a[@title='Continue shopping']"));
    public static final Target BTN_PROCEED_CHECKOUT = Target.the("Selecciona Proced Checkout").located(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
    public static final Target NAV_DIRECCION= Target.the("Estado Dirección").located(By.xpath("(//*[text()='Addresses'])[1]"));
    public static final Target BTN_PROCEED = Target.the("Estado Dirección").located(By.xpath("//button[@class='button btn btn-default button-medium']"));
    public static final Target CHECK_TERMINOS = Target.the("Selecciona Terminos").located(By.id("cgv"));
    public static final Target BTN_PROCEED_TO_CHECKOUT = Target.the("Selecciona Terminos").located(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
    public static final Target BTN_PAY_BANK = Target.the("Selecciona Pay by bank").located(By.xpath("//a[@title='Pay by bank wire']"));
    public static final Target LBL_ORDEN_COMPLETADA = Target.the("Ver orden Completada").located(By.xpath("(//*[text()='Order confirmation'])[2]"));

}
