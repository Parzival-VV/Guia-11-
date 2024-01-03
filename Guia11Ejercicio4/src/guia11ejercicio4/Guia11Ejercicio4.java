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
package guia11ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Rafael
 */
public class Guia11Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Circulo c1 = new Circulo(4d);

        System.out.println("Area del circulo: " + c1.area() + "\n"
                + "El perimetro del circulo: " + c1.perimetro() + "\n");
        
        Rectangulo r1 = new Rectangulo(2d, 4d);
        
        System.out.println("Area del rectangulo: " + r1.area() + "\n"
                + "El perimetro del rectangulo: " + r1.perimetro() + "\n");
        
        
    }
    
    
    
}
