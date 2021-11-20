package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList();
    }

    public boolean addEmpleado(Empleado empleado) {
        return empleados.add(empleado);      
    }

    public Empleado removeEmpleado(String ID) {
        Empleado eliminar = null;
        for (Empleado empleado1 : empleados) {
            if (ID.equals(empleado1.getID())) {
                eliminar = empleado1;
            }
        }
        empleados.remove(eliminar);
        return eliminar;
    }

    public List<Empleado> mostrarEmpleados() {
       return empleados;

    }

    public boolean DeleteEmpleados() {
        return empleados.removeAll(empleados);
    }
}
