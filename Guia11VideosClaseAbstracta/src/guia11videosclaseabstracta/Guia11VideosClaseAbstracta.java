/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11videosclaseabstracta;

import Entidades.CasaCampo;
import Entidades.Edificio;

/**
 *
 * @author Rafael
 */
public class Guia11VideosClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CasaCampo e1 = new CasaCampo(true, 1000d);
        e1.calcularSuperficie(10, 30);
        System.out.println(e1.getSuperficieCubierta() + "mt2");
        
        Edificio e2 = new Edificio(4, 300d);
        e2.calcularSuperficie(10, 30);
        System.out.println(e2.getSuperficieCubierta() + "mt2");
    }
    
}
/*Polimorfismo esto nos permite que un metodo heredado se adapte segun las necesidades de cada clase con el mismo metodo*/