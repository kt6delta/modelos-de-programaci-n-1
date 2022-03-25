/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_method;

/**
 *
 * @author jorge malaver
 */
import Abstracto.*;
import concretoCreador.*;
import java.util.Scanner;
public class Practica_method {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { 
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("\t"+"VALORES DE LOS LADOS DEL TRIANGULO");
        
        System.out.print("\t" + "Digite valor lado 1..."); a=sc.nextInt();
        System.out.print("\t" + "Digite valor lado 2..."); b=sc.nextInt();
        System.out.print("\t" + "Digite valor lado 3..."); c=sc.nextInt();
        
        TrianguloFactory fabrica=new TrianguloCreador(); //
        Triangulo triangulo = fabrica.CrearTriangulo(a,b,c);
        System.out.println("ESTE TRIANGULO ES DE TIPO....." + triangulo.describir() );
        System.out.println("SU SUPERFICIE ES....." + triangulo.Superficie());
    }
    
}
