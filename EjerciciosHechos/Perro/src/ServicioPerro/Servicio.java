/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPerro;

import Entidad.Perro;
import java.util.*;

public class Servicio {
    Perro pe = new Perro();
    Scanner leer = new Scanner(System.in);
    public void agregarRaza(){
        String resp = "s";
        do{
            System.out.print(" Digite la raza :");
            String raza = leer.nextLine();
            pe.getRaza().add(raza);
            System.out.print(" Desea introducir otra raza? s/n ");
            resp = leer.nextLine();
        }while(resp.equals("s"));
        
        
    }
    public void mostrarR(){
        for(String raza : pe.getRaza()){
            System.out.println(raza);
        }
    }
    public String buscar(){
        mostrarR();
        System.out.println(" Digite la raza que desea buscar :");
        String raza = leer.nextLine();
        for(int i=0; i<pe.getRaza().size();i++){
            if(pe.getRaza().get(i).equals(raza)){
                return pe.getRaza().get(i);
            }
        }
        return null;
    }
    public void eliminarR(String perro){
        for(int i=0; i<pe.getRaza().size();i++){
            if(pe.getRaza().get(i).equals(perro)){
                pe.getRaza().remove(i);
            }
        }
    }
}
