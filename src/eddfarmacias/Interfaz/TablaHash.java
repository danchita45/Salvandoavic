package eddfarmacias.Interfaz;
import java.util.ArrayList;
import java.util.TreeMap;

public class TablaHash {
    
    private final TreeMap<String, ArrayList<NodoLista>> tablaFarmacias;
    private final TreeMap<String, ArrayList<NodoLista>> tablaLocalidades;
    private final TreeMap<String, ArrayList<NodoLista>> tablaProductos;
    private final TreeMap<String, ArrayList<NodoLista>> tablaUbicaciones;
    
    public TablaHash() {
        tablaFarmacias = new TreeMap<>();
        tablaLocalidades = new TreeMap<>();
        tablaProductos = new TreeMap<>();
        tablaUbicaciones = new TreeMap<>();
    }
    
    public void agregarNodoLista(NodoLista nodo) {
        // Agregar a la tabla de Farmacias
        String claveFarmacia = nodo.getFarmacia().getNombre();
        if (tablaFarmacias.containsKey(claveFarmacia)) {
            tablaFarmacias.get(claveFarmacia).add(nodo);
        } else {
            ArrayList<NodoLista> listaFarmacias = new ArrayList<>();
            listaFarmacias.add(nodo);
            tablaFarmacias.put(claveFarmacia, listaFarmacias);
        }
        
        // Agregar a la tabla de Localidades
        String claveLocalidad = nodo.getLocalidad().getSucursal();
        if (tablaLocalidades.containsKey(claveLocalidad)) {
            tablaLocalidades.get(claveLocalidad).add(nodo);
        } else {
            ArrayList<NodoLista> listaLocalidades = new ArrayList<>();
            listaLocalidades.add(nodo);
            tablaLocalidades.put(claveLocalidad, listaLocalidades);
        }
        
        // Agregar a la tabla de Productos
        String claveProducto = nodo.getProducto().getClave();
        if (tablaProductos.containsKey(claveProducto)) {
            tablaProductos.get(claveProducto).add(nodo);
        } else {
            ArrayList<NodoLista> listaProductos = new ArrayList<>();
            listaProductos.add(nodo);
            tablaProductos.put(claveProducto, listaProductos);
        }
        
        // Agregar a la tabla de Ubicaciones
        String claveUbicacion = nodo.getUbicacion().getEstado() + "-" +
                                nodo.getUbicacion().getCiudad() + "-" +
                                nodo.getUbicacion().getMunicipio();
        if (tablaUbicaciones.containsKey(claveUbicacion)) {
            tablaUbicaciones.get(claveUbicacion).add(nodo);
        } else {
            ArrayList<NodoLista> listaUbicaciones = new ArrayList<>();
            listaUbicaciones.add(nodo);
            tablaUbicaciones.put(claveUbicacion, listaUbicaciones);
        }
    }
    
    public ArrayList<NodoLista> buscarPorFarmacia(String nombreFarmacia) {
        return tablaFarmacias.getOrDefault(nombreFarmacia, new ArrayList<>());
    }
    
    public ArrayList<NodoLista> buscarPorLocalidad(String sucursal) {
        return tablaLocalidades.getOrDefault(sucursal, new ArrayList<>());
    }
    
    public ArrayList<NodoLista> buscarPorProducto(String claveProducto) {
        return tablaProductos.getOrDefault(claveProducto, new ArrayList<>());
    }
    
    public ArrayList<NodoLista> buscarPorUbicacion(String estado, String ciudad, String municipio) {
        String claveUbicacion = estado + "-" + ciudad + "-" + municipio;
        return tablaUbicaciones.getOrDefault(claveUbicacion, new ArrayList<>());
    }
}
