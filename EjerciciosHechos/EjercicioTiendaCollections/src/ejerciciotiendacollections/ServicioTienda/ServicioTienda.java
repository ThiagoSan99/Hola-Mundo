/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendacollections.ServicioTienda;

import ejerciciotiendacollections.EntidadTienda.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




public class ServicioTienda {
    private Scanner scan;
    private ServicioProducto productoServicio;
    private HashMap<String, Double> productos;

    public void ServicioTienda() {
        this.scan = new Scanner(System.in);
        this.productoServicio = new ServicioProducto();
        this.productos = new HashMap<>();
        
    }
    public void crear(){
        productoServicio.crearProductos(productos);
    }
    public void mostrar(){
        productoServicio.mostrarProductos(productos);
    }
    public void editar(){
        productoServicio.editarProducto(productos);
    }
    public void eliminar(){
        productoServicio.eliminarProducto(productos);
    }
}
