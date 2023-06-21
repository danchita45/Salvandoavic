package eddfarmacias.Interfaz;

public class ArbolBinario
{
    NodoArbol r = null;

    public NodoArbol getR()
    {
        return r;
    }

    public void setR(NodoArbol r)
    {
        this.r = r;
    }
    
    public NodoArbol Inserta(NodoArbol r, NodoArbol n)
    {
        if (r == null)
        {
            return n;
        } else
        {
            if (r.getEtiqueta().compareTo(n.getEtiqueta())<0)
            {
                r.setDerecha(Inserta(r.getDerecha(),n));
            }else
            {
                r.setIzquierda(Inserta(r.getIzquierda(),n));
            }
            return r;
        }
        
    }
    
     public void Enorden(NodoArbol r)
        {
            if (r != null)
            {
                Enorden(r.getIzquierda());
                System.out.print(r.getEtiqueta());
                Enorden(r.getDerecha());
            }
        }
     
     public void Preorden(NodoArbol r)
        {
            if (r != null)
            {
                System.out.print(r.getEtiqueta());
                Preorden(r.getIzquierda());
                Preorden(r.getDerecha());
            }
        }
     
     public void Posorden(NodoArbol r)
        {
            if (r != null)
            {
                Posorden(r.getIzquierda());
                Posorden(r.getDerecha());
                System.out.print(r.getEtiqueta());
            }
        }
     
     public void eliminar(NodoArbol r, String datoE, NodoArbol arr[])
     {
         if (r != null)
         {
             if (r.getEtiqueta().equals(datoE))
             {
                 arr[1] = r;
                 if (r.getIzquierda() == null && r.getDerecha() == null)
                 {
                    arr[0] = null;
                 }else
                 {
                     if (!(r.getDerecha() != null && r.getIzquierda() != null))
                     {
                         if (r.getIzquierda() != null)
                         {
                             arr[0] = r.getIzquierda();
                             r.izquierda = null;
                         }else
                         {
                             arr[0] = r.getDerecha();
                             r.derecha = null;
                         }
                     }else
                     {
                         if (r.getDerecha() == null && r.getIzquierda() == null)
                         {
                             arr[0] = r.getDerecha();
                             r.getDerecha().setIzquierda(r.getIzquierda());
                         }else
                         {
                             NodoArbol seo = sucesorEnOrden(r.getDerecha());
                             arr[0] = seo.getIzquierda();
                             seo.setIzquierda(seo.getIzquierda().getDerecha());
                             arr[0].setDerecha(r.getDerecha());
                             arr[0].setIzquierda(r.getIzquierda());
                             r.setDerecha(null);
                             r.setIzquierda(null);
                         }
                     }
                 }
             }else
             {
                 if (r.getEtiqueta().compareTo(datoE)>0)
                 {
                     eliminar(r.getIzquierda(), datoE, arr);
                     r.setIzquierda(arr[0]);
                 }else
                 {
                     eliminar(r.getDerecha(), datoE, arr);
                     r.setDerecha(arr[0]);
                 }
                 arr[0]=r;
             }
             
         }else
         {
             arr[0] = r;
             arr[1] = null;
         }
     }
     
     
     public NodoArbol sucesorEnOrden(NodoArbol r)
     {
         if (r.getIzquierda().getIzquierda() != null)
         {
             return sucesorEnOrden(r.getIzquierda());
         }else
         {
             return r;
         }
     }
     
     public NodoArbol busqueda(NodoArbol r, String etq)
    {
        NodoArbol encontrado = null;
        if (r != null)
        {
            if (r.getEtiqueta().compareToIgnoreCase(etq) == 0)
            {
                encontrado = r;
            } else
            {
                if (r.getEtiqueta().compareToIgnoreCase(etq) > 0)
                {
                    encontrado = busqueda(r.getIzquierda(), etq);
                } else
                {
                    encontrado = busqueda(r.getDerecha(), etq);
                }
            }
        } else
        {
            return null;
        }
        return encontrado;
    }
}
