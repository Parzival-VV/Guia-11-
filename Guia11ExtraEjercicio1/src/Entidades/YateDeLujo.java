
package Entidades;

/**
 *
 * @author Rafael
 */
public final class YateDeLujo extends BarcoMotor {
    
    private Integer camarotes;
    
    public YateDeLujo (Integer camarotes, Integer CV, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(CV, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public Integer modulo (){
        
        Integer modulo = super.modulo() + this.camarotes;
  
        return modulo;
       
    }
    
    
    
    
    
    
    
}
//    private Integer matricula;
//    private Double eslora;
//    private Integer anioFabricacion;