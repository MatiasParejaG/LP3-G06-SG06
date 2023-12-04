package Act1;
class Goodies implements Contenedora<Integer> {
    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean contiene(Integer valor) {
        return this.id == valor;
    }
}
