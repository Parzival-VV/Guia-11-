/*

 */
package Servicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *Metodos de uso comun a todos los trabajos.
 * @author Rafael
 */
public class MiddleWorks {
    
    /**
     * 
     * @return devuelve una fecha ya valida ingresada por teclado;
     */
    public LocalDate pedirFecha(){
         
         Integer dia = 0, mes =0, anio = 0;
         Scanner leer = new Scanner(System.in);
         
         System.out.println("\nIngrese el año: ");
         
         do{
             
             anio = validarInteger(leer);
             
             if (anio < 2026 && anio > 2022) {
                     break;
                     
                 } else {                    
                     msjeFueraDeRango();

                 }              
             
         } while (anio > 2026 || anio < 2022);
         
        
        System.out.println("\nIngrese numero de mes: ");
        
        do{
            mes = validarInteger(leer);
            
             if (mes < 13 && mes >= 1) {
                    break;

                } else {

                    msjeFueraDeRango();
                    
                }
        } while (mes > 12 || mes < 1);

        
        System.out.println("\nIngrese numero del dia: ");

        while (true) {

            if (leer.hasNextInt()) {

                dia = leer.nextInt();

                if (mes != 2 && mes != 4 && mes != 6 && mes != 9 && mes != 11) {

                    if (dia <= 31 && dia >= 1) {
                        break;

                    } else {

                        msjeFueraDeRango();
                        leer.nextLine();
                    }

                } else if (mes == 2){
                    
                    if (dia <= 28 && dia >= 1) {
                        break;
                        
                    } else {

                        msjeFueraDeRango();
                        leer.nextLine();
                    }
          
                    
                } else {
                    
                    if (dia <= 30 && dia >= 1) {
                        break;
                        
                    } else {
                        
                        msjeFueraDeRango();
                        leer.nextLine();
                        
                    }
                }
            } else {

                msjeDatoNoValido();
                leer.nextLine();

            }

        }
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }
    
    
    /**
     * Valida que la entrada del teclado sea un String, contempla espacios.
     * @param leer
     * @return String 
     */
    public String validarString(Scanner leer){
        
       String string = leer.nextLine();
       
      while (true) {
       if (!string.matches("^[a-zA-Z ]+$")){
           
           msjeDatoNoValido();
           string = leer.nextLine();
           
       } else {
           break;
       }
       
      }       
           return string;
    }
    
    
        /**
     * valida que lo que viene por teclado sea un entero y no termina hasta que asi sea.
     *
     * @param leer
     * @return Integer validado.
     */
        public Integer validarInteger(Scanner leer) {
        
        Integer integer = 0;
        
        while (true) {
           
            if(leer.hasNextInt()) {
                integer = leer.nextInt();
                leer.nextLine();
                 break;
    
            } else {
                
                System.out.println("ERROR dato no valido \n"
                                 + "Intentelo de nuevo: ");
                leer.nextLine();
            }
            
        }
           
        return integer;
    }
    
    
    /**
     * Devuelve mensaje de error para un numero fuera de rango.
     */
    public void msjeFueraDeRango() {
        System.out.println("El numero ingresado esta fuera de rango. " + "\n"
                + "intentel de nuevo:");
    }
    
    /**
     * Devuelve mensaje de error para una entrada de dato no valida.  */
    public void msjeDatoNoValido() {
        System.out.println("\nERROR, dato no valido. " + "\n"
                + "intentelo de nuevo:");
    }

}
