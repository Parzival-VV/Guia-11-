
package Entidades;

/**
 *
 * @author Rafael
 */
public class Hotel4Estrellas extends Hotel{
    /*
    • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    */
    
    protected Boolean gimnasio;
    protected char tipoGimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4Estrellas(Boolean gimnasio, char tipoGimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numeroCamas,
            Integer cantPisos, Integer estrellas, String nombre, String direccion, String localidad, String gerente) {
        
        super(cantHabitaciones, numeroCamas, cantPisos, estrellas, nombre, direccion, localidad, gerente);
        
        this.gimnasio = gimnasio;
        this.tipoGimnasio = tipoGimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public char getTipogimnasio() {
        return tipoGimnasio;
    }

    public void setTipogimnasio(char tipogimnasio) {
        this.tipoGimnasio = tipogimnasio;
    }
    

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
//
//Donde:
    
//    Valor agregado por el restaurante:
//
//    • $10 si la capacidad del restaurante es de menos de 30 personas.
//
//    • $30 si está entre 30 y 50 personas.
//
//    • $50 si es mayor de 50.
//
//    Valor agregado por el gimnasio:
//
//    • $50 si el tipo del gimnasio es A.
//
//    • $30 si el tipo del gimnasio es B.
//
//    Valor agregado por las limosinas:
//
//    • $15 por la cantidad de limosinas del hotel.
    
    @Override
    public Double precioHabitacion () {
       
       double costo = super.precioHabitacion();
       double agregadoRestaurante = 0, agregadoGimnasio = 0;      
       
       if (capacidadRestaurante < 30) {
           
           agregadoRestaurante = 10;
           
       } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
           
           agregadoRestaurante = 30;
           
       } else if (capacidadRestaurante > 50) {
           
           agregadoRestaurante = 50;
       }
       
       if (tipoGimnasio == 'A') {
           
           agregadoGimnasio = 50;
           
       } else if (tipoGimnasio == 'B') {
           
           agregadoGimnasio = 30;
           
       }
       
       if (gimnasio.equals(true)) {
           
           costo += agregadoRestaurante + agregadoGimnasio;
           
       } else {
           
           costo += agregadoRestaurante;
       }
       
       return costo;
        
    }
    
    
    
    
}
