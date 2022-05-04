package Modales;

import Modales.Usuarios;
import java.util.ArrayList;


public class Controlador {
        ArrayList<Usuarios> usuariosStore = new ArrayList<>();
    static Controlador controlador;
    

    public static Controlador getInstance(){
        if(controlador == null){
            controlador = new Controlador();
        }
        return controlador;
    
    }

    public ArrayList<Usuarios> getControlador() {
        return usuariosStore;
    }

    public void setControlador(ArrayList<Usuarios> usuariosStore) {
        this.usuariosStore = usuariosStore;
    }
}
