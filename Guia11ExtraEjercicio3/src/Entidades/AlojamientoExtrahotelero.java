
package Entidades;

/**
 *
 * @author Rafael
 */
public class AlojamientoExtrahotelero extends Alojamiento{
    /*
    Por cada
    Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
    cuadrados que ocupa.
    */
    
    protected Boolean privado;
    protected Integer metrosCuadrados;

    public AlojamientoExtrahotelero(Boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    
    public Boolean getPrivado(){
        return privado;
    }
    
    public void setPrivado (Boolean privado) {
        this.privado = privado;
    }
    
    public Integer getMetrosCuadrados () {
        return metrosCuadrados;
    }
    
    public void setMetrosCuadrados (Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    
}
