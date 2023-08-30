/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAhorcado {
    
    Scanner leer = new Scanner(System.in);
    
    
    
    public Ahorcado crearJuego(){
        
        Ahorcado ahorcado = new Ahorcado();
        
        System.out.print(" Digite una palabra para iniciar el juego: ");
        
        String palabra = leer.nextLine();
        
        int largo = palabra.length();
        
        
        
        ahorcado.setPalabra(palabra,largo);
        
        System.out.print(" Digite el numero de intentos para el juego :");
        
        ahorcado.setJugadasM(leer.nextInt());
        
        return ahorcado;
    }
    
    public void longitud(Ahorcado ahorcado){
        System.out.println(" La longitud de la palabra es "+ahorcado.getPalabra().length);
    }
    
    public boolean buscar(String l,Ahorcado ahorcado){
        boolean b = false;
        String[]aux=ahorcado.getPalabra();
        for(int i=0;i<ahorcado.getPalabra().length;i++){
            if(aux[i].equalsIgnoreCase(l)){
                b=true;
            }
        }
        if(b==true){
            System.out.println(" La letra si esta en la palabra ");
        }else{
             System.out.println(" La letra no esta en la palabra ");
        }
        
        
        
        return b;
    }
    public boolean buscarL(String l, Ahorcado ahorcado){
        boolean b = false;
        String[]aux=ahorcado.getPalabra();
        for(int i=0;i<ahorcado.getPalabra().length;i++){
            if(aux[i].equalsIgnoreCase(l)){
                b=true;
            }
        }
        return b;
    }
    public int contar(Ahorcado ahorcado,String l){
        int c=0;
        String[]aux=ahorcado.getPalabra();
        for(int i=0;i<ahorcado.getPalabra().length;i++){
            if(aux[i].equals(l)){
                c++;
            }
        }
        return c;
    }
    public boolean encontrar(String l,ArrayList<String>ing, Ahorcado ahorcado){
        boolean b=false;
        int c=0;
        if(buscarL(l,ahorcado)==true){
            if(ing.isEmpty()){
                c = contar(ahorcado, l);
                ing.add(l);
                ahorcado.setLetrasE(ahorcado.getLetrasE()+c);
                b=true;
            }else{
                if(ing.contains(l)==false){
                    c = contar(ahorcado, l);
                    ing.add(l);
                    ahorcado.setLetrasE(ahorcado.getLetrasE()+c);
                    b=true;
                }
            }
        }
        if(b==false){
            ahorcado.setJugadasM(ahorcado.getJugadasM()-1);
        }
        System.out.println(" Número de letras (encontradas, faltantes): ("+ahorcado.getLetrasE()+"),("+(ahorcado.getPalabra().length - ahorcado.getLetrasE()));
        return b;
    }
    
    public void intentos(Ahorcado ahorcado){
        System.out.println(" Al jugador le quedan "+ahorcado.getJugadasM()+" intentos ");
    }
    
    public void Juego(){
        Ahorcado a = new Ahorcado();
        a=crearJuego();
        String l;
        ArrayList <String> lista = new ArrayList <>();
        while(a.getJugadasM()>0 && a.getLetrasE()!=a.getPalabra().length){
            
            leer.nextLine();
            
            System.out.print(" Digite una letra ");
            
            l = leer.nextLine();
            
            longitud(a);
            
            buscar(l,a);
            
            encontrar(l,lista,a);
            
            intentos(a);
        }
            
            
        
    }
}
