package co.com.empresa.newexperience.utils.constant;

public enum DatosDeCuenta {
    EMAIL_INVALIDO("alvarezmaria513@gmail"),
    EMAIL_VALIDO("alvarezperez@gmail.com"),
    EMAIL_INICIO_SESION("alvarezmaria513@gmail.com"),
    PASSWORD_INICIO_SESION("Comprar"),
    PASSWORD_INCORRECTO("Compras123");

    private final String datos;
    DatosDeCuenta(String datos) {
        this.datos=datos;
    }
    public String getDatosDeCuenta() {
        return datos;
    }
}
