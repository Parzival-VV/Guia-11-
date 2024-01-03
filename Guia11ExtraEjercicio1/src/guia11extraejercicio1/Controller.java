
package guia11extraejercicio1;

import Entidades.Alquiler;
import Servicios.AlquilerServicio;
import Servicios.BarcoServicio;

/**
 *En esta clase se llaman a todos los servicios.
 * @author Rafael
 */
public class Controller {
    
    public void cargarServiciosAlquiler () {
        
        AlquilerServicio as = new AlquilerServicio ();
        
        Alquiler a1 = as.crearAlquiler ();
        
        BarcoServicio bs = new BarcoServicio ();
        
        bs.seleccionBarco (a1);
        
        System.out.println("\n***** COSTO ******\n\n"
                + "Precio final del alquiler: $" + as.alquiler(a1));
        
        bs.mostrarBarcoSelleccionado(a1.getBarco());
        
        
    }
    

    
}
