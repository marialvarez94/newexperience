package co.com.empresa.newexperience.excepcion;

public class ExcepcionesDeValidacion extends AssertionError{
    public ExcepcionesDeValidacion(String mensaje, Throwable throwable){
        super(mensaje, throwable);
    }
}
