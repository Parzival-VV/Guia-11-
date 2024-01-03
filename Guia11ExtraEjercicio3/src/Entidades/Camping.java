
package Entidades;

/**
 *
 * @author Rafael
 */
public class Camping extends AlojamientoExtrahotelero{
    
    /*
    Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    disponibles y si posee o no un restaurante dentro de las instalaciones.
    */
    
    protected Integer capMaxCarpas;
    protected Integer cantBaniosDisponibles;
    protected Boolean restaurante;

    public Camping(Integer capMaxCarpas, Integer cantBaniosDisponibles, Boolean restaurante, Boolean privado, Integer metrosCuadrados,
            String nombre, String direccion, String localidad, String gerente) {
        
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        
        this.capMaxCarpas = capMaxCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.restaurante = restaurante;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBaniosDisponibles() {
        return cantBaniosDisponibles;
    }

    public void setCantBaniosDisponibles(Integer cantBaniosDisponibles) {
        this.cantBaniosDisponibles = cantBaniosDisponibles;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    
}
