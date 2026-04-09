import java.util.ArrayList;
import java.util.PriorityQueue;

public class Clinica {
    private PriorityQueue<Paciente> coloPacientes;
    public Clinica() {
        coloPacientes = new PriorityQueue<>();
    }

    public void encolar(Paciente p){
        coloPacientes.add(p);
    }

    public Paciente desencolar() throws Exception {
        if(coloPacientes.isEmpty())
            throw new Exception("No hay elementos");
        return coloPacientes.remove();
    }

    public ArrayList<Paciente> listarPacientes(){
        return new ArrayList<>(coloPacientes);
    }
}
