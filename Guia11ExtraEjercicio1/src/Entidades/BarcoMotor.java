
package Entidades;

/**
 *
 * @author Rafael
 */
public class BarcoMotor extends Barco {
    
    private Integer CV;
    
    public BarcoMotor (Integer CV, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;   
        
    }

    public Integer getCV() {
        return CV;
    }

    public void setCV(Integer CV) {
        this.CV = CV;
    }
    
    @Override
    public Integer modulo (){
        
        Integer modulo = super.modulo() + this.CV;
  
        return modulo;
       
    }
    
}
