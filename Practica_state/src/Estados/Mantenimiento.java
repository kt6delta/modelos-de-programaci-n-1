
package Estados;

/**
 *
 * @author jorge malaver
 */

import Interfaces.Estado_ascensor;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Mantenimiento implements Estado_ascensor{
 
    // implementa la interface y su metodo
    @Override
    public void ejecutar(){
        System.out.println("ESTADO..... :  EN MANTENIMIENTO" + ".....SOLICITAR SERVICIO...");
                     
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
