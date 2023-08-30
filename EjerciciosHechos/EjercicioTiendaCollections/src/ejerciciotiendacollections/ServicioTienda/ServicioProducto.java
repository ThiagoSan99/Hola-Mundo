/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendacollections.ServicioTienda;

import java.util.*;

public class ServicioProducto {
   Scanner leer = new Scanner(System.in);
   
   public void crearProductos(HashMap<String, Double>productos){
       do {
            crearProducto(productos);
            System.out.println("desea seguir ingresando productos? (S/N)");
        } while(leer.nextLine().equalsIgnoreCase("s"));
   }
   public void crearProducto(HashMap<String, Double>productos){
       System.out.print("ingrese el nombre del producto: ");
        String nombre = leer.nextLine();
        System.out.print("ingrese el precio del producto: ");
        Double precio = Double.parseDouble(leer.nextLine());
        productos.put(nombre, precio);
   }
   public void mostrarProductos(HashMap<String, Double>productos){
       System.out.println(" Los productos existenmtes son ");
       for (Map.Entry<String, Double> aux : productos.entrySet()) {
           String key = aux.getKey();
           Double value = aux.getValue();
           System.out.println("Producto :"+key+", Precio: "+value);
           
       }
   }
   public void editarProducto(HashMap<String, Double>productos){
       mostrarProductos(productos);
       System.out.print(" Digite el nombre del producto :");
       String nom = leer.next();
       if(productos.containsKey(nom)){
           Double precio = productos.get(nom);
           System.out.println("producto " + nom + " encontrado, precio: " + precio);
           System.out.println("ingrese el nuevo precio: ");
           Double pre = leer.nextDouble();
           if(precio.equals(pre)){
               System.out.println(" Los precios son los mismos no se cambiara ");
           }else{
               productos.put(nom, pre);
               System.out.println("producto actualizado con exito");
           }
       }else{
           System.out.println(" El producto no se encuentra ");
       }
       
   }
   public void eliminarProducto(HashMap<String, Double>productos){
        mostrarProductos(productos);
       System.out.print(" Digite el nombre del producto que desea eliminar :");
       String nom = leer.next();
       if(productos.containsKey(nom)){
                  productos.remove(nom);
                  System.out.println("producto eliminado con exito");
        }else{
           System.out.println(" El producto no se encuentra ");
       }
   }
}
