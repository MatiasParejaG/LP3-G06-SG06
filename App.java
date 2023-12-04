package Act3;

public class App {
    public static void main(String[] args) {
    try {
        Bag<Integer> integerBag = new Bag<>(5);
        integerBag.add(1);
        integerBag.add(2);
        integerBag.add(3);
        System.out.println(integerBag.toString());

        Bag<String> stringBag = new Bag<>(5);
        stringBag.add("Hola");
        stringBag.add("Mundo");
        stringBag.add("!");
        System.out.println(stringBag.toString());

        Bag<Persona> personaBag = new Bag<>(5);
        personaBag.add(new Persona("Juan", 25));
        personaBag.add(new Persona("Ana", 30));
        System.out.println(personaBag.toString());

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}


