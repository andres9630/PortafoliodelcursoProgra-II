package luis;

public class Empleado {
    private String nombre;
    private String ID;
    private Fecha FNacimiento;
    private double salario;
    private String horario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Fecha getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(Fecha FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", ID=" + ID + ", FNacimiento=" + FNacimiento.toString() + ", salario=" + salario + ", horario=" + horario + '}';
    }

    
    
}
