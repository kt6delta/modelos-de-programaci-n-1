
package Decorador;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import clase_base.*;
public class Frenos extends Decorador_bicicleta {
    
    private Bicicletas bicicleta;
    
    public Frenos(Bicicletas bici){
        this.bicicleta=bici;
    }
    
    @Override
    public String getDescripcion(){
        return bicicleta.getDescripcion() + " + FRENOS DE DISCO";
    }
}
