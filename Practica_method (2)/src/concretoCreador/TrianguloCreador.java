
package concretoCreador;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Triangulo;
import Abstracto.TrianguloFactory;
import Producto_concreto.*;
public class TrianguloCreador implements  TrianguloFactory{
    
     @Override
     public Triangulo CrearTriangulo(int ladoA, int ladoB, int ladoc){
         if((ladoA==ladoB) && (ladoA==ladoc)){
          return new Equilatero(ladoA, ladoB, ladoc);
         }
         if((ladoA!=ladoB) &&(ladoA!=ladoc) && (ladoB != ladoc)){
             return new Escaleno(ladoA, ladoB,ladoc);
         }
         else{
             return new Isoseles(ladoA, ladoB, ladoc);
         }
     }
    
}
