package Act1;
class Procedencia {
    private String departamento;
    private String provincia;

    public Procedencia(String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }
    public String getDepartamento() {
        return departamento;
    }

    public String getProvincia() {
        return provincia;
    }
}