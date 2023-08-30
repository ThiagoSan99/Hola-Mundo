/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioDescuento;

import EntidadDescuento.Descuentaso;
import java.util.Scanner;


/**
 *
 * @author Hewlett Packard
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in);
    
    public double calcularDescuento(Descuentaso s){
        System.out.println(1-s.getDescuento());
        double des = (s.getPrecio()*(1-s.getDescuento()));
        return des;
    }
    
}
