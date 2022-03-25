
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
public class Practica_builder {

    
    public static void main(String[] args) {
        // TODO code application logic here
    construir_camion obj= new construir_camion();
    CamionBuilder obj1= new Camion_uno();
    CamionBuilder obj2=new Camion_dos();
    obj.setcamionBuilder(obj1);
    obj.fabrica_camion();
    camion nueva;
        nueva = obj.getcamion();
       
        
    }
    
}
