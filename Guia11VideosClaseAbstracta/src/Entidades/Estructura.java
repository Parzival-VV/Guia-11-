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
public abstract class Estructura {
    
    //Declararla abstract a la clase no le permite ser instanciada, osea no se va poder
    //crear un objeto de la misma, tambien va a tener metodos  generales y metodos abtractos
    //si fueran todos abstractos deberia ser una interfaz y no una clase abstracta.
    
    protected Double superficieCubierta;
    protected Double superficieTotal;
    
    public Estructura(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    //El constructor recibe un solo parametro, por que el otro lo calculamos en el main 
    
    public abstract void calcularSuperficie(double ancho, double largo);
    
    
    
}
