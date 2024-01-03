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

import interfaces.AccionPerruna;

/**
 *
 * @author Rafael
 */
public final class Perro extends Animal implements AccionPerruna{
    
    private String raza;

    public Perro(String raza, Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        super(patas, cola, anosDeVida, energia);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public Integer getAnosDeVida() {
        return anosDeVida;
    }

    public void setAnosDeVida(Integer anosDeVida) {
        this.anosDeVida = anosDeVida;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }
    
    
    public void jugarEnParque(int tiempo) {
        for (int i = 0; i < tiempo; i++) {
            energia -= 10;
        }
        System.out.println("La cantidad de energia es: " + this.energia);
    }
    
    
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("guau...");
        
    }

    @Override
    public void ladrar(int cantidadVeces) {
       while (cantidadVeces > 0) {
           System.out.println("Guau.");
       }
        System.out.println("El perro ladro: " + cantidadVeces + " Veces");
    }

    @Override
    public void babear(int ml) {
        System.out.println("El perro babeo: " + ml + "ml.");
    }

    @Override
    public void calcularEdad() {
        System.out.println("La edad perruna es para " + this.anosDeVida + " es " + (anosDeVida * 7));
    }
    
}
