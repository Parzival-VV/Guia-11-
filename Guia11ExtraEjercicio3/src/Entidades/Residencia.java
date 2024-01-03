
package Entidades;

/**
 *
 * @author Rafael
 */
public class Residencia extends AlojamientoExtrahotelero{
    /*
    Para las residencias se
    indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
    campo deportivo
    */
    protected Integer cantHabitaciones;
    protected Boolean descuentoGremial;
    protected Boolean campoDeportivo;

    public Residencia(Integer cantHabitaciones, Boolean descuentoGremial, Boolean campoDeportivo, Boolean privado, 
            Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremial = descuentoGremial;
        this.campoDeportivo = campoDeportivo;
    }
    

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuentoGremial() {
        return descuentoGremial;
    }

    public void setDescuentoGremial(Boolean descuentoGremial) {
        this.descuentoGremial = descuentoGremial;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    
    
    
}
