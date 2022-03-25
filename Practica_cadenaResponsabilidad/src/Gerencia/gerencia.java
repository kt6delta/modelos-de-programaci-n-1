
package Gerencia;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;
public class gerencia implements Manejo_principal{
    
    private  final int TipoD = 3;
    
    public gerencia(){}
    
    @Override
    public void getManejo(int Tipo_Dpto){
       
        System.out.println("......LA PETICION DEBE SER RESPONDIDA SOLAMENTE POR LA GERENCIA.....");
    }
}
