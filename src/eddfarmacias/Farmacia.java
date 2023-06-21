package eddfarmacias;

import java.io.Serializable;
/**
 *
 * @author VictorBack
 */
public class Farmacia implements Serializable {
    
    String rfc;
    String nombre;
    String nFarmacia;
    String tipoSociedad;
    Farmacia siguiente;
    Farmacia abajo;
    
    
    public Farmacia(String rfc, String nombre, String nFarmacia, String tipoSociedad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.nFarmacia = nFarmacia;
        this.tipoSociedad = tipoSociedad;
        this.siguiente = null;
        this.abajo = null;
    }

    public Farmacia() {
    }
    // getters y setters

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnFarmacia() {
        return nFarmacia;
    }

    public void setnFarmacia(String nFarmacia) {
        this.nFarmacia = nFarmacia;
    }

    public String getTipoSociedad() {
        return tipoSociedad;
    }

    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }

    public Farmacia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Farmacia siguiente) {
        this.siguiente = siguiente;
    }

    public Farmacia getAbajo() {
        return abajo;
    }

    public void setAbajo(Farmacia abajo) {
        this.abajo = abajo;
    }

    public String toString() {
        return "RFC: " + rfc + ", Nombre: " + nombre + ", Número de farmacia: " + nFarmacia + ", Tipo de sociedad: " + tipoSociedad;
    }
}
