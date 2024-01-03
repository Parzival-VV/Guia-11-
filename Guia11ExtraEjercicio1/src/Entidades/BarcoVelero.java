
package Entidades;

/**
 *
 * @author Rafael
 */
public final class BarcoVelero extends Barco{
    
    private Integer mastiles;

    public BarcoVelero(Integer mastiles, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;    
    }
    
    @Override
    public Integer modulo (){
        
        Integer modulo = super.modulo() + this.mastiles;
  
        return modulo;
       
    }
    
    public Integer getMastiles () {
        return mastiles;
    }
    
    public void setMastiles (Integer mastiles) {
        this.mastiles = mastiles;
    }
    
}
