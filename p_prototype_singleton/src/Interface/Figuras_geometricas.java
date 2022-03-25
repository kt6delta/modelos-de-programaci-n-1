
package Interface;

/**
 *
 * @author jorge malaver
 */
public interface Figuras_geometricas {
    
    public void setNombre(String n);
    public String getNombre();
    public void tamaño(int x, int y);
    public int getposicionX();
    public int getposicionY();
    public Figuras_geometricas clonar();
}
