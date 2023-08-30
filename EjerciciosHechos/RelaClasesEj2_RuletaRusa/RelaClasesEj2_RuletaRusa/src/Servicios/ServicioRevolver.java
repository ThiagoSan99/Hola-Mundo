package Servicios;
import java.util.*;

import Entidades.Revolver;

public class ServicioRevolver {
	
	Revolver revolver = new Revolver();
	
	public void llenarRevolver() {
		
		Random random = new Random();

		int posicionAleatoria = random.nextInt(6);
		
		revolver.setPosicionAgua(posicionAleatoria);
		revolver.setPosicionTambor(posicionAleatoria);
		
		
		

		
	}
	
	public boolean mojar() {
		return revolver.getPosicionAgua() == revolver.getPosicionTambor();
	}
	
	public void siguienteChorro() {
		if(!mojar() && revolver.getPosicionTambor()<6) {
			revolver.setPosicionTambor(revolver.getPosicionTambor()+1);
		}else if (!mojar()){
			revolver.setPosicionTambor(0);
		}
	}
	
	
	
	
}
