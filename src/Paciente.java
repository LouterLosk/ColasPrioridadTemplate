public class Paciente {
    private int prioridad;
    private String nombre;
    private String sintomas;

    public Paciente(int prioridad, String nombre, String sintomas) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Paciente" +
                "prioridad: " + prioridad +
                ", nombre: " + nombre +
                ", sintomas: " + sintomas;
    }


}
