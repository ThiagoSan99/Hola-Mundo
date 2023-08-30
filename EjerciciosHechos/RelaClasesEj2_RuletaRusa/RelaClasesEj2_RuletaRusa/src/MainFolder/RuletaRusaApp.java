package MainFolder;

import Entidades.Revolver;
import Servicios.ServicioJuego;
import Servicios.ServicioRevolver;

public class RuletaRusaApp {

	public static void main(String[] args) {
		
		Revolver r = new Revolver();
		ServicioRevolver sr = new ServicioRevolver();
		ServicioJuego sj = new ServicioJuego();
		
		int[] algo = {1,2,3,4,5,6};
		int[] algo2 = {1,2,3,4,5,6};
		

		
//		sj.llenarJuego(null);
//		
//		
//		System.out.println("agua" +r.getPosicionAgua());
//		System.out.println("tambot" +r.getPosicionTambor());
//		sj.ronda();

	}

}
