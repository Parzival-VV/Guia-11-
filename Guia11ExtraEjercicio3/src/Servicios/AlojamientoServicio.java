
package Servicios;

import Entidades.Alojamiento;
import Entidades.Hotel;
import Entidades.Hotel4Estrellas;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class AlojamientoServicio {

//    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//    
//    • todos los alojamientos.
//
//    • todos los hoteles de más caro a más barato.
//    
//    • todos los campings con restaurante
//    
//    • todos las residencias que tienen descuento. 
    private ArrayList<Alojamiento> alojamiento;
    
    public void baseDeAlojamientos () {
        
        Hotel4Estrellas h1 = new Hotel4Estrellas(Boolean.TRUE, 'A', "Malaga", /*capacidadRestaurante*/ 25, /*cantHabitaciones*/10, /*numeroCamas*/ 24, /*cantPisos*/ 4, /*estrellas*/4, "Hotel New Heaven", "La Galera 47", "Vivorata", "Adolfo Benitez");
        Hotel4Estrellas h2 = new Hotel4Estrellas(Boolean.TRUE, 'A', "Malaga", /*capacidadRestaurante*/ 25, /*cantHabitaciones*/10, /*numeroCamas*/ 24, /*cantPisos*/ 4, /*estrellas*/4, "Hotel New Heaven", "La Galera 47", "Vivorata", "Adolfo Benitez");
                
                
        
        
        
    }
    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamiento){
        
        
    }

}







//( )
//   protecte
//    protected String direccion;
//    protected String localidad;
//    protected String gerente;
//    protected Integer cantHabitaciones;
//    protected Integer numeroCamas;
//    protected Integer capacidadHotel;
//    protected Integer cantPisos;
//    protected Integer estrellas;
//    protected Double precioHabitacion;
//    
//    protected Boolean gimnasio;
//    protected char tipoGimnasio;
//    protected String nombreRestaurante;
//    protected Integer capacidadRestaurante;