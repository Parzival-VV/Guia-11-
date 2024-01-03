
package guia11ejercicio1;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rafael
 */
public class Guia11Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lavadora l1 = new Lavadora();
//        
//       l1.crearLavadora();
//       l1.precioFinal();
//       
//        System.out.println(l1.getCarga() + " " + l1.getColor() + " " + l1.getConsumoEnergetico() + " " + l1.getPeso() + " " + l1.getPrecio());
//        
//      // Televisor tv = new Televisor();
//       
//       tv.crearTelevisor();
//       tv.precioFinal();
//       
//       System.out.println(tv.getResolucionEnPulgadas() + " " + l1.getColor() + " " + tv.getSintonizadorTDT() + " " + l1.getPeso() + " " + l1.getPrecio());
       
       //Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.

    ArrayList<Electrodomestico> e = new ArrayList();
    
    Lavadora l1 = new Lavadora(35d, 1000d, "negro", 'E', 60d);
    Lavadora l2 = new Lavadora(35d, 1000d, "rojo", 'C', 60d);
    Televisor tv = new Televisor(50d, true, 1000d, "blanco", 'A', 15d);
    Televisor tv1 = new Televisor(75d, false, 1000d, "gris", 'A', 25d);
    
    e.add(l1);
    e.add(l2);
    e.add(tv);
    e.add(tv1);
    
    Double suma = 0d;
  
    
        for (int i = 0; i < e.size(); i++) {
            
            Televisor tvAux = new Televisor();
            Lavadora lAux = new Lavadora();

            if (e.get(i) instanceof Televisor) {
                
                tvAux = (Televisor) e.get(i);              
                tvAux.precioFinal();
                
                suma += tvAux.getPrecio();
                System.out.println("Precio tv: " + tvAux.getPrecio() + "\n");

            } else {
                
                lAux = (Lavadora) e.get(i);
                lAux.precioFinal();
                
                suma += lAux.getPrecio();
                
                System.out.println("\n" + "Precio lavadora: "  + lAux.getPrecio() + "\n");
            }
            
           

        }
        
        System.out.println("\n" + "La suma de todos los precios es : " + suma);
    
  
   

        


       
    }
    
}
