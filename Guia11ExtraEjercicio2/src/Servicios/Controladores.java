/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficina;
import Entidades.Polideportivo;
import Usuario.Funciones;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Controladores {
    
    private Scanner leer = new Scanner(System.in);
    
    private Funciones funcion = new Funciones();
    
    public Edificio ejecutar() {
        
        Edificio e1 = null;
        
        System.out.println("\nElija 1 para crear Polideportivo o 2 para crear edificio de oficinas: \n\n"
                + "OPCION: ");
        
        Integer opc;
        
        while (true) { 
            
            opc = funcion.validarInteger(leer);
            
            if (opc > 0 && opc < 3) {
                break;
                
            } else {               
                funcion.msjeFueraDeRango();
            }
        }
        
        switch (opc) {
        
            case 1:
                
                PolideportivoServicio ps = new PolideportivoServicio();
                
                e1 = ps.crearPoli();
                
                ps.mostrarPolideportivo((Polideportivo) e1);
                
                break;
                
            case 2:
                
                EdificioServicio es = new EdificioServicio();
                
                e1 = es.crearEdificio();
                
                es.cantPersonas((EdificioDeOficina) e1);
                
                es.mostraEdificio((EdificioDeOficina) e1);
                
                break;
    }
        
        
      return e1;  
        
        
    }
    
}
