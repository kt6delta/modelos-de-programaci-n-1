
package practica_facade;

/**
 *
 * @author jorge malaver
 */

import Facade.*;
import Cliente.*;
public class Practica_facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( new FacadePrestamo().sinreporte(new cliente("Kelly")));
        
        // n es necesario crear todos los objetos de Modulos
    }
    
}
