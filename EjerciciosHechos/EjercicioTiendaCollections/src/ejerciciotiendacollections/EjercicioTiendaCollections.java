/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiendacollections;

import ejerciciotiendacollections.ServicioTienda.ServicioTienda;
import java.util.Scanner;


public class EjercicioTiendaCollections {

    
    public static void main(String[] args) {
        ServicioTienda st = new ServicioTienda();
        Scanner leer = new Scanner(System.in);
        st.ServicioTienda();
        int opcion=0;
        
        do{
            System.out.println("       Menu       ");
            System.out.println(" ---------------- ");
            System.out.println(" 1: Crear Productos ");
            System.out.println(" 2: Mostrar Productos ");
            System.out.println(" 3: Eliminar Producto ");
            System.out.println(" 4: Editar Producto ");
            System.out.println(" 5: Salir ");
            System.out.print(" Digite opcion :");
            opcion = leer.nextInt();
            switch(opcion){
                case 1: st.crear();
                    break;
                case 2: st.mostrar();
                    break;
                case 3: st.eliminar();
                    break;
                case 4:st.editar();
                    break;
                case 5:
                    
            }
        }while(opcion!=5);
    }
    
}
