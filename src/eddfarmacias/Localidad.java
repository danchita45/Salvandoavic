package eddfarmacias;

import java.io.Serializable;

/**
 *
 * @author VictorBack
 */
public class Localidad implements Serializable{

    public Localidad() {
    }
    
    String clave;
    String nombre;
    String codigoPostal;

    public Localidad(String sucursal, String clave, String nombre) {

        this.clave = clave;
        this.nombre = nombre;
    }
    
    public Localidad(String sucursal, String clave, String nombre, String codigoPostal) {

        this.clave = clave;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public Localidad(String sucursal, String clave) {

        this.clave = clave;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Override
    public String toString() {
        return  " Clave: " + clave + ", Nombre: " + nombre + ", Código Postal: " + codigoPostal;
    }
}
