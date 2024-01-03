/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Rafael
 */
public class Circulo implements calculosFormas{
    
    
    private Double radio;
    private Double diametro;
    
    public Circulo (){
        
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = Math.pow(this.radio, 2);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    
    
    @Override
    public Double area() {
        return pi * Math.pow(radio, 2);
    }

    @Override
    public Double perimetro() {
        return pi * diametro;
    }
    

    
}
