
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Productos.*;
public abstract class CamionBuilder {
    
    protected camion Camion;
    
    public camion getcamion(){
     
        return Camion;
    }
    
    public void ConstruirCamion(){
        Camion =new camion();
    }
    
    public abstract void builmotor();
    public abstract void builcarroceria();
    public abstract void builruedas();
}
