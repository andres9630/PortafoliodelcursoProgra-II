package Utils;

public class ConsolaUtils {
    public static void limpiarConsola(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
