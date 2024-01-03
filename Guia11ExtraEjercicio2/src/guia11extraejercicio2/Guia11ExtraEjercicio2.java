/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.

• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.


 */
package guia11extraejercicio2;

import Entidades.Edificio;
import Entidades.Polideportivo;
import Servicios.Controladores;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Guia11ExtraEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Edificio> complejos = new ArrayList();
        
        Controladores c = new Controladores();
        
        Edificio e1;
    
        for (int i = 0; i < 4; i++) {
            
          e1 = c.ejecutar();
          
          complejos.add(e1);
          
        }
        
        int poliTechado = 0, poliSinTecho = 0;
        
        for (int i = 0; i < complejos.size(); i++) {
            
            if (complejos.get(i) instanceof Polideportivo) {
                
                Polideportivo aux = (Polideportivo) complejos.get(i);
                
                if (aux.getTechado()) {
                    poliTechado ++;
                    
                } else {
                    
                    poliSinTecho ++;
                }
                
            }
            
        }
        
        System.out.println("\nLos polideportivos techados son: " + poliTechado + "\n"
                + "Los polideportivos sin techos son : " + poliSinTecho + "\n");
        
        
        
        
        
        
        
    }
    
}
