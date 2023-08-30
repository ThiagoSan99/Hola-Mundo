/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.punto;

import primer.punto.Entidad.Entidad;

public class PrimerPunto {

    
    public static void main(String[] args) {
        
        
       Entidad en = new Entidad();
       en=en.cargarLibro();
       en.mostrarLibro(en);
        
    }
    
}
