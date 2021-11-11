package luis;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList();
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
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

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

    }

    public void DeleteEmpleados() {
        empleados.removeAll(empleados);
    }
}
