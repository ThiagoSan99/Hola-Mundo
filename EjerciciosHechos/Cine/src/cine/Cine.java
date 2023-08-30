/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import ServicioCine.ServicioPelicula;

/**
 *
 * @author Hewlett Packard
 */
public class Cine {

    
    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        sp.crearAlumno();
        sp.mostrarPeliculas();
        sp.mostrarPeliculasH();
        sp.ordenarDurMayMen();
        sp.ordenarDurMenMay();
        sp.ordenarTitAlfa();
        sp.ordenarDirAlfa();
    }
    
}
