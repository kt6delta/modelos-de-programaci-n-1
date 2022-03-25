
package practica_cadenaresponsabilidad;

/**
 *
 * @author jorge malaver
 */
import Gerencia.gerencia;
import Manejos_concretos.*;
import java.util.Scanner;
public class Practica_cadenaResponsabilidad {

        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int op=0;
        gerencia obj =new gerencia();
        Personal obj1 = new Personal(obj);//recibe como sucesor un objeto tipo gerencia
        Contabilidad obj2 =new Contabilidad(obj1);
        
        do{
            System.out.println("**********************************");
            System.out.println("* SELECCIONE LA PETICION AL DPTO *");
            System.out.println("* 1  CONTABILIDAD                *");
            System.out.println("* 2  PERSONAL                    *");
            System.out.println("* 3  GERENCIA                    *");
            System.out.println("* 0  SALIR DE LA APLICACION      *");
            System.out.println("**********************************");
            
            op=sc.nextInt();
            if(op!=0){
                obj2.getManejo(op);
            }
            
        }while(op!=0);
        
    }
    
}
