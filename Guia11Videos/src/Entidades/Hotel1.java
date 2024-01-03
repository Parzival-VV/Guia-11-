
package Entidades;

/**
 *
 * @author Rafael
 */
public class Hotel1 extends Hotel{
    //para determinar que hotel 1 es hijo de Hotel vamos a usar la conotacion 
    //"extends" + el nombre de la clase padre en este caso Hotel, con esto establecemos la herencia
    //Hotel1 va recibir metodos y parametros de Hotel por herencia
    
    protected Double precio;
    protected Double superficie;
    protected boolean bano = true;
    protected boolean ascensor = true;
    protected boolean calefaccion = true;
    
    public Hotel1(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(cantidadHabitaciones);
        //La palabra super hacer refernecia a algo que estamos enviando o recibiendo de la clase padre
        this.precio = precio;
        this.superficie = superficie;
        
    }
    
}
