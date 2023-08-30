/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadCine;

/**
 *
 * @author Hewlett Packard
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer horas;
    
    public Pelicula(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Pelicula(String titulo, String director, Integer horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }
}
