package Entradas;

import java.util.ArrayList;


public class ControladorEntradas {
     ArrayList<Entradas> entradasStore = new ArrayList<>();
    static ControladorEntradas controlador;
    

    public static ControladorEntradas getInstance(){
        if(controlador == null){
            controlador = new ControladorEntradas();
        }
        return controlador;
    
    }

    public ArrayList<Entradas> getEntradasStore() {
        return entradasStore;
    }

    public void setEntradasStore(ArrayList<Entradas> entradasStore) {
        this.entradasStore = entradasStore;
    }
    
    
    
}
