/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioPais;

import java.util.*;

/**
 *
 * @author Hewlett Packard
 */
public class ServicioPais {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String>paises=new TreeSet();
    
    public void añadirPais(){
       String resp ;
       
      do{
        System.out.print(" Digite el nombre del pais :");
        paises.add(leer.next());
        
        System.out.print(" Desea añadair otro pais? s/n :");
        
        
        resp = leer.next();
        
      }while(resp.equals("s"));
   }
    public void mostrarPais(){
        System.out.println(" Los paises que hay son ");
        for(String pais:paises){
            
            System.out.println("-"+pais);
        }
    }
    public void buscarEliPais(){
        boolean b = false;
        Iterator iterator = paises.iterator();
        mostrarPais();
        System.out.println(" Digite el pais a eliminar :");
        String pa = leer.next();
        while(iterator.hasNext()){
            if(iterator.next().equals(pa)){
                iterator.remove();
                b=true;
                
            }
        }
        if(b==false){
            System.out.println(" El pais no se encuentra en la lista");
        }
    }
}