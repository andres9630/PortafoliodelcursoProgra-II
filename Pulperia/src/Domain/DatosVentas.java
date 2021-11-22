package Domain;

import java.util.LinkedList;

import Domain.Enums.TipoVenta;

public class DatosVentas {
    private static LinkedList<iVenta> listaVentasContado = new LinkedList<iVenta>();
    private static LinkedList<iVenta> listaVentasCredito = new LinkedList<iVenta>();
    private static int contadorIdVentasContado = 0;
    private static int contadorIdVentasCredito = 0;

    public static void insertarVenta(iVenta nuevaVenta, TipoVenta tipoVenta){
        switch (tipoVenta) {
            case Contado:
                nuevaVenta.setId(++contadorIdVentasContado);
                listaVentasContado.add(nuevaVenta);
                break;
            case Credito:
                nuevaVenta.setId(++contadorIdVentasCredito);
                listaVentasCredito.add(nuevaVenta);
                break;
            default:
                break;
        }
    }
    
    public static LinkedList<iVenta> getListaVentas(TipoVenta tipoVenta){
        switch (tipoVenta) {
            case Contado:
                return listaVentasContado;
            case Credito:
                return listaVentasCredito;
            default:
                return null;
        }
    }
}