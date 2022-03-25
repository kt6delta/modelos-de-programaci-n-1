/
package Observadores;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Observador;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Cirugia  implements Observador{
    
    @Override
    public void actualizador(String t , String s){
        System.out.println("\n\n");
        System.out.println("CIRUGIA");
        System.out.println("Proveer recursos a............" + t);
        System.out.println("Destino de los recursos..... "+ s);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cirugia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
