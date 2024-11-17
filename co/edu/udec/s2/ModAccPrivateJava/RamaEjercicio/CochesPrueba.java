import Domain.Model.Coche;

public class CochesPrueba {
    
    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancia del coche
        Coche coche1 = new Coche("Chevrolet", "S90", 160);
        System.out.println("Estado actual del coche:");
        coche1.mostrarCoche();
        System.out.println("*********************************************");

        // Aceleracion del coche tanto positiva como negativa
        coche1.acelerar(250);
        coche1.acelerar(-200);
        System.out.println("Incremento de velocidad del coche:");
        coche1.mostrarCoche();
        System.out.println("*********************************************");


        // Intento de acceder a las propiedades directamente
        // System.out.println("Marca: " + coche1.marca);
        // System.out.println("Modelo: " + coche1.modelo);
        // System.out.println("Velocidad maxima: " + coche1.velocidadMaxima);


    }
}
