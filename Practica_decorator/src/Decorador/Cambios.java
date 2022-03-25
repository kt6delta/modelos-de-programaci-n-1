
package Decorador;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import clase_base.*;
public class Cambios extends Decorador_bicicleta {
    
    private Bicicletas bicicleta;
    
    public Cambios(Bicicletas bici){
        this.bicicleta=bici;
                
    }
    
    public String getDescripcion(){
        
        return bicicleta.getDescripcion() + "+ CAMBIOS SHIMANO";
    }
}
