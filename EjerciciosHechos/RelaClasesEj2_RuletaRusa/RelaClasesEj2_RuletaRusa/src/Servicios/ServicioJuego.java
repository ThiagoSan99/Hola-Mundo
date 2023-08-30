package Servicios;

import java.util.ArrayList;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;

public class ServicioJuego {
	
	ArrayList<Jugador> jugadores = new ArrayList<>();
	
	ServicioRevolver serviceR = new ServicioRevolver();
	
	public void llenarJuego(ServicioRevolver sr) {

		sr.llenarRevolver();

		Jugador jugador1 = new Jugador(1, "pepito", false);
		Jugador jugador2 = new Jugador(2, "pepita", false);
		Jugador jugador3 = new Jugador(3, "lola", false);
		Jugador jugador4 = new Jugador(4, "pepito2", false);
		Jugador jugador5 = new Jugador(5, "pepita2", false);
		Jugador jugador6 = new Jugador(6, "lola2", false);

		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		jugadores.add(jugador4);
		jugadores.add(jugador5);
		jugadores.add(jugador6);

		Juego juego = new Juego();

		juego.setJugadores(jugadores);
		
		juego.setRevolver(sr);

	}
	
	public void ronda() {
		
		System.out.println("--BIENVENIDO---");
		
		serviceR.llenarRevolver();
		
		ServicioJugador jugadorS = new ServicioJugador();
		
		for (int i = 0; i < jugadores.size(); i++) {
			System.out.println("Jugador" + (i+1));
			if(jugadorS.disparo(serviceR)) {
				System.out.println("El juego a terminado el jugador " + (i+1) + 
						" Ha perdido la batalla ");
			}
		}

	}

}
