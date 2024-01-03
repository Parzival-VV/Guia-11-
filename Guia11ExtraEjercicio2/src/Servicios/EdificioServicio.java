
package Servicios;


import Entidades.EdificioDeOficina;
import Usuario.Funciones;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class EdificioServicio {
    
//    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//    (suponiendo que en cada piso hay una oficina).
    
    
    private Funciones fcions = new Funciones();
    
    private Scanner leer = new Scanner(System.in);

    public EdificioDeOficina crearEdificio () {
        Integer personasPorOficina, numeroPisos, numeroDeOficinas;
        Double ancho, alto, largo;
        
        System.out.println("\n***** EDIFICIO DE OFICINAS *****\n\n"
                + "Numero de pisos del edificio: \n");
        
        numeroPisos = fcions.validarInteger(leer);
        
        System.out.println("Numero de oficinas: ");
        
        numeroDeOficinas = fcions.validarInteger(leer);
        
        System.out.println("Numero de personas por oficinas: ");
        
        personasPorOficina = fcions.validarInteger(leer);
        
        System.out.println("Ingrese el ancho en metros: ");
        
        ancho = fcions.validarDouble(leer);
        
        System.out.println("Ingrese el alto en metros: ");
        
        alto = fcions.validarDouble(leer);
        
        System.out.println("Ingrese el largo en metros: ");
        
        largo = fcions.validarDouble(leer);
        
        EdificioDeOficina e1 = new EdificioDeOficina( personasPorOficina,  numeroPisos, numeroDeOficinas,  ancho,  alto,  largo);
        
        return e1;
    }
    
//    Crear el método cantPersonas(), que muestre
//    cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    public void cantPersonas(EdificioDeOficina e1){
        
        Integer cantTotal, cantPiso;
        
        cantTotal = (e1.getPersonasPorOficina() * e1.getNumeroDeOficinas() * e1.getNumeroPisos());
        
        cantPiso = (e1.getNumeroDeOficinas() * e1.getPersonasPorOficina());
        
        System.out.println("\nLa cantidad de personas por pisos es de: " + cantPiso + ".\n\n"
                + "La cantidad total de personas que pueden trabajar en el edificio es de: " + cantTotal + ".\n");
        
    }
   
    public void mostraEdificio (EdificioDeOficina e1) {
        
        System.out.println("\n***** EDIFICIO DE OFICINAS ******\n\n"
                         + "La superficie total del edificio es: " + e1.calcularSuperficie() + "\n"
                         + "El volumen total del edificio es: " + e1.calcularVolumen() + "\n");
        
        
    }
    
}
