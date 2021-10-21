package test.Servicios;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestarLibro(){
        Libro miLibro = new Libro("Moby Dick", "Hnernan Melville");
        Libreria miLibreria= new Libreria();
        try{
            miLibreria.prestar(miLibro);
            assertTrue(true);

        }catch(Exception ex){
            fail();

        }
        
    }
    @Test
    public void testDelvolver() {
        Libro miLibro = new Libro ("Moby Dick", "Hnernan Melville");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.devolver(miLibro);
            fail();
        }catch (Exception ex){
            assertTrue(true);
        }

    }
    
}
