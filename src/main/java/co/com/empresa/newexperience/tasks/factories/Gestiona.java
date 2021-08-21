package co.com.empresa.newexperience.tasks.factories;

import co.com.empresa.newexperience.models.CrearCuenta;
import co.com.empresa.newexperience.tasks.*;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Gestiona {
    private Gestiona(){

    }

    public static Performable emailInvalido(){
        return instrumented(CrearCuentaEmailInvalido.class);
    }
    public static Performable cuentaSinRegistrarDatos(){
        return instrumented(CrearCuentaSinRegistrarDatos.class);
    }
    public static Performable crearCuenta(CrearCuenta crearUnaCuenta){
        return instrumented(CrearCuentaEnTienda.class, crearUnaCuenta);
    }
    public static Performable inicioDeSesionIncorrecto(){
        return instrumented(InicioSesionIncorrecto.class);
    }
    public static Performable inicioDeSesionCorrecto(){
        return instrumented(InicioSesionCorrecto.class);
    }
    public static Performable unFlujoDeCompra(int cantidad){
        return instrumented(RealizarCompra.class, cantidad);
    }
    public static Performable agregarProductosAlCarrito(int cantidad){
        return instrumented(AgregarProductos.class, cantidad);
    }
}
