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

import interfaces.AccionGatuna;

/**
 *
 * @author Rafael
 */
public final class Gato extends Animal implements AccionGatuna{
    
    private String raza;

    
    public Gato (String raza, Integer patas, boolean cola, Integer anosDeVida, Double energia ) {
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
    
    public void ronrronear(){
        System.out.println("grrrrrrr.....");
    }
    
      
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Miauuu");
    }

    @Override
    public void mauyar(int db) {
        System.out.println("El gato mauya a: " + db + " db.");
    }

    /*Aca se cumple el polimorfismo ya que el metodo abtracto de la clase animal
    se le da instruccion en la clase gato segun las necesidades de esta*/
    @Override
    public void calcularEdad() {
        System.out.println("La edad gatuna para " + this.anosDeVida + " es " + (anosDeVida * 8));
    }
    
    
}
