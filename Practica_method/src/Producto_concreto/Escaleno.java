/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto_concreto;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Triangulo;
public class Escaleno extends Triangulo{
    
     int lado1,lado2,lado3;
    public Escaleno(int a, int b, int c){
        super(a,b,c);
        this.lado1=a;
        this.lado2=b;
        
    }
    
     @Override
    public String describir(){
        return "....... ESCALENO......";
    }
    
    @Override
    public String Superficie(){
        int x;
        String res;
        x=(lado1*lado2)/2;
        res=Integer.toString(x);
        return res;     
      }
}
