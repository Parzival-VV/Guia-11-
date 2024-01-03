
package Entidades;

/**
 *CLASE PADRE
 * @author Rafael
 */
public class Hotel {
    
    protected Integer cantidadHabitaciones;
    //EL MODIFICADOR PROTECTED HACE REFERENCIA A QUE EL ATRIBUTO ES PUBLICO PARA LA FAFMILIA
    // Y PRIVADO PARA LOS EXTERNOS A LA FAMILIA
    public Hotel (Integer cantidadHabitaciones){
        this.cantidadHabitaciones = cantidadHabitaciones;
        
    }
    
    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    
    public void setCantidadHabitaciones (Integer cantidadHabitaciones){
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
}
