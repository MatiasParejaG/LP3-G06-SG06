package Act2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la clave para el primer par ordenado (Integer): ");
        int key1 = scanner.nextInt();
        System.out.print("Ingrese el valor para el primer par ordenado (Integer): ");
        int value1 = scanner.nextInt();
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(key1, value1);
        System.out.print("Ingrese la clave para el segundo par ordenado (Integer): ");
        int key2 = scanner.nextInt();
        System.out.print("Ingrese el valor para el segundo par ordenado (String): ");
        String value2 = scanner.next();
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(key2, value2);
        System.out.print("Ingrese la clave para el tercer par ordenado (String): ");
        String key3 = scanner.next();
        System.out.print("Ingrese el valor para el tercer par ordenado (Persona): ");
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        OrderedPair<String, Persona> pair3 = new OrderedPair<>(key3, new Persona(nombre, edad));
        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        System.out.println(pair3.toString());
        scanner.close();
    }
}

