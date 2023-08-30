import Entity.Vehiculo;
import Service.VehiculoService;

public class Main {
    public static void main(String[] args) {
        VehiculoService vs = new VehiculoService();

        Vehiculo vehiculo1 = new Vehiculo("MarcaAuto", "ModeloAuto", 2013, "auto");
        Vehiculo vehiculo2 = new Vehiculo("MarcaBici", "ModeloBici", 2000, "bici");
        Vehiculo vehiculo3 = new Vehiculo("MarcaMoto", "ModeloMoto", 2005, "moto");

        int vehi1 = vs.moverse(vehiculo1) + vs.frenar(vehiculo1) + vs.moverse(vehiculo1);
        int vehi2 = vs.moverse(vehiculo2) + vs.frenar(vehiculo2) + vs.moverse(vehiculo2);
        int vehi3 = vs.moverse(vehiculo3) + vs.frenar(vehiculo3) + vs.moverse(vehiculo3);

        int masLejos = 0;
        if (vehi1 > vehi2 && vehi1 > vehi3) {
            masLejos = vehi1;
        } else if (vehi2 > vehi3) {
            masLejos = vehi2;
        } else {
            masLejos = vehi3;
        }

        if (masLejos == vehi1) {
            System.out.println("Vehiculo  " + vehiculo1.getTipo() + " " + vehiculo1.getMarca() + " " + vehi1);
        } else if (masLejos == vehi2) {
            System.out.println("Vehiculo  " + vehiculo2.getTipo() + " " + vehiculo2.getMarca() + " " + vehi2);
        } else {
            System.out.println("Vehiculo  " + vehiculo3.getTipo() + " " + vehiculo3.getMarca() + " " + vehi3);
        }
    }
}