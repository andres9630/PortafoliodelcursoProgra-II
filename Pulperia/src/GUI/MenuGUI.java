package GUI;

import java.util.LinkedList;

import Domain.Cliente;
import Domain.DatosClientes;
import Domain.DatosVentas;
import Domain.VentaContado;
import Domain.VentaCredito;
import Domain.iVenta;
import Domain.Enums.MetodoPago;
import Domain.Enums.TipoVenta;
import Utils.ConsolaUtils;

public class MenuGUI {

    public void mostrarMenuPrincipal() {
        System.out.println("Menu Principal\n"
                + "Presione el número correspondiente a la opción a la que desea ingresar, o bien presione 0 para salir.\n"
                + "1. Registrar clientes de crédito.\n"
                + "2. Registrar ventas de contado.\n"
                + "3. Registrar ventas de crédito.\n"
                + "0. Salir.");

        String opcionSeleccionada = System.console().readLine();
        ConsolaUtils.limpiarConsola();
        switch (opcionSeleccionada) {
        case "1":
            mostrarMenuClientesCredito();
            break;
        case "2":
            mostrarMenuVentasContado();
            break;
        case "3":
            mostrarMenuVentasCredito();
            break;
        case "0":
            System.exit(0);
            break;
        default:
            mostrarMensajeEntradaNoValida();
            break;
        }
        ConsolaUtils.limpiarConsola();
    }

    private void mostrarMenuClientesCredito() {
        boolean salirMenu = false;
        while (!salirMenu) {
            ConsolaUtils.limpiarConsola();
            System.out.println("Registro de clientes de crédito\n"
                    + "Presione el número correspondiente a la opción a la que desea ingresar, o bien presione 0 para regresar al menú principal.\n"
                    + "1. Registrar nuevo cliente de crédito.\n"
                    + "2. Ver todos los clientes de crédito registrados.\n"
                    + "3. Modificar un cliente de crédito.\n"
                    + "4. Eliminar un cliente de crédito.\n"
                    + "0. Volver al menú principal.");

            String opcionSeleccionada = System.console().readLine();
            ConsolaUtils.limpiarConsola();
            switch (opcionSeleccionada) {
            case "1":
                System.out.println("Nombre:\n");
                String nombreCliente = System.console().readLine();
                ConsolaUtils.limpiarConsola();
                System.out.println("Teléfono:\n");
                String telefonoCliente = System.console().readLine();
                ConsolaUtils.limpiarConsola();
                System.out.println("Correo:\n");
                String correoCliente = System.console().readLine();
                ConsolaUtils.limpiarConsola();
                
                Cliente nuevoCliente = new Cliente();
                nuevoCliente.setNombre(nombreCliente);
                nuevoCliente.setTelefono(telefonoCliente);
                nuevoCliente.setCorreo(correoCliente);
                DatosClientes.insertarCliente(nuevoCliente);

                System.out.println("Se ha registrado el cliente correctamente. Presione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "2":
                mostrarListaClientes();

                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "3":
                mostrarListaClientes();
                System.out.println("\n\nIngrese el id del cliente que desea actualizar, o bien presione 0 para regresar al menú anterior.");
                int idClienteActualizar = Integer.parseInt(System.console().readLine());

                if (idClienteActualizar == 0) {
                    break;
                }

                Cliente cliente = DatosClientes.obtenerCliente(idClienteActualizar);

                ConsolaUtils.limpiarConsola();
                System.out.println("Nombre actual: " + cliente.getNombre() + " - Nuevo nombre:\n");
                String nombreClienteActualizar = System.console().readLine();
                ConsolaUtils.limpiarConsola();
                System.out.println("Teléfono actual: " + cliente.getNombre() + " - Nuevo teléfono:\n");
                String telefonoClienteActualizar = System.console().readLine();
                ConsolaUtils.limpiarConsola();
                System.out.println("Correo actual: " + cliente.getNombre() + " - Nuevo correo:\n");
                String correoClienteActualizar = System.console().readLine();
                
                DatosClientes.actualizarCliente(idClienteActualizar, nombreClienteActualizar, telefonoClienteActualizar, correoClienteActualizar);

                ConsolaUtils.limpiarConsola();
                System.out.println("La información del cliente se ha actualizado con los siguientes datos:\n"
                    + "Nombre: " + cliente.getNombre()
                    + "\nTeléfono: " + cliente.getTelefono()
                    + "\nCorreo: " + cliente.getCorreo());
                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "4":
                boolean mostrarMenuEliminar = true;
                while (mostrarMenuEliminar) {
                    mostrarListaClientes();
                    System.out.println("\n\nIngrese el id del cliente a eliminar, o bien presione 0 para regresar al menú anterior.");
                    int idClienteEliminar = Integer.parseInt(System.console().readLine());
                    ConsolaUtils.limpiarConsola();

                    if (idClienteEliminar == 0) {
                        mostrarMenuEliminar = false;
                        break;
                    }

                    if (DatosClientes.obtenerCliente(idClienteEliminar) != null) {
                        DatosClientes.borrarCliente(idClienteEliminar);
                        System.out.println("La información del cliente se ha borrado correctamente. Presione la tecla Enter para continuar.");
                        System.console().readLine();
                    }else{
                        System.out.println("El cliente indicado no existe. Presione la tecla Enter para continuar.");
                        System.console().readLine();
                    }
                    ConsolaUtils.limpiarConsola();
                }
                
                break;
            case "0":
                salirMenu = true;
                break;
            default:
                mostrarMensajeEntradaNoValida();
                break;
            }
        }
    }

    private void mostrarMenuVentasContado() {
        boolean salirMenu = false;
        while (!salirMenu) {
            ConsolaUtils.limpiarConsola();
            System.out.println("Registro de ventas de contado\n"
                    + "Presione el número correspondiente a la opción a la que desea ingresar, o bien presione 0 para regresar al menú principal.\n"
                    + "1. Ver las ventas hechas de contado.\n"
                    + "2. Registrar una nueva venta.\n"
                    + "0. Volver al menú principal.");

            String opcionSeleccionada = System.console().readLine();
            ConsolaUtils.limpiarConsola();
            switch (opcionSeleccionada) {
            case "1":
                mostrarListaVentas(TipoVenta.Contado);

                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "2":
                System.out.println("Monto:\n");
                Double monto = Double.parseDouble(System.console().readLine());
                ConsolaUtils.limpiarConsola();
                System.out.println("Método de pago (ingrese 'C' para pago de contado, o bien 'T' para pago con tarjeta):\n");
                String metodoPagoIngresado = System.console().readLine();
                MetodoPago metodoPago = metodoPagoIngresado.equalsIgnoreCase("C") ? MetodoPago.Contado : metodoPagoIngresado.equalsIgnoreCase("T") ? MetodoPago.Tarjeta : null;
                ConsolaUtils.limpiarConsola();

                if (metodoPago == null) {
                    System.out.println("El método de pago ingresado no es válido, por favor reintente el registro de la venta. Presione la tecla Enter para continuar.");
                    System.console().readLine();
                    break;
                }
                
                VentaContado ventaContado = new VentaContado();
                ventaContado.setMonto(monto);
                ventaContado.setMetodoPago(metodoPago);
                DatosVentas.insertarVenta(ventaContado, TipoVenta.Contado);

                System.out.println("Se ha registrado la venta correctamente. Presione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "0":
                salirMenu = true;
                break;
            default:
                mostrarMensajeEntradaNoValida();
                break;
            }
        }
    }

    private void mostrarMenuVentasCredito() {
        boolean salirMenu = false;
        while (!salirMenu) {
            ConsolaUtils.limpiarConsola();
            System.out.println("Registro de ventas de crédito\n"
                    + "Presione el número correspondiente a la opción a la que desea ingresar, o bien presione 0 para regresar al menú principal.\n"
                    + "1. Ver las ventas de crédito.\n"
                    + "2. Registrar venta de crédito.\n"
                    + "0. Volver al menú principal.");

            String opcionSeleccionada = System.console().readLine();
            ConsolaUtils.limpiarConsola();
            switch (opcionSeleccionada) {
            case "1":
                mostrarListaVentas(TipoVenta.Credito);

                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "2":
                mostrarMenuRegistroVentasCredito();
                break;
            case "0":
                salirMenu = true;
                break;
            default:
                mostrarMensajeEntradaNoValida();
                break;
            }
        }
    }

    private void mostrarMenuRegistroVentasCredito() {
        boolean salirMenu = false;
        while (!salirMenu) {
            ConsolaUtils.limpiarConsola();
            System.out.println("Menú de registro de ventas de crédito\n"
                    + "Presione el número correspondiente a la opción a la que desea ingresar, o bien presione 0 para regresar al menú anterior.\n"
                    + "1. Mostrar lista de clientes de crédito.\n"
                    + "2. Ver las ventas de crédito de un cliente.\n"
                    + "3. Ver todas las ventas de crédito.\n"
                    + "4. Registrar venta de crédito.\n"
                    + "0. Volver al menú anterior.");

            String opcionSeleccionada = System.console().readLine();
            ConsolaUtils.limpiarConsola();
            
            switch (opcionSeleccionada) {
            case "1":
                mostrarListaClientes();

                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "2":
                System.out.println("\n\nIngrese el id del cliente del cual desea listar las ventas de crédito. O bien presione 0 para regresar al menú anterior.");
                int idClienteIngresado = Integer.parseInt(System.console().readLine());
                ConsolaUtils.limpiarConsola();

                LinkedList<iVenta> listaVentas = DatosVentas.getListaVentas(TipoVenta.Credito);
                System.out.println("Lista de ventas de crédito registradas para el cliente con id "+ idClienteIngresado + ":");
                boolean existenVentas = false;
                for (iVenta venta : listaVentas) {
                    int idClienteVenta = ((VentaCredito)venta).getIdCliente();
                    if(idClienteIngresado == idClienteVenta){
                        System.out.println("Fecha: " + venta.getFecha() + " " + venta.getHora() + " - Monto: " + venta.getMonto());
                        existenVentas = true;
                    }
                }
                if (!existenVentas) {
                    System.out.println("No se encontraron ventas para el cliente indicado.");
                }
                System.out.println("Presione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "3":
                mostrarListaVentas(TipoVenta.Credito);

                System.out.println("\n\nPresione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "4":
                System.out.println("Id de cliente:\n");
                int idCliente = Integer.parseInt(System.console().readLine());
                Cliente cliente = DatosClientes.obtenerCliente(idCliente);
                if (cliente == null) {
                    System.out.println("El cliente indicado no se encuentra registrado en sistema. Valide el id e intente de nuevo.");
                    System.out.println("\n\nPresione la tecla Enter para continuar.");
                    System.console().readLine();
                    break;
                }
                System.out.println("Monto:\n");
                Double monto = Double.parseDouble(System.console().readLine());
                ConsolaUtils.limpiarConsola();
                
                VentaCredito ventaCredito = new VentaCredito();
                ventaCredito.setMonto(monto);
                ventaCredito.setIdCliente(idCliente);
                DatosVentas.insertarVenta(ventaCredito, TipoVenta.Credito);

                System.out.println("Se ha registrado la venta correctamente. Presione la tecla Enter para continuar.");
                System.console().readLine();
                break;
            case "0":
                salirMenu = true;
                break;
            default:
                mostrarMensajeEntradaNoValida();
                break;
            }
        }
    }

    private void mostrarMensajeEntradaNoValida(){
        System.out.println("Por favor ingrese una opción válida. Presione la tecla Enter para continuar.");
        System.console().readLine();
    }

    private LinkedList<Cliente> mostrarListaClientes(){
        LinkedList<Cliente> listaClientes = DatosClientes.getListaClientes();
        System.out.println("Lista de clientes registrados:");
        if (listaClientes.size() <= 0) {
            System.out.println("No se encuentran clientes registrados en sistema.");
        }

        for (Cliente cliente : listaClientes) {
            System.out.println("Id: " + cliente.getId() + " - Nombre: " + cliente.getNombre());
        }
        return listaClientes;
    }

    private LinkedList<iVenta> mostrarListaVentas(TipoVenta tipoVenta) {
        LinkedList<iVenta> listaVentas = DatosVentas.getListaVentas(tipoVenta);
        System.out.println("Lista de ventas registradas:");
        if (listaVentas.size() <= 0) {
            System.out.println("No se encuentran ventas registradas en sistema.");
        }
        for (iVenta venta : listaVentas) {
            if (tipoVenta == TipoVenta.Contado) {
                System.out.println("Fecha: " + venta.getFecha() + " " + venta.getHora() + " - Monto: " + venta.getMonto());
            } else if (tipoVenta == TipoVenta.Credito) {
                int idCliente = ((VentaCredito) venta).getIdCliente();
                Cliente cliente = DatosClientes.obtenerCliente(idCliente);
                System.out.println("Nombre: " + cliente.getNombre() + " - Fecha: " + venta.getFecha() + " " + venta.getHora() + " - Monto: " + venta.getMonto());
            }
        }
        return listaVentas;
    }
}
