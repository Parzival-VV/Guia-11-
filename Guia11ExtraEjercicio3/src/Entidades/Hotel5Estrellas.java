
package Entidades;

/**
 *
 * @author Rafael
 */
public class Hotel5Estrellas extends Hotel4Estrellas{
    /*
    • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    */
    
    protected Integer cantSalonConferencia;
    protected Integer cantSuites;
    protected Integer cantLimosinas;

    public Hotel5Estrellas(Integer cantSalonConferencia, Integer cantSuites, Integer cantLimosinas, Boolean gimnasio, char tipoGimnasio, String nombreRestaurante,
            Integer capacidadRestaurante, Integer cantHabitaciones, Integer numeroCamas, Integer cantPisos, Integer estrellas, 
            Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        
        super(gimnasio, tipoGimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numeroCamas, cantPisos, estrellas, nombre,
                direccion, localidad, gerente);
        
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(Integer cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
//    Valor agregado por las limosinas:
//
//    • $15 por la cantidad de limosinas del hotel.
    @Override
    public Double precioHabitacion () {
        
       double costo = super.precioHabitacion();
       double agregadoLimosinas = cantLimosinas * 15;
       
       costo += agregadoLimosinas;
       
       return costo;
    }
    
}
