/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

import ServicioPerro.Servicio;


public class Perro {

    
    
    public static void main(String[] args) {
        Servicio sr = new Servicio();
        sr.agregarRaza();
        sr.mostrarR();
        
        sr.eliminarR(sr.buscar());
        sr.mostrarR();
    }
    
}
