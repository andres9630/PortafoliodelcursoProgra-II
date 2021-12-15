/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package luis;
=======
<<<<<<< HEAD
package proyecto;


import proyecto.Empleado;
import proyecto.ManejadorArchivos;
=======
package luis;
>>>>>>> fe791e6 (Modificando proyecto)
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa

import java.util.ArrayList;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa
/**
 *
 * @author Luis Rodolfo
 */
<<<<<<< HEAD
=======
>>>>>>> fe791e6 (Modificando proyecto)
>>>>>>> e6dcb46f1b56e732174bdebfcb3dbc553c8a26aa
public class ManejadorArchivosTest {
    

    /**
     * Test of obtenerArrayListArchivo method, of class ManejadorArchivos.
     */
    @Test
    public void testObtenerArrayListArchivo() {
        System.out.println("obtenerArrayListArchivo");
        String archivoSolicitado = "Prueba";
        Empleado empleado = new Empleado("1","Luis","Rodolfo","Rodolfo","12-11-2021",2500,"L-V");
        ArrayList<Empleado> expResult = new ArrayList();
        expResult.add(empleado);
        ManejadorArchivos.reiniciar(archivoSolicitado);
        ManejadorArchivos.insertarDato(archivoSolicitado, empleado.toString());
        ArrayList<Empleado> result = ManejadorArchivos.obtenerArrayListArchivo(archivoSolicitado);
        assertTrue(result.toString().equals(expResult.toString()));
    }
    
    @Test
    public void testExceptionDefinidas() {
        System.out.println("obtenerArrayListArchivo");
        String archivoSolicitado = "Prueba";
        Empleado empleado = new Empleado("1","Luis","Rodolfo","Rodolfo","12-11-2021",2500,"L-V");
        ArrayList<Empleado> expResult = new ArrayList();
        expResult.add(empleado);
        ManejadorArchivos.reiniciar(archivoSolicitado);
        ManejadorArchivos.insertarDato(archivoSolicitado, empleado.toString());
        ArrayList<Empleado> result = ManejadorArchivos.obtenerArrayListArchivo(archivoSolicitado);
        assertTrue(result.toString().equals(expResult.toString()));
    }
    
}
