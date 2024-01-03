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
public final class Edificio extends Estructura {
    
    private Integer pisos;
    
    public Edificio(Integer pisos, Double superficieTotal) {
        super(superficieTotal);
        this.pisos = pisos;
    }
    
    public Integer getPisos() {
        return pisos;
    }
    
    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Double getSuperficieCubierta() {
        return superficieCubierta;
    }

    public Double getSuperficieTotal() {
        return superficieTotal;
    }

    public void setSuperficieCubierta(Double superficieCubierta) {
        this.superficieCubierta = superficieCubierta;
    }

    public void setSuperficieTotal(Double superficieTotal) {
        this.superficieTotal = superficieTotal;
    }
    
    

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        this.superficieCubierta = ancho * largo * this.pisos;
    }
    
}
