
package espoch.edu.ec.clases;

public class Paciente {
    private String name;
    private int severity;

    public Paciente(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Paciente{" + "name=" + name + ", severity=" + severity + '}';
    }
    
    
    
}
