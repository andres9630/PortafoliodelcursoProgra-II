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

<<<<<<< HEAD
=======
<<<<<<< HEAD
    }

    public boolean DeleteEmpleados() {
        return empleados.removeAll(empleados);

    }
    
    public void guardarEnArchivo()
    {
        ManejadorArchivos.reiniciar("Empleados");
        for (Empleado empleado : empleados) {
            ManejadorArchivos.insertarDato("Empleados", empleado.toString());
        }
=======
>>>>>>> fe791e6 (Modificando proyecto)
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa
    }
    public void cargarArchivo()
    {
        empleados.addAll(ManejadorArchivos.obtenerArrayListArchivo("Empleados"));

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa
    public boolean DeleteEmpleados() {
        return empleados.removeAll(empleados);
    }
    
    public void guardarEnArchivo()
    {
        ManejadorArchivos.reiniciar("Empleados");
        for (Empleado empleado : empleados) {
            ManejadorArchivos.insertarDato("Empleados", empleado.toString());
        }
    }
    public void cargarArchivo()
    {
        empleados.addAll(ManejadorArchivos.obtenerArrayListArchivo("Empleados"));
<<<<<<< HEAD
=======
>>>>>>> fe791e6 (Modificando proyecto)
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa
    }
    
}
