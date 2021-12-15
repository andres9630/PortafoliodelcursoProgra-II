package Domain;

import Domain.Enums.MetodoPago;

public class VentaContado extends Venta {
    private MetodoPago metodoPago;

    public VentaContado() {
        super();
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}