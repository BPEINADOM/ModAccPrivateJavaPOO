package Domain.Model;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    // Metodos get y set de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos get y set de edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad; // Validacion
        }
    }

    // Metodos get y set de nota promedio
    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0) {
            this.notaPromedio = notaPromedio; // Validacion
        }
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota promedio: " + notaPromedio);
    }




}
