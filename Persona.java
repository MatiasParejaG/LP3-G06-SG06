package Act1;
class Persona implements Contenedora<String> {
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public boolean contiene(String valor) {
        return this.nombre.equals(valor);
    }
}
