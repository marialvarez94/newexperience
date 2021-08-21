package co.com.empresa.newexperience.models.CrearCuentaBuilder;

import co.com.empresa.newexperience.models.CrearCuenta;
import javafx.util.Builder;


public class CrearCuentaBuilder implements Builder<CrearCuenta> {
    private  String email;
    private  String nombre;
    private  String apellido;
    private  String direccion;
    private  String password;
    private  String empresa;
    private  String ciudad;
    private  String estado;
    private  String codigoPostal;
    private  String celular;
    private  String aliasDireccion;

    public CrearCuentaBuilder() {
        this.email = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.password = "";
        this.empresa = "";
        this.ciudad = "";
        this.estado = "";
        this.codigoPostal = "";
        this.celular = "";
        this.aliasDireccion = "";
    }

    public static CrearCuentaBuilder crearCuenta(){
        return new CrearCuentaBuilder();
    }


    public CrearCuenta build() {
        return new CrearCuenta(this);
    }

    public CrearCuentaBuilder conEmail(String email){
        this.email = email;
        return this;
    }

    public CrearCuentaBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public CrearCuentaBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }
    public CrearCuentaBuilder conDireccion(String direccion){
        this.direccion = direccion;
        return this;
    }
    public CrearCuentaBuilder conPassword(String password){
        this.password = password;
        return this;
    }
    public CrearCuentaBuilder conEmpresa(String empresa){
        this.empresa = empresa;
        return this;
    }
    public CrearCuentaBuilder conCiudad(String ciudad){
        this.ciudad = ciudad;
        return this;
    }
    public CrearCuentaBuilder conEstado(String estado){
        this.estado = estado;
        return this;
    }
    public CrearCuentaBuilder conCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return this;
    }
    public CrearCuentaBuilder conCelular(String celular){
        this.celular = celular;
        return this;
    }
    public CrearCuentaBuilder conAliasDireccion(String aliasDireccion){
        this.aliasDireccion = aliasDireccion;
        return this;
    }


    public CrearCuenta crearCuentaEnNewExperience(){
        conNombre("Milena");
        conEmail("choucair@gmail.com");
        conApellido("Andrea");
        conDireccion("calle 80 # 54");
        conPassword("Comprar");
        conEmpresa("Choucair");
        conCiudad("Barranquilla");
        conEstado("California");
        conCodigoPostal("00000");
        conCelular("3104171898");
        conAliasDireccion("Mi direccion calle 80");
        return build();
    }
    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }

    public String getPassword() {
        return password;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getCelular() {
        return celular;
    }

    public String getAliasDireccion() {
        return aliasDireccion;
    }
}
