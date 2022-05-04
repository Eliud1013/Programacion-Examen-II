
package Articulo;

import java.util.ArrayList;

public class ControladorArticulo {
    
    private ArrayList<Articulo> articuloStore = new ArrayList<>();
    private static ControladorArticulo controlador;
    
    public static ControladorArticulo getInstance(){
        if(controlador == null){
            controlador = new ControladorArticulo();
        }
        return controlador;
    }

    public ArrayList<Articulo> getArticuloStore() {
        return articuloStore;
    }

    public void setArticuloStore(ArrayList<Articulo> articuloStore) {
        this.articuloStore = articuloStore;
    }
    
    
    
    
    
}
