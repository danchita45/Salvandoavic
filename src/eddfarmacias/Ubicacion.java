package eddfarmacias;

import java.io.Serializable;

/**
 *
 * @author VictorBack
 */
public class Ubicacion implements Serializable{

    public Ubicacion() {
    }
    
    String estado;
    String ciudad;
    String municipio;

    public Ubicacion(String estado, String ciudad) {
        this.estado = estado;
        this.ciudad = ciudad;
    }
    
    public Ubicacion(String estado, String ciudad, String municipio) {
        this.estado = estado;
        this.ciudad = ciudad;
        this.municipio = municipio;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    @Override
    public String toString() {
        return "Estado: " + estado + ", Ciudad: " + ciudad + ", Municipio: " + municipio;
    }
}
