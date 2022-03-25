
package Manejos_concretos;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;
public class Personal implements Manejo_principal{
 
    private  final int TipoD = 2;
    private Manejo_principal suceso;
    
    public Personal(Manejo_principal s){
        this.suceso =s;
    }
    
    @Override
    public void getManejo(int Tipo_Dpto){
     
     if(Tipo_Dpto==TipoD) {
         System.out.println("......EL PEDIDO DEBE SER CONTESTADO POR PERSONAL.....");
     }  
     else{
         suceso.getManejo(Tipo_Dpto);
     }
    }
    
}
