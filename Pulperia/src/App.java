import GUI.MenuGUI;
import Utils.ConsolaUtils;

public class App {
    public static void main(String[] args) throws Exception {
        ConsolaUtils.limpiarConsola();
        while (true) {
            MenuGUI menuGUI = new MenuGUI();
            menuGUI.mostrarMenuPrincipal();
        }
    }
}
