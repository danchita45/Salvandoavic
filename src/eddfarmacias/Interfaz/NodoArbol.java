package eddfarmacias.Interfaz;

public class NodoArbol
{
    Object Nodo;
    NodoArbol izquierda = null;
    NodoArbol derecha = null;
    String etiqueta;

    public NodoArbol()
    {
        
    }

    public NodoArbol(String etiqueta,Object Nodo)
    {
        this.Nodo = Nodo;
        this.etiqueta = etiqueta;
    }

    public Object getNodo()
    {
        return Nodo;
    }

    public void setNodo(Object Nodo)
    {
        this.Nodo = Nodo;
    }

    public NodoArbol getIzquierda()
    {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda)
    {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha()
    {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha)
    {
        this.derecha = derecha;
    }

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }
    
    
}
