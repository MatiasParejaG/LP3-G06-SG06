package Act1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Juan", "Calle A", "123456789");
        personas[1] = new Persona("Maria", "Calle B", "987654321");

        Goodies[] goodies = new Goodies[2];
        goodies[0] = new Goodies(1, "Producto 1", 10.5f);
        goodies[1] = new Goodies(2, "Producto 2", 20.0f);

        Estudiante[] estudiantes = new Estudiante[2];
        estudiantes[0] = new Estudiante("Pedro", "Calle C", "555555555", "Informática", new Procedencia("A", "B"));
        estudiantes[1] = new Estudiante("Ana", "Calle D", "777777777", "Matemáticas", new Procedencia("C", "D"));

        System.out.print("Ingrese un nombre para verificar existencia en personas: ");
        String nombrePersona = scanner.nextLine();
        boolean personaEncontrada = false;
        for (Persona persona : personas) {
            if (persona.contiene(nombrePersona)) {
                System.out.println("La persona existe en el arreglo.");
                personaEncontrada = true;
                break;
            }
        }
        if (!personaEncontrada) {
            System.out.println("La persona no existe en el arreglo.");
        }

        System.out.print("Ingrese un ID para verificar existencia en goodies: ");
        int idGoodies = scanner.nextInt();
        boolean goodieEncontrado = false;
        for (Goodies goodie : goodies) {
            if (goodie.contiene(idGoodies)) {
                System.out.println("El Goodie existe en el arreglo.");
                goodieEncontrado = true;
                break;
            }
        }
        if (!goodieEncontrado) {
            System.out.println("El Goodie no existe en el arreglo.");
        }

        System.out.print("Ingrese un nombre o departamento para verificar existencia en estudiantes: ");
        String valorEstudiante = scanner.next();
        boolean estudianteEncontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.contiene(valorEstudiante)) {
                System.out.println("El estudiante existe en el arreglo.");
                estudianteEncontrado = true;
                break;
            }
        }
        if (!estudianteEncontrado) {
            System.out.println("El estudiante no existe en el arreglo.");
        }
    }
}
    
