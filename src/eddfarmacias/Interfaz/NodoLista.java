package eddfarmacias.Interfaz;

import java.io.Serializable;

/**
 *
 * @author moica
 */
public class NodoLista<T> implements Serializable{
    
    public String etiqueta;
    T obj;
    NodoLista sig, ant, abajo,arriba;

    public NodoLista()
    {
    }

    public NodoLista(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
        this.sig = null;
        this.ant = null;
        this.abajo = null;
        this.arriba = null;
    }

    public NodoLista getArriba()
    {
        return arriba;
    }

    public void setArriba(NodoLista arriba)
    {
        this.arriba = arriba;
    }

    public NodoLista getAbajo()
    {
        return abajo;
    }

    public void setAbajo(NodoLista abajo)
    {
        this.abajo = abajo;
    }

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public NodoLista getSig()
    {
        return sig;
    }

    public void setSig(NodoLista sig)
    {
        this.sig = sig;
    }

    public NodoLista getAnt()
    {
        return ant;
    }

    public void setAnt(NodoLista ant)
    {
        this.ant = ant;
    }

    @Override
    public String toString()
    {
        return "NodoLista{" + "etiqueta=" + etiqueta + ", obj=" + obj + ", sig=" + sig + ", ant=" + ant + '}';
    }

    
}

