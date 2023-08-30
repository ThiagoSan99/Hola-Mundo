
package Entidad;


public class Ahorcado {
    
    private String[]Palabra ;
    private int jugadasM ;
    private int letrasE;

    public Ahorcado(String[] Palabra, int jugadasM, int letrasE) {
        this.Palabra = Palabra;
        this.jugadasM = jugadasM;
        this.letrasE = letrasE;
    }

    public String[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(String p,int x) {
        Palabra = new String[x];
        
        for(int i=0;i<x;i++){
            Palabra[i]=p.substring(i,i+1);
        }
    }

    

    public int getJugadasM() {
        return jugadasM;
    }

    public void setJugadasM(int jugadasM) {
        this.jugadasM = jugadasM;
    }

    public int getLetrasE() {
        return letrasE;
    }

    public void setLetrasE(int letrasE) {
        this.letrasE = letrasE;
    }

   
    
    public Ahorcado(){
        
    }
    
}
