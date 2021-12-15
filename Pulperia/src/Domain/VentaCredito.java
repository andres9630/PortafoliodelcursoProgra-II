package Domain;

public class VentaCredito extends Venta {
    private int idCliente;

    public VentaCredito() {
        super();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
