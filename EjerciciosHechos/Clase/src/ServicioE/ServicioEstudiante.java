/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioE;

import Entidad.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioEstudiante {
   ArrayList<Estudiante>estudiantes = new ArrayList<>();
   static Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public void crearAlumno(){
       String resp ;
       int x = 0;
      do{
        
        Estudiante e = new Estudiante();
       
        System.out.print(" Digite el nombre del alumno :");
        e.setNombre(leer.next());
        System.out.println(" Digite las 3 notas del estudiante ");
        x = leer.nextInt();
        e.getNotas().add(x);
        x = leer.nextInt();
        e.getNotas().add(x);
        x = leer.nextInt();
        e.getNotas().add(x);
        estudiantes.add(e);
        System.out.print(" Desea añadair otro estudianyte? s/n :");
        
        
        resp = leer.next();
        
      }while(resp.equals("s"));
   }
   public void mostrarE(){
       System.out.println(" Los estudiantes son :");
       
       
       for(int i=0; i<estudiantes.size();i++){
           System.out.println(estudiantes.get(i).getNombre());
           System.out.println(" Sus notas:");
           for (Integer nota : estudiantes.get(i).getNotas()) {
               System.out.println(nota);
           }
           
       }
    }
   public double notaFinal(){
       double nota = 0.0;
       int suma=0;
       boolean b=false;
       mostrarE();
       System.out.print(" Digite el nombre del estudiante :");
       String e = leer.next();
       for(int i=0; i<estudiantes.size();i++){
           if(estudiantes.get(i).getNombre().equals(e)){
               for(int j=0;j<estudiantes.get(i).getNotas().size();j++){
                   suma = suma + estudiantes.get(i).getNotas().get(j);
                   b=true;
               }
           }
       }
       if(b==false){
           System.out.println(" No esta el estudiante");
       }else{
           System.out.println(" El promedio del estudiante fue :");
       }
       nota = suma/3;
       return nota;
   }
       
       
    
    

}
