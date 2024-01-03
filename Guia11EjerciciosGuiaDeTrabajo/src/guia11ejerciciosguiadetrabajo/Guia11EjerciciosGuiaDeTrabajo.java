/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package guia11ejerciciosguiadetrabajo;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Guia11EjerciciosGuiaDeTrabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Animal> animales = new ArrayList();
        
//        Animal a = new Animal();
//        Animal b = new Perro();
//        Animal c = new Gato();
//        
//        animales.add(a);
//        animales.add(b);
//        animales.add(c);
//        
//        for (Animal animal : animales) {
//            animal.hacerRuido();
//        }
//        
//        
//        animales.get(1).pasear(7);
//        animales.get(2).pasear(5);
//        animales.get(1).comerAlimento(6);
//        System.out.println(animales.get(1).energia);
//        animales.get(2).comerAlimento(4);
//        System.out.println(animales.get(2).energia);
    
        Gato g = new Gato("Naranjoso", 4, true, 5, 1000d);
        Perro p = new Perro("BEAGLE", 4, true, 13, 1000d);
        
        g.calcularEdad();
        g.hacerRuido();
        //Metodo propio del gato:
        g.ronrronear();
        
        System.out.println("---------------------------------------------");
        
        p.calcularEdad();
        p.hacerRuido();
        //Metodo propio del perro:
        p.jugarEnParque(10);
        
    
    }
    
    
}
