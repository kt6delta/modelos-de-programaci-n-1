/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class CuadradoTemplate extends JFrame {

    public PanelFigura p;
    private JLabel lPosx, lPosy, lcolor, lPos, lFondo, titulo;
    private JTextField JTPosx, JTPosy;
    private JComboBox cbColor;
    private JButton bGenerar, bClonar, bSalir, bAtras;
    private ImageIcon iDimAux, iSalir, iFondo;
    private JPanel pDatos, panel, pFigura;
    private String PosX;
    private String PosY;
    private Color color;
    private boolean R;
    private CuadradoComponent vistacomponent;

    public CuadradoTemplate(CuadradoComponent vistacomponent) {
        this.vistacomponent = vistacomponent;
        
        this.crearObjetosDecoradores();
        this.crearJPanel();
        this.crearJButton();
        this.crearJLabel();
        this.crearJTextField();
        this.crearJComboBox();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 400);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public void DibujarPanel(){
        this.add(pFigura);
        p = new PanelFigura(this.PosX, this.PosY, this.color, this.R);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        p.setSize(440, 300);
        p.setLocation(0, 0);
        p.setLayout(null);
        p.setBackground(new Color(17, 17, 23));
        p.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        pFigura.add(p);
        this.add(pFigura);
        this.add(pDatos);
        this.add(panel);
        this.repaint();        
    }
    public void Generar(){
        pFigura.removeAll();
        this.repaint(); 
    }
    private void crearJPanel() {
        pFigura = new JPanel();
        pFigura.setSize(440, 300);
        pFigura.setLocation(350, 50);
        pFigura.setLayout(null);
        pFigura.setBackground(new Color(17, 17, 23));
        pFigura.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        
        pDatos = new JPanel();
        pDatos.setSize(250, 250);
        pDatos.setLocation(70, 100);
        pDatos.setLayout(null);
        pDatos.setBackground(new Color(17, 17, 23));
        pDatos.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        this.add(pDatos);

        panel = new JPanel();
        panel.setSize(800, 400);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        panel.setBackground(new Color(17, 17, 23));
        panel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        this.add(panel);
    }

    private void crearObjetosDecoradores() {
        iSalir = new ImageIcon("resources/img/salir.png");
        iFondo = new ImageIcon("resources/img/fondo.jpg");
    }

    private void crearJLabel() {
        titulo = new JLabel("RECTANGULO");
        titulo.setSize(350, 100);
        titulo.setLocation(20, 10);
        titulo.setForeground(Color.CYAN);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Lucida Handwriting", Font.BOLD, 30));
        panel.add(titulo);

        lPos = new JLabel("Posicion");
        lPos.setSize(100, 30);
        lPos.setLocation(75, 10);
        lPos.setForeground(Color.CYAN);
        lPos.setHorizontalAlignment(SwingConstants.CENTER);
        lPos.setFont(new Font("Elephant", Font.PLAIN, 20));
        pDatos.add(lPos);

        lPosx = new JLabel("X: ");
        lPosx.setSize(25, 25);
        lPosx.setLocation(70, 45);
        lPosx.setForeground(Color.CYAN);
        lPosx.setHorizontalAlignment(SwingConstants.CENTER);
        lPosx.setFont(new Font("Elephant", Font.PLAIN, 14));
        pDatos.add(lPosx);

        lPosy = new JLabel("Y: ");
        lPosy.setSize(25, 25);
        lPosy.setLocation(70, 75);
        lPosy.setForeground(Color.CYAN);
        lPosy.setHorizontalAlignment(SwingConstants.CENTER);
        lPosy.setFont(new Font("Elephant", Font.PLAIN, 14));
        pDatos.add(lPosy);

        lcolor = new JLabel("Color");
        lcolor.setSize(60, 30);
        lcolor.setLocation(100, 110);
        lcolor.setForeground(Color.CYAN);
        lcolor.setHorizontalAlignment(SwingConstants.CENTER);
        lcolor.setFont(new Font("Elephant", Font.PLAIN, 20));
        pDatos.add(lcolor);

        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(790, 390, Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setSize(790, 390);
        lFondo.setLocation(5, 5);
        lFondo.setIcon(iDimAux);
        lFondo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lFondo);
    }

    private void crearJButton() {
        bGenerar = new JButton("Generar");
        bGenerar.setSize(100, 30);
        bGenerar.setLocation(15, 200);
        bGenerar.setFocusable(false);
        bGenerar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bGenerar.setFont(new Font("Elephant", Font.PLAIN, 16));
        bGenerar.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
        bGenerar.setForeground(Color.CYAN);
        bGenerar.setContentAreaFilled(false);
        bGenerar.setHorizontalAlignment(SwingConstants.CENTER);
        bGenerar.addActionListener(this.vistacomponent);
        pDatos.add(bGenerar);

        bClonar = new JButton("Clonar");
        bClonar.setSize(100, 30);
        bClonar.setLocation(135, 200);
        bClonar.setFocusable(false);
        bClonar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bClonar.setFont(new Font("Elephant", Font.PLAIN, 16));
        bClonar.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
        bClonar.setForeground(Color.CYAN);
        bClonar.setContentAreaFilled(false);
        bClonar.setHorizontalAlignment(SwingConstants.CENTER);
        bClonar.addActionListener(this.vistacomponent);
        pDatos.add(bClonar);

        bSalir = new JButton();
        bSalir.setSize(25, 25);
        bSalir.setLocation(760, 10);
        iDimAux = new ImageIcon(iSalir.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        bSalir.setIcon(iDimAux);
        bSalir.setFocusable(false);
        bSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalir.setBorder(null);
        bSalir.setContentAreaFilled(false);
        bSalir.setHorizontalAlignment(SwingConstants.CENTER);
        bSalir.addActionListener(this.vistacomponent);
        panel.add(bSalir);
        
        bAtras = new JButton("Atras");
        bAtras.setSize(200, 30);
        bAtras.setLocation(330, 360);
        bAtras.setFocusable(false);
        bAtras.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bAtras.setFont(new Font("Elephant", Font.PLAIN, 16));
        bAtras.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
        bAtras.setForeground(Color.CYAN);
        bAtras.setContentAreaFilled(false);
        bAtras.setHorizontalAlignment(SwingConstants.CENTER);
        bAtras.addActionListener(this.vistacomponent);
        panel.add(bAtras);
    }

    private void crearJTextField() {
        JTPosx = new JTextField();
        JTPosx.setSize(100, 25);
        JTPosx.setLocation(95, 45);
        JTPosx.setForeground(Color.CYAN);
        JTPosx.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        JTPosx.setBackground(new Color(17, 17, 23));
        JTPosx.setFont(new Font("Elephant", Font.PLAIN, 14));
        JTPosx.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.CYAN));
        JTPosx.setHorizontalAlignment(SwingConstants.CENTER);
        pDatos.add(JTPosx);

        JTPosy = new JTextField();
        JTPosy.setSize(100, 25);
        JTPosy.setLocation(95, 75);
        JTPosy.setForeground(Color.CYAN);
        JTPosy.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        JTPosy.setBackground(new Color(17, 17, 23));
        JTPosy.setFont(new Font("Elephant", Font.PLAIN, 14));
        JTPosy.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.CYAN));
        JTPosy.setHorizontalAlignment(SwingConstants.CENTER);
        pDatos.add(JTPosy);
    }

    private void crearJComboBox() {
        cbColor = new JComboBox();
        cbColor.addItem("Azul");
        cbColor.addItem("Rojo");
        cbColor.addItem("Amarillo");
        cbColor.setFont(new Font("Elephant", Font.PLAIN, 14));
        cbColor.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cbColor.setSize(180, 25);
        cbColor.setLocation(40, 150);
        cbColor.setForeground(Color.CYAN);
        cbColor.setBackground(new Color(17, 17, 23));
        cbColor.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.CYAN));
        ((JLabel) cbColor.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDatos.add(cbColor);
    }

    public JTextField getJTPosx() {
        return JTPosx;
    }

    public JTextField getJTPosy() {
        return JTPosy;
    }

    public JComboBox getCbColor() {
        return cbColor;
    }

    public JButton getbGenerar() {
        return bGenerar;
    }

    public JButton getbClonar() {
        return bClonar;
    }

    public JButton getbSalir() {
        return bSalir;
    }

    public JButton getbAtras() {
        return bAtras;
    }

    public String getPosX() {
        return PosX;
    }

    public String getPosY() {
        return PosY;
    }

    public Color getColor() {
        return color;
    }

    public boolean getBooleanR() {
        return R;
    }

    public void setPosX(String PosX) {
        this.PosX = PosX;
    }

    public void setPosY(String PosY) {
        this.PosY = PosY;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setR(boolean R) {
        this.R = R;
    }

    public PanelFigura getP() {
        return p;
    }
}
