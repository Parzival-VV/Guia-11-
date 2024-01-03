
package Entidades;

/**
 *
 * @author Rafael
 */
public class Hotel extends Alojamiento {
    /*
    Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
    Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. 
    */
    protected Integer cantHabitaciones;
    protected Integer numeroCamas;
    protected Integer capacidadHotel;
    protected Integer cantPisos;
    protected Integer estrellas;
    protected Double precioHabitacion;
    
    public Hotel (Integer cantHabitaciones, Integer numeroCamas, Integer cantPisos, Integer estrellas,
                  String nombre, String direccion, String localidad, String gerente) {
        
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.estrellas = estrellas;
        this.capacidadHotel = this.cantHabitaciones * this.numeroCamas;
        
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel)
    
    public Double precioHabitacion () {
        double costo = 50 + this.capacidadHotel;
        return costo;
    }
    
}
