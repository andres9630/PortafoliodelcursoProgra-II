package Domain;

import java.util.LinkedList;

public class DatosClientes {
    private static LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
    private static int contadorId = 0;

    public static void insertarCliente(Cliente nuevoCliente){
        nuevoCliente.setId(++contadorId);
        listaClientes.add(nuevoCliente);
    }

    public static void borrarCliente(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                listaClientes.remove(cliente);
                break;
            }
        }
    }

    public static void actualizarCliente(int idCliente, String nombre, String telefono, String correo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                cliente.setNombre(nombre);
                cliente.setTelefono(telefono);
                cliente.setCorreo(correo);
                break;
            }
        }
    }

    public static Cliente obtenerCliente(int idCliente) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public static LinkedList<Cliente> getListaClientes(){
        return listaClientes;
    }
}
