/*
Herencia multinivel
 */
package guia11videos;

import Entidades.Hotel;
import Entidades.Hotel1;
import Entidades.Hotel2;
import Entidades.Hotel3;
import Entidades.Hotel4;
import Entidades.Hotel5;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Guia11Videos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Hotel> hoteles = new ArrayList();
        
        Hotel1 H1 = new Hotel1(1500d, 9d, 10);
        Hotel2 H2 = new Hotel2(2500d, 12d, 15);
        Hotel3 H3 = new Hotel3(3500d, 15d, 20);
        Hotel4 H4 = new Hotel4(5000d, 20d, 30);
        Hotel5 H5 = new Hotel5(10000d, 30d, 50);
        
        hoteles.add(H1);
        hoteles.add(H2);
        hoteles.add(H3);
        hoteles.add(H4);
        hoteles.add(H5);
        
        
        /*instanceof nos devuelve un booleano, en este caso le estamos diciendo que si 
        el objeto Hotel que viene del arrayList es un hotel5 osea true nos los diga
        podemos decir que el instanceof nos va a decir 
        en base a que nacio en cuanto a jerarquias
        cabe desstacra que este hotel es una instancia del  hotel 5 hotel 4 hotel 3
         hotel 2 y hotel1 ya que hereda de todos
        esto se da solo en la herencia multinivel
        para este ejemplo coloco continue al final del if para que evalue los siguientes y e muestre 
        en cuantas clases se instancia por herencia.
        */
        for (Hotel aux : hoteles) {
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un Hotel 5");
                continue;
            }
            
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un Hotel 4");
                continue;
            }
            
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un Hotel 3");
                continue;
            }
            
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un Hotel 2");
                continue;
            }
            
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un Hotel 1");
               
            }
            
        }
        

        
    }
    
}
