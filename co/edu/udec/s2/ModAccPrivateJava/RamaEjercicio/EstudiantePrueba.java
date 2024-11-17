import Domain.Model.Estudiante;

public class EstudiantePrueba {
    
    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de estudiantes
        Estudiante estudiante1 = new Estudiante("Daniel Mercado", 17, 4.2);
        Estudiante estudiante2 = new Estudiante("Diana Camargo", 16, 4.8);
        Estudiante estudiante3 = new Estudiante("Sonia Mendoza", 18, 2.9);


        estudiante1.mostrarEstudiante();
        System.out.println("*********************************************");
        estudiante2.mostrarEstudiante();
        System.out.println("*********************************************");
        estudiante3.mostrarEstudiante();
        System.out.println("*********************************************");

        // Acceso a las propiedades del estudiante 1
        estudiante1.setNombre("Jose Herrera");
        estudiante1.setEdad(15);
        estudiante1.setNotaPromedio(2.52);
        estudiante1.mostrarEstudiante();
        System.out.println("*********************************************");

        // Acceso a las propiedades del estudiante 2
        estudiante2.setNombre("Juan Sebastian");
        estudiante2.setEdad(19);
        estudiante2.setNotaPromedio(3.42);
        estudiante2.mostrarEstudiante();
        System.out.println("*********************************************");

        // Acceso a las propiedades del estudiante 3
        estudiante3.setNombre("Juliana Lopez");
        estudiante3.setEdad(16);
        estudiante3.setNotaPromedio(4.95);
        estudiante3.mostrarEstudiante();
        System.out.println("*********************************************");


    }
}
