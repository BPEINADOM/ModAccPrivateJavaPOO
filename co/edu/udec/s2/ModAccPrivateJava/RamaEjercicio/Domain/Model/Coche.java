package Domain.Model;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int velocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar (double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("El incremento debe ser positivo");
        }
    }

    public void mostrarCoche() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima + " KM/H");
    }
}
