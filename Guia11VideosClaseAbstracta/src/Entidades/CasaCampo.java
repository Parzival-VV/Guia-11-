/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public final class CasaCampo extends Estructura {
    
    private boolean casaArbol;
    
    public CasaCampo(boolean casaArbol, Double superficieTotal) {
        super(superficieTotal);
        this.casaArbol = casaArbol;
    }
    //Cuando es booleano se hace con is no con getv  ya que preguntamos
    //esta o no esta?
    
    public boolean isCasaArbol() {
        return casaArbol;
    }
    
    public void setCasaArbol (boolean casaArbol) {
        this.casaArbol = casaArbol;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    
    

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo;
    }
    
}
