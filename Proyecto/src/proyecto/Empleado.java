package proyecto;

public class Empleado {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String ID;
    private Fecha FNacimiento;
    private double salario;
    private String horario;
    private String fecha;
<<<<<<< HEAD

    public Empleado(String nombre, String ID, Fecha FNacimiento, double salario, String horario) {
        this.nombre = nombre;
        this.ID = ID;
        this.FNacimiento = FNacimiento;
        this.salario = salario;
        this.horario = horario;
    }
    

    public Empleado(String ID,String nombre, String aPaterno, String aMaterno, String FNacimiento, double salario, String horario) {
        this.nombre = nombre;
        this.ID = ID;
        this.fecha = FNacimiento;
        this.salario = salario;
        this.horario = horario;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }
=======
>>>>>>> fe791e6 (Modificando proyecto)

    public Empleado(String nombre, String ID, Fecha FNacimiento, double salario, String horario) {
        this.nombre = nombre;
        this.ID = ID;
        this.FNacimiento = FNacimiento;
        this.salario = salario;
        this.horario = horario;
    }
    
    public Empleado(String ID,String nombre, String aPaterno, String aMaterno, String FNacimiento, double salario, String horario) {
        this.nombre = nombre;
        this.ID = ID;
        this.fecha = FNacimiento;
        this.salario = salario;
        this.horario = horario;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }
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

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return ID +","+nombre +","+aPaterno+","+aMaterno+","+ fecha  +","+ salario  +","+ horario+"\n" ;
    }

    
    
}
