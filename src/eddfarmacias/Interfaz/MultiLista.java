package eddfarmacias.Interfaz;

/**
 *
 * @author LIPM
 */
import eddfarmacias.Interfaz.ListaCDL;
import java.io.Serializable;

public class MultiLista implements Serializable
{

    NodoLista<Object> r = null;

    //n= dato a agregar
    //r= lista anterior
    public NodoLista inserta(String[] s, int nivel, NodoLista n, NodoLista r)
    {
        ListaCDL lista = new ListaCDL();
        if (nivel == s.length - 1) {
            lista.setr(r);
            lista.inserta(n);
            return lista.getr();
        } else {
            lista.setr(r);
            NodoLista nodo = lista.buscar(s[nivel]);
            if (nodo == null) {
                System.out.println("Error");
            } else {
                nodo.setAbajo(inserta(s, nivel + 1, n, nodo.getAbajo()));
            }
            return r;
        }
    }

    public void muestra(NodoLista r, String s)
    {
        while (r != null) {
            System.out.println(s + r.getEtiqueta());
            muestra(r.getAbajo(), s + "\t");
            r = r.getSig();
        }
    }

    public void borrar(NodoLista r, String s[], int nivel, NodoLista n[])
    {
        if (nivel == s.length - 1) {
            ListaCDL lista = new ListaCDL();
            lista.setr(r);
            n[1] = lista.eliminar(s[nivel]);
            n[0] = lista.getr();
        } else {
            ListaCDL lista = new ListaCDL();
            lista.setr(r);
            NodoLista aux = lista.buscar(s[nivel]);
            if (aux != null) {
                borrar(aux.getAbajo(), s, nivel + 1, n);
                aux.setAbajo(n[0]);
                n[0] = r;
            } else {
                n[0] = r;
            }
        }
    }

    public NodoLista borrarRetornado(NodoLista r, String s[], int nivel, NodoLista n[])
    {
        if (nivel == s.length - 1) {
            ListaCDL lista = new ListaCDL();
            lista.setr(r);
            n[1] = lista.eliminar(s[nivel]);
            n[0] = lista.getr();
            return n[1];
        } else {
            ListaCDL lista = new ListaCDL();
            lista.setr(r);
            NodoLista aux = lista.buscar(s[nivel]);
            if (aux != null) {
                borrarRetornado(aux.getAbajo(), s, nivel + 1, n);
                aux.setAbajo(n[0]);
                n[0] = r;
            } else {
                n[0] = r;
            }
            
        }
        return n[1];
    }

    public NodoLista busca(NodoLista r, String s)
    {
        if (r != null) {
            if (r.getAnt().getEtiqueta().compareTo(s) < 0 || r.getEtiqueta().compareTo(s) > 0) {
                return null;
            }
            NodoLista aux = r;
            do {
                if (aux.getEtiqueta().equals(s)) {
                    return aux;
                }
                if (aux.getEtiqueta().compareTo(s) > 0) {
                    return null;
                }
                aux = aux.getSig();
            } while (aux != r);
        }
        return null;
    }

    public NodoLista<Object> getR()
    {
        return r;
    }

    public void setR(NodoLista<Object> r)
    {
        this.r = r;
    }

}
