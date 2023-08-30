/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopaises;

import ServicioPais.ServicioPais;

/**
 *
 * @author Hewlett Packard
 */
public class EjercicioPaises {

    
    
    public static void main(String[] args) {
        ServicioPais sp = new ServicioPais();
        
        sp.añadirPais();
        sp.buscarEliPais();
        sp.mostrarPais();
    }
    
}
