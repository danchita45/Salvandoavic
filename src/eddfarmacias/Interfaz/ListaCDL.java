package eddfarmacias.Interfaz;

import java.io.Serializable;


/**
 *
 * @author VictorBack
 */
public class ListaCDL implements Serializable{
    
   NodoLista<Object> r = null;
    int t = 0;

    public boolean inserta(NodoLista n)
    {

        if (n != null)
        {
            if (r == null)
            {
                r = n;
                return true;
            } else
            {
                if (n.getEtiqueta().compareTo(r.getEtiqueta()) <= 0)
                {
                    n.setSig(r);
                    r.setAnt(n);
                    r = n;
                    return true;
                } else
                {
                    NodoLista aux = r;
                    while (aux.getSig() != null)
                    {
                        if (n.getEtiqueta().compareTo(aux.getEtiqueta()) >= 0 && n.getEtiqueta().compareTo(aux.getSig().getEtiqueta()) <= 0)
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            n.setAnt(aux);
                            n.getSig().setAnt(n);
                            return true;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                    aux.setSig(n);
                    n.setAnt(aux);
                }
            }
            t++;
        }
        return false;
    }

    public NodoLista eliminar(String etq)
    {

        if (r == null)
        {
            return null;
        } else
        {
            NodoLista encontrado = null;

            if (r.getEtiqueta().equals(etq) && r.getSig() == null)
            {
                encontrado = r;
                r = null;
            } else
            {
                if (etq.compareTo(r.getEtiqueta()) == 0)
                {
                    encontrado = r;
                    r = r.getSig();
                    encontrado.setSig(null);
                    r.setAnt(null);
                } else
                {
                    NodoLista aux = r.getSig();
                    while (aux != null)
                    {
                        if (etq.equals(aux.getEtiqueta()))
                        {
                            encontrado = aux;
                            NodoLista siguiente = aux.getSig();
                            NodoLista anterior = aux.getAnt();
                            if (siguiente != null)
                            {
                                siguiente.setAnt(anterior);
                                anterior.setSig(siguiente);
                            } else
                            {
                                anterior.setSig(null);
                            }
                            encontrado.setAnt(null);
                            encontrado.setSig(null);
                            break;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                }
            }
            t--;
            return encontrado;
        }
    }

    public String despConN()
    {
        String s = "";
        while (r != null)
        {
            if (r.getAnt() == null)
            {
                s += "Null <-" + r.getEtiqueta() + "->" + r.getSig().getEtiqueta();
            } else
            {
                if (r.getSig() == null)
                {
                    s += r.getAnt().getEtiqueta() + "<-" + r.getEtiqueta() + "-> Null";
                } else
                {
                    s += r.getAnt().getEtiqueta() + "<-" + r.getEtiqueta() + "->" + r.getSig().getEtiqueta();
                }
            }
            s += "\n";
            r = r.getSig();
        }
        return s;
    }

    public NodoLista buscar(String etq)
    {
        NodoLista encontrado = null;
        NodoLista aux = r;
        while (aux != null)
        {
            if (aux.getEtiqueta().equals(etq))
            {
                encontrado = aux;
                break;
            } else
            {
                aux = aux.getSig();
            }
        }
        return encontrado;
    }

    public String desp(NodoLista r)
    {
        String s = "";
        while (r != null)
        {
            s += r.getEtiqueta();
            r = r.getSig();
        }
        return s;
    }

    public NodoLista getr()
    {
        return r;
    }

    public void setr(NodoLista r)
    {
        this.r = r;
    }

    public int getT()
    {
        return t;
    }

    public void setT(int t)
    {
        this.t = t;
    }

    public void muestras()
    {
        String s = null;
        if (r != null)
        {
            NodoLista aux = r;
            if (null != aux.sig)
            {
                System.out.println("--->");
                System.out.println(r.etiqueta);
                aux = r.sig;
                muestras();
            } else
            {
                patras(s, aux);
            }
        } else
        {
            System.out.println("lista vacia");
        }
    }

    public void patras(String s, NodoLista lista)
    {
        NodoLista aux = lista;
        if (null != aux)
        {
            System.out.println("<---");
            System.out.println(lista.etiqueta);
            aux = lista.ant;
            patras(s, aux);
        }
    }

    public int count()
    {
        int i = 0;
        if (r != null)
        {
            NodoLista aux = r;
            while (aux != null)
            {
                i++;
                if (aux.getSig() == aux.getAnt())
                {

                    break;
                }
                aux = aux.sig;
            }
            return i;
        } else
        {
            return i;
        }

    }

    @Override
    public String toString()
    {
        return r.toString();
    }
}
