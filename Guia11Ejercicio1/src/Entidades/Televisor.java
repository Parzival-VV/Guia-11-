
package Entidades;

/**
 *
 * @author Rafael
 */
public class Televisor extends Electrodomestico{
    
//Se debe crear también una subclase llamada Televisor con los siguientes atributos:
//resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
//heredados.
    
    private Double resolucionEnPulgadas;
    private boolean sintonizadorTDT;
    
//    Los constructores que se implementarán serán:
    
//• Un constructor vacío.
    
    public Televisor() {
        
    }
    
//• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
//heredados. Recuerda que debes llamar al constructor de la clase padre.
    
    public Televisor (Double resolucionEnPulgadas, boolean sintonizadorTDT, Double precio, String color, char consumoEnergetico, Double peso ){
        super(consumoEnergetico, precio, color, peso);
        this.resolucionEnPulgadas = resolucionEnPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
        
    }
    
//    Los métodos que se implementara serán:
    
//• Método get y set de los atributos resolución y sintonizador TDT.
    
    public Double getResolucionEnPulgadas() {
        return resolucionEnPulgadas;
        
    }
    
    public boolean getSintonizadorTDT () {
        return sintonizadorTDT;
        
    }
    
    public void setResolucionEnPulgadas (Double resolucionEnPulgadas) {
        this.resolucionEnPulgadas = resolucionEnPulgadas;
        
    }
    
    public void setSintonizadorTDT (boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
        
    }
    
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    
    public void crearTelevisor () {
        super.crearElectrodomestico();
        
        System.out.println("\nResolucion en pulgadas: " + "\n"
        + "Ingrese pulgadas: ");
        
        while (true) {
            
            if (leer.hasNextDouble()) {
             
                this.resolucionEnPulgadas = leer.nextDouble();
                break;
                
            } else {
                
                System.out.println("\nERROR el dato ingresado no es valido " + "\n"
                        + "Intentelo de nuevo: ");
                leer.nextLine();
                
            }
        }
        
        System.out.println("\nTiene sintonizador TDT ?, digite 1 para si 2 para no." + "\n"
                + "Respuesta: ");
        
        int resp;
        
        while (true) {
            
            if (leer.hasNextInt()) {
                resp = leer.nextInt();
                
                    if (resp != 1 || resp != 2) {
                        
                        System.out.println("ERROR el numero ingresado esta fuera de rango" + "\n"
                        + "Intentelo de nuevo: ");
                        leer.nextLine();
                        
                    } else {
                        
                        break;
                    }
                    
            } else {
                
                System.out.println("ERROR dato no valido " + "\n"
                        + "Intentelo de nuevo: ");
                leer.nextLine();
            }
            
        }
        
        if (resp == 1) {
            
            this.sintonizadorTDT = true;
            
        } else {
            
            this.sintonizadorTDT = false;
        }
        
    }
    
//    • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    
    @Override
    public void precioFinal () {
        
        super.precioFinal();
        
        if (this.resolucionEnPulgadas > 40 && this.sintonizadorTDT == true) {
            
            this.precio += (this.precio * 0.3) + 500;
        }
        
    }
    
    
}
