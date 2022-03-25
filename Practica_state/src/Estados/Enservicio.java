
package Estados;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Estado_ascensor;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Enservicio implements Estado_ascensor{
    
    // implementa el metodo ejecutar y muestra el estado del servicio
    
   @Override
   public void ejecutar(){
       System.out.println("ESTADO ..:   ASCENSOR EN SERVICIO.....");
       System.out.println("BUEN  VIAJE.............");
       
       try {
           Thread.sleep(2000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Enservicio.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
