package co.com.empresa.newexperience.models;

import co.com.empresa.newexperience.models.CrearCuentaBuilder.CrearCuentaBuilder;

public class CrearCuenta {
    private final String email;
    private final String nombre;
    private final String apellido;
    private final String direccion;
    private final String password;
    private final String empresa;
    private final String ciudad;
    private final String estado;
    private final String codigoPostal;
    private final String celular;
    private final String aliasDireccion;

    public CrearCuenta(CrearCuentaBuilder sesionDesdeBuilder){
        this.email = sesionDesdeBuilder.getEmail();
        this.nombre = sesionDesdeBuilder.getNombre();
        this.apellido = sesionDesdeBuilder.getApellido();
        this.direccion = sesionDesdeBuilder.getDireccion();
        this.password = sesionDesdeBuilder.getPassword();
        this.empresa = sesionDesdeBuilder.getEmpresa();
        this.ciudad = sesionDesdeBuilder.getCiudad();
        this.estado = sesionDesdeBuilder.getEstado();
        this.codigoPostal = sesionDesdeBuilder.getCodigoPostal();
        this.celular = sesionDesdeBuilder.getCelular();
        this.aliasDireccion = sesionDesdeBuilder.getAliasDireccion();
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
