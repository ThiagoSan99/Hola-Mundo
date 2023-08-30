/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCine;

import EntidadCine.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Hewlett Packard
 */
public class Comparadores {
    public static Comparator<Pelicula>ordenarDuracionDes=new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t1.getHoras().compareTo(t.getHoras());
       }
       
   };
    public static Comparator<Pelicula>ordenarTituloAlfa=new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
       }
       
   };
    public static Comparator<Pelicula>ordenarAutorAlfa=new Comparator<Pelicula>(){
       @Override
       public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
       }
       
   };
}
