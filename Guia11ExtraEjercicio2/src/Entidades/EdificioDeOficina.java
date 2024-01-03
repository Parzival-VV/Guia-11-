
package Entidades;

/**
 *
 * @author Rafael
 */
public final class EdificioDeOficina extends Edificio{
    
    /*
    Estos métodos serán abstractos y los implementarán las siguientes clases:
    
    • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
    por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
    los atributos del padre.
    
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    
    private Integer personasPorOficina;
    private Integer numeroPisos;
    private Integer numeroDeOficinas;
    
    public EdificioDeOficina(Integer personasPorOficina, Integer numeroPisos, Integer numeroDeOficinas, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);        this.numeroPisos = numeroPisos;
        this.numeroDeOficinas = numeroDeOficinas;

        this.personasPorOficina = personasPorOficina;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }
    

    public Integer getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(Integer personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
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
        
        superficie = (this.ancho * this.largo) * numeroPisos;
        
        return superficie;
    }

    @Override
    public Double calcularVolumen() {
        
        Double volumen;
        
        volumen = ((this.ancho * this.largo) * this.alto) * numeroPisos;
        
        return volumen;
    }
    
    
}
