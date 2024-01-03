
package Servicios;

import Entidades.Polideportivo;
import Usuario.Funciones;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class PolideportivoServicio {
    
    private Funciones funcion = new Funciones();
    
    private Scanner leer = new Scanner(System.in);
    
    
    public Polideportivo crearPoli () {
        
        
        System.out.println("\nIngrese nombre del establecimiento: ");
        
        String nombre = funcion.validarString(leer);
        
        
        System.out.println("\nTECHADO, digite 1 para si y dos para no: ");
        
        Integer opc;
        
        Boolean techado = false;
        while (true) { 
            
            opc = funcion.validarInteger(leer);
            
            if (opc >  0 && opc < 3) {
                break;
                
            } else {
                funcion.msjeFueraDeRango();
            }
                
            }
         switch (opc) {
                
                case 1:
                    techado = true;
                    break;
                    
                case 2:
                    techado = false;
                    break;
            }
        
        System.out.println("Ingrese el ancho en metros: ");
        
        Double ancho = funcion.validarDouble(leer);
        
        System.out.println("Ingrese el alto en metros: ");
        
        Double alto = funcion.validarDouble(leer);
        
        System.out.println("Ingrese el largo en metros: ");
        
        Double largo = funcion.validarDouble(leer);
        
        
        Polideportivo p1 = new Polideportivo(nombre, techado, ancho, alto, largo);
        
        return p1;
    }
    
    public void mostrarPolideportivo (Polideportivo p1) {
        
        System.out.println("\n***** POLIDEPORTIVO ******\n\n");
        
        System.out.println("Nombre del establecimiento: " + p1.getNombre() + "\n"
                         + "TEchado = " + p1.getTechado() + "\n"
                         + "Superficie del polideportivo: " + p1.calcularSuperficie() + "\n"
                         + "Volumen del polideportivo: " + p1.calcularVolumen() + "\n");
        
    }
    
}
