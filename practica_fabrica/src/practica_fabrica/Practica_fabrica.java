/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_fabrica;

/**
 *
 * @author jorge malaver
 */
import Fabrica.fabrica;
import java.util.Scanner;
import Abstracto.Comun;
public class Practica_fabrica {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        Comun Micomun;
        fabrica Mifabrica;
        
        System.out.println("Digite el almacen seleccionado:   ");
        String  seleccion=sc.nextLine();
        Mifabrica = new fabrica(seleccion);
        Micomun =  Mifabrica.crear_selecion();
        String salir="Seleccione el almacen....:" + Micomun.Escojer();
        
        System.out.println(salir);
        
    }
    
}
