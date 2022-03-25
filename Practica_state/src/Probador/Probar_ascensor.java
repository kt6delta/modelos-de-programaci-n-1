
package Probador;

/**
 *
 * @author jorge malaver
 */
import Estados.Enservicio;
import Estados.Mantenimiento;
import Contexto.Ascensor;
import java.util.Scanner;

public class Probar_ascensor {
    
    Enservicio servicio = new Enservicio(); // crea un objeto de tipo serviciio
    Mantenimiento obj = new Mantenimiento();
    Ascensor  ascensor = new Ascensor();
    int op=0;
    Scanner sc =new Scanner(System.in);
    
    
    private static void  ver_menu(){
        StringBuilder menu=new StringBuilder();
        
        menu.append(".....................................");
        menu.append("\n");
        menu.append("  SELECCIONE EL ESTADO DEL ASCENSOR...");
        menu.append("\n");
        menu.append(" 1. EN SERVICIO...................... ");
        menu.append("\n");
        menu.append(" 2. FUERA DE SERVICIO.................");
        menu.append("\n");
        menu.append(" 0. SALIR.............................");
        
        System.out.println(menu.toString());
                
    }//fin ver menu
    public void pmenu(){
    do{
       ver_menu();
       op=sc.nextInt();
       switch(op){
           case 1:
               ascensor.setestado(servicio);// 
               break;
           case 2:
               ascensor.setestado(obj);
               break;
           case 0:
           System.exit(0);
           default:
               System.out.println("Opcion errada");
       }//fin switc
       
    ascensor.Ejecutar();
    
    }while(op!=0);
  } 
}// fin de la clase probar_ascensor
