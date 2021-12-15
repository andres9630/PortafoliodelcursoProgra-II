package Domain;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Venta implements iVenta{
    private int id;
    private double monto;
    private LocalDate fecha;
    private LocalTime hora;

    public Venta() {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
