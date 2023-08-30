package Service;

import Entity.Vehiculo;

import java.util.Scanner;

public class VehiculoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {
        System.out.println("Ingresar Marca del vehiculo");
        String marca = read.nextLine();
        System.out.println("Ingresar Modelo del vehiculo");
        String modelo = read.nextLine();
        System.out.println("Ingresar Año del vehiculo");
        int anio = read.nextInt();
        String tipo;
        do {
            System.out.println("Ingresar Tipo del vehiculo");
            tipo = read.next();
        } while (!tipo.equals("auto") && !tipo.equals("moto") && !tipo.equals("bici"));

        return new Vehiculo(marca, modelo, anio, tipo);
    }

    public int moverse(Vehiculo vehiculo) {
        System.out.println("Ingrese por favor el tiempo para el vehiculo " + vehiculo.getTipo());
        int tiempo = read.nextInt();

        switch (vehiculo.getTipo()) {
            case "bici":
                return 1 * tiempo;
            case "moto":
                return 5 * tiempo;
            case "auto":
                return 3 * tiempo;
            default:
                System.out.println("Entrada no valida");
                return 0;
        }
    }

    public int frenar(Vehiculo vehiculo){

        switch (vehiculo.getTipo()) {
            case "bici":
                return 0 ;
            case "moto":
                return 2 ;
            case "auto":
                return 2 ;
            default:
                System.out.println("Entrada no valida");
                return 0;
        }

}







}
