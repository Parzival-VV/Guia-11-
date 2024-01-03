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
public class Hotel2 extends Hotel1 {
    
    protected boolean cajaSeguridad = true;
    
    public Hotel2 (Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
}
