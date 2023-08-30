/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import ServicioE.ServicioEstudiante;

/**
 *
 * @author Hewlett Packard
 */
public class Clase {

    
    
    public static void main(String[] args) {
        ServicioEstudiante s = new ServicioEstudiante();
        s.crearAlumno();
        System.out.println(s.notaFinal());
    }
    
}
