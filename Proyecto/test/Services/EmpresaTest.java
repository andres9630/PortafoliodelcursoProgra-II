/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
/**
 *

 */
public class EmpresaTest {

    public EmpresaTest() {
    }


    /**
     * Test of addEmpleado method, of class Empresa.
     */
    @Test
    public void testAddEmpleado() {
        System.out.println("addEmpleado");
        Empleado empleado = new Empleado();
        Empresa instance = new Empresa("Empresa");
        boolean expResult = true;
        boolean result = instance.addEmpleado(empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeEmpleado method, of class Empresa.
     */
    @Test
    public void testRemoveEmpleado() {
        System.out.println("removeEmpleado");
        String ID = "123";
        
        Empresa instance = new Empresa("Empresa");
        instance.addEmpleado(new Empleado("Alejandro", "123", new Fecha(1, 2, 3), 2000, "Horario"));
        Empleado expResult = new Empleado("Alejandro", "123", new Fecha(1, 2, 3), 2000, "Horario");
        Empleado result = instance.removeEmpleado(ID);
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEmpleados method, of class Empresa.
     */
    @Test
    public void testMostrarEmpleados() {
        System.out.println("mostrarEmpleados");
        Empresa instance = new Empresa("Empresa");
        instance.addEmpleado(new Empleado("Alejandro", "321", new Fecha(11, 2, 3), 2000, "Horario"));
        instance.addEmpleado(new Empleado("Mario", "222", new Fecha(12, 2, 3), 3000, "Horario"));
        instance.addEmpleado(new Empleado("Juan", "333", new Fecha(13, 2, 3), 1550, "Horario"));
        instance.addEmpleado(new Empleado("Rodrigo", "111", new Fecha(14, 2, 3), 4000, "Horario"));

        List<Empleado> expResult = new ArrayList();
        expResult.add(new Empleado("Alejandro", "321", new Fecha(11, 2, 3), 2000, "Horario"));
        expResult.add(new Empleado("Mario", "222", new Fecha(12, 2, 3), 3000, "Horario"));
        expResult.add(new Empleado("Juan", "333", new Fecha(13, 2, 3), 1550, "Horario"));
        expResult.add(new Empleado("Rodrigo", "111", new Fecha(14, 2, 3), 4000, "Horario"));

        List<Empleado> result = instance.mostrarEmpleados();
        assertTrue(result.toString().equals(expResult.toString()));
    }

    /**
     * Test of DeleteEmpleados method, of class Empresa.
     */
    @Test
    public void testDeleteEmpleadosTrue() {
        System.out.println("DeleteEmpleadosTue");
        Empresa instance = new Empresa("Empresa");
        instance.addEmpleado(new Empleado("Alejandro", "321", new Fecha(11, 2, 3), 2000, "Horario"));
        boolean expResult = true;
        boolean result = instance.DeleteEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testDeleteEmpleadosFalse() {
        System.out.println("DeleteEmpleadosFalse");
        Empresa instance = new Empresa("Empresa");
        boolean expResult = false;
        boolean result = instance.DeleteEmpleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
