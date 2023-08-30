/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.punto.Entidad;

import java.util.*;

public class Entidad {
    static Scanner leer = new Scanner(System.in);
            
    private String ISBN;
    private String titulo;
    private String autor;
    private int num_pagina;

    public Entidad cargarLibro(){
        Entidad en;
        System.out.print(" Digite el ISBN del libro: ");
        String isbn = leer.next();
        System.out.print(" Digite el titulo del libro: ");
        String tit = leer.next();
        System.out.print(" Digite el autor del libro ");
        String au = leer.next();
        System.out.print(" Digite el numero de paginas del libro: ");
        int pg = leer.nextInt();
        en = new Entidad(isbn,tit,au,pg);
        return en;
    }
    public void mostrarLibro(Entidad l){
        System.out.println(" El titulo del libro es "+ l.getTitulo());
        System.out.println(" El autor del libro es "+ l.getAutor());
        System.out.println(" El isbn del libro es "+ l.getISBN());
        System.out.println(" El numero de paginas que tiene es "+l.getNum_pagina());
    }
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pagina() {
        return num_pagina;
    }

    public void setNum_pagina(int num_pagina) {
        this.num_pagina = num_pagina;
    }

    public Entidad(String ISBN, String titulo, String autor, int num_pagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pagina = num_pagina;
    }
    public Entidad(){
        
    }
    
}
