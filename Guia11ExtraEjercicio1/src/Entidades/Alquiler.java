
package Entidades;

import java.time.LocalDate;


/**
 *
 * @author Rafael
 */
public class Alquiler {

    private String nombre;
    private Integer documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posAmarre;
    private Barco barco;
    private Integer diasDeOcupacion;
    
       
        
    

    public Alquiler(String nombre, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posAmarre) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.diasDeOcupacion = this.fechaDevolucion.compareTo(this.fechaAlquiler);
         
        
    }
    
    public Alquiler () {
        
    }

    public Integer getDiasDeOcupacion() {
        return diasDeOcupacion;
    }

    public void setDiasDeOcupacion(Integer diasDeOcupacion) {
        this.diasDeOcupacion = diasDeOcupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posAmarre=" + posAmarre + ", barco=" + barco + ", diasDeOcupacion=" + diasDeOcupacion + '}';
    }


    
    
    
    
    
}
