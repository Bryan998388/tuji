

package ec.edu.espoch.colasdeprioridad_1;

import espoch.edu.ec.clases.Paciente;
import java.util.PriorityQueue;


public class ColasdePrioridad_1 {

    public static void main(String[] args) {
        
        // Crear una cola de prioridad personalizada para los pacientes
        PriorityQueue<Paciente> pacienteQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p1.getSeverity(), p2.getSeverity())
        );
        // Agregar pacientes a la cola
        pacienteQueue.add(new Paciente("Juan", 3)); // Moderado
        pacienteQueue.add(new Paciente("María", 1)); // Crítico
        pacienteQueue.add(new Paciente("Carlos", 2)); // Urgente
        pacienteQueue.add(new Paciente("Ana", 2)); // Urgente
        // Atender pacientes según prioridad
        System.out.println("Atendiendo pacientes en orden de prioridad:");
        while (!pacienteQueue.isEmpty()) {
            System.out.println(pacienteQueue.poll());
        }
    }
        
}
