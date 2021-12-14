package luis;

/**
 * Esta clase es el manejador de archivos.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruiz
 */
public abstract class ManejadorArchivos {

    /**
     * Escribe un nuevo registro en el archivo dat especificado
     *
     * @param archivoSolicitado Archivo donde se añadirá el registro
     * @param registro Datos a añadir
     */
    public static void reiniciar(String archivoSolicitado) {
        File file = new File(archivoSolicitado);
        try {
            FileWriter fw = new FileWriter(file, false); //True en la opción append para añadir datos y no sobreescribir el archivo
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void insertarDato(String archivoSolicitado, String registro) {
        File file = new File(archivoSolicitado);
        try {
            FileWriter fw = new FileWriter(file, true); //True en la opción append para añadir datos y no sobreescribir el archivo
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(registro);
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Convierte el archivo dat en un ArrayList, para manejarlo fácillmente con
     * las funciones de esta clase
     *
     * @param archivoSolicitado Archivo a convertir
     * @return ArrayList con el archivo
     */
    public static ArrayList<Empleado> obtenerArrayListArchivo(String archivoSolicitado) {
        try {
            ArrayList<Empleado> lista = new ArrayList();
            File file = new File(archivoSolicitado);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String lineaActual;

            while ((lineaActual = br.readLine()) != null) {
                String datos[] = lineaActual.split(",");
                Empleado empleado = new Empleado();
                if (datos.length == 7) {
                    empleado.setID(datos[0]);
                    empleado.setNombre(datos[1]);
                    empleado.setaPaterno(datos[2]);
                    empleado.setaMaterno(datos[3]);
                    empleado.setFecha(datos[4]);
                    empleado.setSalario(Double.parseDouble(datos[5]));
                    empleado.setHorario(datos[6]);
                    lista.add(empleado);
                } else {
                    throw new DatosException("Datos incorrectos"); 
                }
            }

            return lista;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return null;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        } catch (DatosException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
