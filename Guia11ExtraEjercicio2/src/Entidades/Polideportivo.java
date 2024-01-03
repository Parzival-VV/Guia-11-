
package Entidades;

/**
 *
 * @author Rafael
 */
public final class Polideportivo extends Edificio{

    
    /*
    Estos métodos serán abstractos y los implementarán las siguientes clases:

    • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
    Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
     */
    private String nombre;
    private Boolean techado;
    
    public Polideportivo(String nombre, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    

    @Override
    public Double calcularSuperficie() {
        
        Double superficie;
        
        superficie = this.ancho * this.largo;
        
        return superficie;
    }

    @Override
    public Double calcularVolumen() {
        
        Double volumen;
        
        volumen = (this.ancho * this.largo) * this.alto;
        
        return volumen;

    }  
    
}
