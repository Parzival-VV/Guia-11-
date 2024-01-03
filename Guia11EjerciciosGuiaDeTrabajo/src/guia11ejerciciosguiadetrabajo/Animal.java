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

import interfaces.AccionAnimal;

/**
 *
 * @author Rafael
 */
public abstract class Animal implements AccionAnimal {
    
   protected Integer patas;
   protected boolean cola;
   protected Integer anosDeVida;
   protected Double energia;
   
   public Animal(Integer patas, boolean cola, Integer anosDeVida, Double energia) {
       this.patas = patas;
       this.cola = cola;
       this.anosDeVida = anosDeVida;
       this.energia = energia;
   }
   /*Aca es donde aplicamos el polimorfismo este metodo abstracto
   no recibe parametros ni tiene cuerpo, se va a adaptar a la clase perro o gato 
   segun sus necesidades*/
   public abstract void calcularEdad();
    
    protected void hacerRuido(){
        System.out.println("hola");
    }

    @Override
    public void pasear(int cantidadVueltas) {
        int vuelta = 100;
        energia -= (cantidadVueltas * vuelta);
        System.out.println("La mascota dio : " + cantidadVueltas + " vueltas" + "\n"
                + "Energia restante: " + energia);
    }

    @Override
    public int molestarDueno() {
        int molesto = 10;
        return molesto;
    }

    @Override
    public void comerAlimento(int cantidad) {
        int alimento = 100;
        energia += (cantidad * alimento);
        System.out.println("La mascota recupero: " + (cantidad * alimento) + " Energia" );
    }
    
}
