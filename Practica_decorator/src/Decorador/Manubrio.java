
package Decorador;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import clase_base.*;
public class Manubrio extends Decorador_bicicleta{
    
    private Bicicletas bicicleta;
    
    public Manubrio(Bicicletas bici){
        
        this.bicicleta=bici;
    }
    
    @Override
    public String getDescripcion(){
        return bicicleta.getDescripcion() + " + MANUBRIO PROFESIONAL";
    }
}
