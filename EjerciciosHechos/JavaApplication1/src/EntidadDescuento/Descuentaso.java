/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadDescuento;

/**
 *
 * @author Hewlett Packard
 */
public class Descuentaso {
    private String producto;
    private double precio;
    private double descuento;

    public Descuentaso(String producto, double precio, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public Descuentaso(){
        
    }
    public Descuentaso(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
