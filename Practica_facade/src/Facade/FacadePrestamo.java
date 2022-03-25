
package Facade;

/**
 *
 * @author jorge malaver
 */
import Modulos.*;
import Cliente.*;
public class FacadePrestamo {
 
    public boolean sinreporte(cliente x){
        
        if(new EntidadBancaria().Tienefondos(x) && (new Estudiocredito().historialcredito(x)) && new Solicitudprestamo().poseeprestamo(x)){
            
          System.out.println("Se le otorgo el prestamo");
          return true;
    }
        else{
            
            System.out.println("No Se le otorgo el prestamo");
          return false;
        }
    
}
