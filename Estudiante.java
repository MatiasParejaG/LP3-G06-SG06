package Act1;

class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    @Override
    public boolean contiene(String valor) {
        return super.contiene(valor) || this.procedencia.getDepartamento().equals(valor);
    }
}