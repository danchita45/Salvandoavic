package eddfarmacias;

import java.io.Serializable;

/**
 *
 * @author VictorBack
 */
public class Producto implements Serializable{

    public Producto(String nombre, String clave, double precio) {
        this.nombre = nombre;
        this.clave = clave;
        this.precio = precio;
    }

    public Producto(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    
    
    String nombre;
    String clave;
    double precio;
    int existencia;

    public Producto() {
    }
    
    public Producto(String nombre, String clave, double precio, int existencia) {
        this.nombre = nombre;
        this.clave = clave;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
}
