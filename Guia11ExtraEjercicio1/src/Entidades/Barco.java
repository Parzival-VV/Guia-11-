
package Entidades;

/**
 *
 * @author Rafael
 */
public class Barco {
    
    private Integer matricula;
    private Integer eslora;
    private Integer anioFabricacion;

    public Barco(Integer matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;  
                              
    }
  
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public Integer modulo () {
        Integer resultado = eslora *10;
      
        return resultado;
    }
    
}
