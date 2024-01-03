
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Electrodomestico {
    
//Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
//consumo energético (letras entre A y F) y peso.
    
    protected Scanner leer = new Scanner(System.in);
    
    
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;
    
//Los constructores que se deben implementar son los siguientes:
    
//• Un constructor vacío.
    public Electrodomestico () {
        
    }
    
//• Un constructor con todos los atributos pasados por parámetro.
    
    public Electrodomestico (char consumoEnergetico, Double precio, String color, Double peso) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
    }
    
//    Los métodos a implementar son:
    
//• Métodos getters y setters de todos los atributos.

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
 
    
//• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    
    protected void comprobarConsumoEnergetico (char letra) {
        
        char [] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        
        int cont = 0;
        
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                cont ++;
                this.consumoEnergetico = letras[i];
                break;
            }           
        }
        
        if (cont == 0) {
            this.consumoEnergetico = 'F';
        }
        
    }
    
//  • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    protected void comprobarColor(String color) {
        
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        int cont = 0;
        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                cont ++;
                this.color = colores[i];
            }
        }
        
        if (cont == 0) {
            this.color = "blanco";
        }
    }
    
//    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    
    public void crearElectrodomestico(){
        
        System.out.println("******NUEVO ELECTRODOMESTICO*******");
        
        this.precio = 1000d;
        
        System.out.println("\nColores disponibles: blanco, negro, rojo, azul y gris " + "\n"
                + "Ingrese color: ");
        
        String aux;
        aux = leer.nextLine();

        while (true) {

            if (!aux.matches("^[a-zA-Z ]+$")) {

                System.out.println("\nERROR dato no valido." + "\n"
                        + "Intentelo de nuevo: ");

                aux = leer.nextLine();

            } else {

                break;
            }
        }
        
        comprobarColor(aux);

        System.out.println("\nOpciones de consumo energetico: A, B, C, D, E, F. " + "\n"
                + "Ingrese letra: ");

        String letra;
        letra = leer.next();
        
        while (true) {

            if (!letra.matches("^[a-zA-Z]{1}$")) {
                
                System.out.println("\nERROR dato no valido " + "\n"
                                 + "Intentelo de nuevo: ");
                
                letra = leer.nextLine();

            } else {

                break;
            }
        }
         char caracter = letra.charAt(0);
         
         comprobarConsumoEnergetico(caracter);
         
         System.out.println("\nIngrese el peso del electrodomestico: ");
         
         Double kilos;
         while (true) {
             
             if(leer.hasNextDouble()) {
                 kilos = leer.nextDouble();
                 break;
                 
             } else {
                 
                 System.out.println("\nERROR dato no valido " + "\n"
                         + "Intentelo de nuevo: ");
                 leer.next();
             }
         }
         
         peso = kilos;
        
    }
    
//    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    
//    LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
  
    public void precioFinal() {

        double a = 1000d;
        double b = 800d;
        double c = 600d;
        double d = 500d;
        double e = 300d;
        double f = 100d;
        
        switch(this.consumoEnergetico) {
                        
            case 'A':
            case 'a':
                
                if (this.peso > 0 && this.peso < 20) {
                    this.precio = a + 100d;
                } else if (this.peso > 19 && this.peso < 50) {
                    this.precio = a + 500d;
                } else if (this.peso > 49 && this.peso < 80) {
                    this.precio = a + 800d;
                } else if (this.peso > 80) {
                    this.precio = a + 1000d;
                }
                
                break;
                
            case 'B':
            case 'b':
                
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += b + 100d;
                } else if (this.peso > 19 && this.peso < 50) {
                    this.precio += b + 500d;
                } else if (this.peso > 49 && this.peso < 80) {
                    this.precio += b + 800d;
                } else if (this.peso > 80) {
                    this.precio += b + 1000d;
                }
                
                break;
                
            case 'C':
            case 'c':
                
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += c + 100d;
                } else if (this.peso > 19 && this.peso < 50) {
                    this.precio += c + 500d;
                } else if (this.peso > 49 && this.peso < 80) {
                    this.precio += c + 800d;
                } else if (this.peso > 80) {
                    this.precio += c + 1000d;
                }
                
                break;
                
            case 'D':
            case 'd':
                
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += d + 100d;
                } else if (this.peso > 19 && this.peso < 50) {
                    this.precio += d + 500d;
                } else if (this.peso > 49 && peso < 80) {
                    this.precio += d + 800d;
                } else if (this.peso > 80) {
                   this.precio += d + 1000d;
                }
                
                break;
                
            case 'E':
            case 'e':
                
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += e + 100d;
                } else if (this.peso > 19 && this.peso < 50) {
                    this.precio += e + 500d;
                } else if (this.peso > 49 && this.peso < 80) {
                    this.precio += e + 800d;
                } else if (this.peso > 80) {
                    this.precio += e + 1000d;
                }
                
                break;
                
            case 'F':
            case 'f':
                
                if (this.peso >= 1 && this.peso <= 19) {
                    this.precio += f + 100d;
                } else if (peso > 19 && this.peso < 50) {
                    this.precio += f + 500d;
                } else if (peso > 49 && this.peso < 80) {
                    this.precio += f + 800d;
                } else if (peso > 80) {
                    this.precio += f + 1000d;
                }
                
                break;
                
                
        }
        
        
    }



}
