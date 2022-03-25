
package Sujeto;

/**
 *
 * @author jorge malaver
 */
import java.util.ArrayList;
import Interfaces.Observador;
public class Medico {
    
    private ArrayList <Observador> Lista;
    private String tipo;
    private String sitio; 
    
    public Medico(){
        Lista = new ArrayList<Observador>();//instancia hacia la lista de observadores
    }
    
    public void adicionarob(Observador n){
        Lista.add(n);
        
    }
    
    public void eliminarob(Observador n){
        Lista.remove(n);
    }
    //
    public void notificacion(){//recorre la lista de observadores
        for(Observador n:Lista){
            n.actualizador(this.tipo , this.sitio);// actualiza e informa a todos 
            // ejecuta lemetodo actualizador que es sobreescrito por todos los observadores
            // con este metodo se le notifica el cambio a cada observador
        }
    }
    public void realizarAccion(String t , String s){//Cambio de estado
        
        this.tipo =t;
        this.sitio= s;
        notificacion();
    }
    
    
    
}
