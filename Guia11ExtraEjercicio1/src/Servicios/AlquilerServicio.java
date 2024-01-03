
package Servicios;

import Entidades.Alquiler;
import Entidades.BarcoMotor;
import Entidades.BarcoVelero;
import Entidades.YateDeLujo;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class AlquilerServicio {

    public MiddleWorks mw = new MiddleWorks();
    
    /**
     * Crea un aobjeto alquiler y se cargan todos sus datos por teclado
     * @return Alquiler. retorna un objeto Alquiler.
     */
    public Alquiler crearAlquiler() {

        Scanner leer = new Scanner(System.in);

        //Se pide nombre del cliente se valida el dato.
        System.out.println("\n" + "***NUEVO ALQUILER***" + "\n\n"
                + "NOMBRE: ");

        String nombre = mw.validarString(leer);

        //Se pide dni por teclado y se valida tipo de dato valor correcto.
        System.out.println("\nDOCUMENTO: ");

        Integer documento;

        do {

            documento = mw.validarInteger(leer);

            if (documento < 4000000 || documento > 99000000) {
                mw.msjeFueraDeRango();

            } else {
                break;
            }

        } while (documento < 4000000 || documento > 99999999);

        //Se pide fecha de alquiler, devolucion y se validan todos los datos.
        LocalDate fechaAlquiler = mw.pedirFecha();

        System.out.println("\nFECHA DE DEVOLUCION : ");

        LocalDate fechaDevolucion = mw.pedirFecha();

        //Se solicita posicion de amarre con su correspondiente validacion.
        System.out.println("\nPOSICION DE AMARRE: ");

        Integer amarre;

        while (true) {

            if (leer.hasNextInt()) {
                amarre = leer.nextInt();

                break;

            } else {

                mw.msjeDatoNoValido();
                leer.nextLine();
            }

        }
        
        
        
        
        Alquiler a1 = new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, amarre);
        
        return a1;
        
    }
    

  
    /**
     * metodo que verifica que tipo de barco es devuelve el precio final del mismo.
     * @param a1
     * @return Integer costo.
     */
    public Integer alquiler(Alquiler a1){
        
        Integer costo = null;
         
        if (a1.getBarco() instanceof BarcoVelero) {
            
            BarcoVelero aux = (BarcoVelero) a1.getBarco();
            
            costo = a1.getDiasDeOcupacion() * aux.modulo();     
        }
        
        if (a1.getBarco() instanceof BarcoMotor) {
            
            BarcoMotor aux = (BarcoMotor) a1.getBarco();
            
            costo = a1.getDiasDeOcupacion() * aux.modulo();
        }
        
        if (a1.getBarco() instanceof YateDeLujo) {
            
            YateDeLujo aux = (YateDeLujo) a1.getBarco();
            
            costo = a1.getDiasDeOcupacion() * aux.modulo();
        }
        
        return costo;
    }
    
    


    
}
