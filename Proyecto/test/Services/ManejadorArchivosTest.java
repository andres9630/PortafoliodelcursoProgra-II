/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import proyecto.Empleado;
import proyecto.ManejadorArchivos;
import java.util.ArrayList;
import static junit.framework.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Rodolfo
 */
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
