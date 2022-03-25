
package Ejecutar;

/**
 *
 * @author jorge malaver
 */

// clase para probar el patron
import java.lang.Thread;
import Observadores.Admon;
import Observadores.Cirugia;
import Observadores.Enfermeria;
import Sujeto.*;
import java.util.Scanner;
public class Probando {
    
    Enfermeria enfermeria;
    Cirugia cirugia;
    Admon admon;
    Medico medico;
    
    public void menuAcciones(){
        
        System.out.println("***  ESCOGER  ACCION************");
        System.out.println("***  1. Realizar Accion*********");
        System.out.println("***  2. Agregar Observador******");
        System.out.println("***  3. Eliminar Observador*****");
        System.out.println("***  0. Salir*******************");
    }
    
    public void Seleccionar(){
        
        System.out.println("***  ESCOGER  ACCION***************");
        System.out.println("***  1. Agregar enfermeria*********");
        System.out.println("***  2. Agregar cirugia************");
        System.out.println("***  3. Agregar Admon**************");
        System.out.println("*** *******************************");
    }
    
    public void adicionarob(int x) throws InterruptedException{
        
        boolean listo= true;
        switch(x){
            case 1:
                medico.adicionarob(enfermeria);
                break;
            case 2:
                medico.adicionarob(cirugia);
                break;
            case 3:
                medico.adicionarob(admon);
                break;
            default:
                listo = false;
                System.out.println("OPCION NO VALIDA !!!!!!");
            
        }//fin switch
        
        if(listo) System.out.println("...OBSERVADOR AGREGADO...");
        Thread.sleep(2000);
    }//fin adicionar onservador
    
    
    public void eliminarob(int x) throws InterruptedException{
       
       boolean listo = true;
       switch(x){
           case 1:
               medico.eliminarob(enfermeria);
               break;
           case 2:
               medico.eliminarob(cirugia);
               break;
           case 3:
               medico.eliminarob(admon);
               break;
           default:
               listo=false;
               System.out.println("...OPCION NO VALIDA...");
           
           
       }//fin switch
        if(listo) System.out.println("...OBSERVADOR ELIMINADO...");
         Thread.sleep(2000);
    }//fin eliminar observador 
    
    
    public void ejecutaracciones() throws InterruptedException{//crea instancias
        enfermeria =new Enfermeria();
        cirugia = new Cirugia();
        admon = new Admon();
        medico = new Medico();
        String tipo="", sitio="";//string que guardan el tipo y el sitio de la accion
        int opt,ops;//variables que permiten escoger entre agregar y eliminar observadores
        Scanner sc = new Scanner(System.in);
        
        do{
            menuAcciones();
            opt=sc.nextInt();
            sc= new Scanner(System.in);
            switch(opt){
                case 1:
                    System.out.print("ESCRIBIR EL TIPO.......:  ");
                    tipo=sc.nextLine();
                    System.out.print("ESCRIBIR EL SITIO......:  ");
                    sitio=sc.next();
                    medico.realizarAccion(tipo, sitio);//notifica a todos los observadores el cambio de estado
                    System.out.println("\n\n");
                    break;
                case 2:
                    Seleccionar();
                    adicionarob(sc.nextInt());
                    break;
                case 3:
                    Seleccionar();
                    eliminarob(sc.nextInt());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("...OPCION ERRADA....");
                    
                    
            }//fin de switch
            
        }while(opt!=0);
        
    }
    
   
    
}//cierra laclase
