package Entradas;

public class Entradas {
    
    private String codigo;
    private int cantidad;
    private int precio;
    private int venta;
    private int ganancia;

    public Entradas(String codigo, int cantidad, int precio, int venta, int ganancia) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.venta = venta;
        this.ganancia = ganancia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    

}
