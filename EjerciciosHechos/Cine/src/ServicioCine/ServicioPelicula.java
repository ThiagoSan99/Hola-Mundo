/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCine;

import EntidadCine.Pelicula;
import java.util.*;

public class ServicioPelicula {
   static Scanner leer = new Scanner(System.in).useDelimiter("\n");
   ArrayList<Pelicula>peliculas= new ArrayList<>();
   public void crearAlumno(){
       String resp ;
       int x = 0;
      do{
        
        Pelicula pe = new Pelicula();
       
        System.out.print(" Digite el titulo de la pelicula :");
        pe.setTitulo(leer.next());
        System.out.print(" Digite el nombre del director :");
        pe.setDirector(leer.next());
        System.out.print(" Digite la duracion en horas de la pelicula ");
        pe.setHoras(leer.nextInt());
        System.out.print(" Desea añadair otro pelicula? s/n :");
        peliculas.add(pe);
        
        resp = leer.next();
        
      }while(resp.equals("s"));
   }
   public void mostrarPeliculas(){
        System.out.println(" las peliculas son:");
        
        for(int i=0;i<peliculas.size();i++){
            System.out.println(" ---------------------------- ");
            System.out.println("Titulo : "+peliculas.get(i).getTitulo());
            System.out.println("Director : "+peliculas.get(i).getDirector());
            System.out.println("Duración : "+peliculas.get(i).getHoras());
            System.out.println(" ---------------------------- ");
        }
   }
   public void mostrarPeliculasH(){
        System.out.println(" las peliculas que duran mas de una hora son:");
        for(int i=0;i<peliculas.size();i++){
            if(peliculas.get(i).getHoras()>1){
                System.out.println(" ---------------------------- ");
                System.out.println("Titulo : "+peliculas.get(i).getTitulo());
                System.out.println("Director : "+peliculas.get(i).getDirector());
                System.out.println("Duración : "+peliculas.get(i).getHoras());
                System.out.println(" ---------------------------- ");
            }
        }
   }
   public void mostrarPeliculasM(ArrayList <Pelicula> p){
        
        
        for(int i=0;i<p.size();i++){
            System.out.println(" ---------------------------- ");
            System.out.println("Titulo : "+p.get(i).getTitulo());
            System.out.println("Director : "+p.get(i).getDirector());
            System.out.println("Duración : "+p.get(i).getHoras());
            System.out.println(" ---------------------------- ");
        }
   }
   public void ordenarDurMayMen(){
       
       Collections.sort(peliculas, Comparadores.ordenarDuracionDes);
       System.out.println(" las peliculas en orden descendente son:");
       mostrarPeliculasM(peliculas);
   }
   public void ordenarDurMenMay(){
       Collections.sort(peliculas, Comparadores.ordenarDuracionDes);
       Collections.reverse(peliculas);
       System.out.println(" las peliculas en orden ascendente son:");
       mostrarPeliculasM(peliculas);
       
   } public void ordenarTitAlfa(){
       Collections.sort(peliculas, Comparadores.ordenarTituloAlfa);
       System.out.println(" las peliculas en orden alfabetico segun su titulo:");
       mostrarPeliculasM(peliculas);
   }
   public void ordenarDirAlfa(){
       Collections.sort(peliculas, Comparadores.ordenarAutorAlfa);
       System.out.println(" las peliculas en orden alfabetico segun su director son:");
       mostrarPeliculasM(peliculas);
   }
  
   
}
