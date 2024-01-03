
package Entidades;

import java.util.Scanner;

/**
 *A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
 * además de los atributos heredados.
 * @author Rafael
 */
public class Lavadora extends Electrodomestico {
    
    private Scanner leer1 = new Scanner(System.in);
    private Double carga;
    
    
//  Los constructores que se implementarán serán:
//• Un constructor vacío.
    public Lavadora(){
        
    }
    
 //• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
//llamar al constructor de la clase padre.
    
    public Lavadora (Double carga, Double precio, String color, char consumoEnergetico, Double peso){
        super(consumoEnergetico, precio, color, peso);
        this.carga = carga;
        
    }
    
//    Los métodos que se implementara serán:
    
//    • Método get y set del atributo carga.
    
    public Double getCarga () {
        return carga;
    }
    
    public void setCarga (Double carga) {
        this.carga = carga;
    }
    
//    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    
    public void crearLavadora() {
        
       super.crearElectrodomestico();
        System.out.println("\nIngrese la capacidad de carga en kilos: ");
        
        while (true) {
            
            if (leer1.hasNextDouble()) {
                this.carga = leer1.nextDouble();
                break;
            } else {
                System.out.println("\nERROR dato no valido." + "\n"
                        + "Intentelo de nuevo: ");
                leer.next();
            }
        }
    }
    
//    • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.
    
    @Override
    public void precioFinal() {
        
        super.precioFinal();
        
        if (carga > 30d) {   
            precio = precio + 500d;
        } 
        
    }
    
    
    
}
