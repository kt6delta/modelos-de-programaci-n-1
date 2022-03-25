
package practica_adapter;
/**
 *
 * @author jorge malaver
 */

import Profesionales.Arquitecto;
import Profesionales.Ingeniero;
//import Profesionales.Medico;
import Profesionales.MedicoAdapter;
import Profesionales.Target_Profesionales;
import java.util.Scanner;
public class Practica_Adapter {

     private static Scanner obj  =new Scanner(System.in);
     private static Target_Profesionales profesionales;
   
     private static void usarprofesion(){
         profesionales.Leer_planos();
         profesionales.contratos();
         profesionales.supervision();
     }
     
  
     
    public static void main(String[] args) {
        // TODO code application logic here
        
    
       int op;
       do{
           
           op = escogerOp();
           switch(op){
               case 1:
                profesionales = new Ingeniero();
                usarprofesion();
                break;
               case 2:
                   profesionales =new Arquitecto();
                   usarprofesion();
                   break;
               case 3:
                   profesionales = new MedicoAdapter();
                   usarprofesion();
                   break;
               case 4:
                   System.out.println("La opcion no es valida");
           }
           
           
       }while(op!=4);
     }//cierra el main
   
    private static int escogerOp(){
         System.out.print(
         
         "Menu Opciones\n"+
         "---------------\n"+
         "1.  Fuciones Ingeniero.\n" +
         "2.  Funciones Arquitecto.\n "+
         "3.  Finciones del medico.\n "+
         "4.   Salir. \n"+
         "Selecciones opcion....."
         );
         
         return Integer.parseInt(obj.nextLine());
     } 
}// cierra la clase practica_adapter
