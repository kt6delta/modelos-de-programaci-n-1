/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class PanelFigura extends JPanel {
    private String PosX;
    private String PosY;
    private Color color;
    private boolean R;
    
    public PanelFigura(String x, String y, Color c, boolean rectangulo){
        this.PosX = x;
        this.PosY = y;
        this.color = c;
        this.R = rectangulo;
    }
    
    public void paintComponent(Graphics g){
        // clear the previous painting
        //super.paintComponent(g);
        // cast Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        // draw the rectangle
        if(this.R){
            g2.setColor(this.color);
            g2.fillRect(Integer.parseInt(this.PosX),Integer.parseInt(this.PosY),100,100); // fill new rectangle with color blue
        }else{
            g2.setColor(this.color); // sets Graphics2D color
            g2.fillOval(Integer.parseInt(this.PosX), Integer.parseInt(this.PosY), 100, 100);
        }
    } 
}
