
package Cliente;

/**
 *
 * @author jorge malaver
 */
public class cliente {
    
    private String nom;
    
    public cliente(String nombre){
        
        this.nom=nombre;
    }
    
    public String getNom(){
     
        return nom;
    }
    
    public void setNom(String nombre){
        
        this.nom=nombre;
    }
            
}
