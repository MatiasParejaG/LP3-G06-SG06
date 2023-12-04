public class Main {
    public static void main(String[] args) {
        try {
            Goodies goodies = new Goodies("wewe");
            goodies.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Goodies: " + e.getMessage());
        }

        try {
            Biscuits biscuits = new Biscuits("Galleta Integral", 10);
            biscuits.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Biscuits: " + e.getMessage());
        }

        try {
            Chocolates chocolates = new Chocolates("Chocolate Blanco", "Dulce");
            chocolates.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Chocolates: " + e.getMessage());
        }

        try {
            Soda soda = new Soda("Cola", 5, "Regular");
            soda.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Soda: " + e.getMessage());
        }

        try {
            Sweet sweet = new Sweet("Pastelito", 8, "Vainilla");
            sweet.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear Sweet: " + e.getMessage());
        }
    }
}