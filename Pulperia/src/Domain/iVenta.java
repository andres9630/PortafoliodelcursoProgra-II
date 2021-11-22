package Domain;

import java.time.LocalDate;
import java.time.LocalTime;

public interface iVenta {
    public int getId();
    
    public void setId(int id);

    public double getMonto();

    public void setMonto(double monto);

    public LocalDate getFecha();

    public void setFecha(LocalDate fecha);

    public LocalTime getHora();

    public void setHora(LocalTime hora);
}
