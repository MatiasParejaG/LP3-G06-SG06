class Goodies {
    private String name;

    public Goodies(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Goodie: " + name);
    }
}