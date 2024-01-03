/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public final class Hotel5 extends Hotel4{
            /*palabra clave final, podemos declarar a parte de una variable una clase como final
        lo que va a pasar que al declarala de esa manera cortamos la herencia, es decir
        que ninguna otra clase va a poder tomar herencia de esta, seria el fin de la cadena de herencia*/
    
    
    
    protected boolean casino = true;
    protected boolean restaurant = true;
    
    public Hotel5 (Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
}
