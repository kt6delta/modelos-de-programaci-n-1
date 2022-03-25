
package Figuras;

/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;
public class Rectangulo implements Figuras_geometricas{
    private String Nombre;
    private int pos_x, pos_y;
    
    public Rectangulo(){        
    }
    
    @Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    public String getNombre(){
        return Nombre;
    }
     
    @Override
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public void getposicion(){
       System.out.println("Altura del rectangulo .." + this.pos_y);
       System.out.println("Ancho del rectangulo...." + this.pos_x);  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
}
