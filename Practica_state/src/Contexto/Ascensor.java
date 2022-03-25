package Contexto;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Estado_ascensor;
public class Ascensor {
    
    private Estado_ascensor estado;//ATRIBUTO DE TIPO ESTADO ASCENSOR (INTERFACE)
    
    public void setestado(Estado_ascensor n){
        
        this.estado=n;
    }
    
    public void Ejecutar(){
        estado.ejecutar();
    }
            
}
