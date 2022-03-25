/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class PrincipalTemplate extends JFrame {
    private JPanel panel;
    private JLabel titulo, lFondo;
    private JButton bCirculo, bRectangulo, bSalir;
    private ImageIcon iCirculo, iRectangulo, iDimAux, iSalir, iFondo;
    private PrincipalComponent vistacomponent;
    
    public PrincipalTemplate(PrincipalComponent vistacomponent){
        this.vistacomponent = vistacomponent;
        
        this.crearObjetosDecoradores();
        this.crearJPanel();
        this.crearJButton();
        this.crearJLabel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }
    
    private void crearObjetosDecoradores(){
        iCirculo = new ImageIcon("resources/img/Circulo.png");
        iRectangulo = new ImageIcon("resources/img/Rectangulo.png");
        iSalir = new ImageIcon("resources/img/salir.png");
        iFondo = new ImageIcon("resources/img/fondo1.jpg");
    }
    private void crearJPanel(){
        panel = new JPanel();
        panel.setSize(600,400);
        panel.setLocation(0,0);
        panel.setLayout(null);
        panel.setBackground(new Color(17,17,23));
        panel.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.GRAY));
        this.add(panel);
    }
    
    private void crearJLabel(){
        titulo = new JLabel("SELECCIONE LA FIGURA A CLONAR");
        titulo.setSize(450,100);
        titulo.setLocation(70,50);
        titulo.setForeground(Color.PINK);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font ("Lucida Handwriting", Font.BOLD, 20));
        panel.add(titulo);
        
        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(590, 390, Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setSize(590, 390);
        lFondo.setLocation(5, 5);
        lFondo.setIcon(iDimAux);
        lFondo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lFondo);
    }
    
    private void crearJButton(){
        bCirculo = new JButton();
        bCirculo.setSize(200, 200);
        bCirculo.setLocation(70, 150);
        iDimAux = new ImageIcon(iCirculo.getImage().getScaledInstance(200, 200, Image.SCALE_AREA_AVERAGING));
        bCirculo.setIcon(iDimAux);
        bCirculo.setFocusable(false);
        bCirculo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bCirculo.setBorder(null);
        bCirculo.setContentAreaFilled(false);
        bCirculo.setHorizontalAlignment(SwingConstants.CENTER);
        bCirculo.addActionListener(this.vistacomponent);
        panel.add(bCirculo);

        bRectangulo = new JButton();
        bRectangulo.setSize(250, 250);
        bRectangulo.setLocation(300, 130);
        iDimAux = new ImageIcon(iRectangulo.getImage().getScaledInstance(250, 250, Image.SCALE_AREA_AVERAGING));
        bRectangulo.setIcon(iDimAux);
        bRectangulo.setFocusable(false);
        bRectangulo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bRectangulo.setBorder(null);
        bRectangulo.setContentAreaFilled(false);
        bRectangulo.setHorizontalAlignment(SwingConstants.CENTER);
        bRectangulo.addActionListener(this.vistacomponent);
        panel.add(bRectangulo);

        bSalir = new JButton();
        bSalir.setSize(25, 25);
        bSalir.setLocation(550, 10);
        iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bSalir.setIcon(iDimAux);
        bSalir.setFocusable(false);
        bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalir.setBorder(null);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.addActionListener(this.vistacomponent);
        panel.add(bSalir);
    }
    
    public JButton getbSalir() {
        return bSalir;
    }

    public JButton getbCirculo() {
        return bCirculo;
    }

    public JButton getbRectangulo() {
        return bRectangulo;
    }
}
