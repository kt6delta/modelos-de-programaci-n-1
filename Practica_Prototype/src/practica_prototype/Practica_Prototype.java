
package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.Rectangulo;
import java.util.Scanner;
import Interface.Figuras_geometricas;

public class Practica_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int op, posx, posy;
        Scanner sc= new Scanner(System.in);
        Rectangulo rectangulo= new Rectangulo();
        Figuras_geometricas geometrica = null;
        rectangulo.setNombre("Rectangulo");
        rectangulo.tamaño(18, 25);
        
        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + rectangulo.getNombre());
        System.out.println("......TAMAÑO ORIGINAL");
        rectangulo.getposicion();
        
        //  figura clonada
        
        System.out.println("escoja la figura que desea clonar.....");
        System.out.println("1. Rectangulo");
        System.out.println("2. Circulo");
        op=sc.nextInt();
        
        if(op==1){
          geometrica = rectangulo.clonar();
        }
        else{
            System.out.println("No implementada");
        }
        
        geometrica.setNombre(geometrica.getNombre() + "Figura Clonada");
        System.out.print("Digite el nuevo alto...");
        posx=sc.nextInt();
        System.out.print("Digite el nuevo ancho...");
        posy=sc.nextInt();
        geometrica.tamaño(posx, posy);
        
        // figura clonada
        
        System.out.println("....Esta es la figura clonada...");
        System.out.println(geometrica.getNombre());
        System.out.println("...Esta es la posicion...");
        geometrica.getposicion();
        
        // figura original
        System.out.println("......ORIGINAL.....");
        System.out.println("Figura Geometrica....." + rectangulo.getNombre());
        System.out.println("......TAMAÑO ORIGINAL");
        rectangulo.getposicion();
    }
    
}
