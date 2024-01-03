/*

 */
package Entidades;

/**
 *
 * @author Rafael
 */
public abstract class Edificio {
    
    /*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.

• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos
    */
    
    protected Double ancho;
    protected Double alto;
    protected Double largo;
    
    public Edificio (Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        
    }
    
    public abstract Double calcularSuperficie ();
    
    public abstract Double calcularVolumen ();
    
}
