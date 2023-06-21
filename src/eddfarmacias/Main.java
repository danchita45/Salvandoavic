package eddfarmacias;

import eddfarmacias.Interfaz.ArbolBinario;
import eddfarmacias.Interfaz.NodoArbol;

public class Main
{
    public static void main(String[] args)
    {
        ArbolBinario ab = new ArbolBinario();
        NodoArbol arr[] = new NodoArbol [2];
        
        NodoArbol r = null;
        NodoArbol n1 = new NodoArbol("E",null);
        NodoArbol n2 = new NodoArbol("C",null);
        NodoArbol n3 = new NodoArbol("G",null);
        NodoArbol n4 = new NodoArbol("A",null);
        NodoArbol n5 = new NodoArbol("D",null);
        NodoArbol n6 = new NodoArbol("F",null);
        NodoArbol n7 = new NodoArbol("I",null);
        NodoArbol n8 = new NodoArbol("B",null);
        NodoArbol n9 = new NodoArbol("H",null);
        
        ab.setR(ab.Inserta(ab.getR(), n1));
        ab.setR(ab.Inserta(ab.getR(), n2));
        ab.setR(ab.Inserta(ab.getR(), n3));
        ab.setR(ab.Inserta(ab.getR(), n4));
        ab.setR(ab.Inserta(ab.getR(), n5));
        ab.setR(ab.Inserta(ab.getR(), n6));
        ab.setR(ab.Inserta(ab.getR(), n7));
        ab.setR(ab.Inserta(ab.getR(), n8));
        ab.setR(ab.Inserta(ab.getR(), n9));
        
        ab.eliminar(ab.getR(), "I", arr);
        ab.setR(arr[0]);
        
        ab.Enorden(ab.getR());
        System.out.println("");
        ab.Preorden(ab.getR());
        System.out.println("");
        ab.Posorden(ab.getR());
        System.out.println("");
    }
}
