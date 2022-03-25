/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author PC
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author PC
 */
public class PrincipalTemplate extends JFrame {

    private JPanel panel;
    private JLabel titulo, lsubTitulo;
    private JButton bSura, bSalud, bSalir;
    private ImageIcon iLogoSura, iLogoSalud, iTitulo, iDimAux, iSalir;    
    private PrincipalComponent vistacomponent;
    
    public PrincipalTemplate(PrincipalComponent vistacomponent){
        this.vistacomponent = vistacomponent;
        
        this.crearObjetosDecoradores();
        this.crearJPanel();
        this.crearJLabel();
        this.crearJButton();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,400);
        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
    }    
    
    private void crearObjetosDecoradores(){
        iLogoSura = new ImageIcon("resources/img/logosura.png");
        iLogoSalud = new ImageIcon("resources/img/logosalud.jpg");
        iTitulo = new ImageIcon("resources/img/logo.png");
        iSalir = new ImageIcon("resources/img/salir.png");
    }
    
    private void crearJPanel(){
        panel = new JPanel();
        panel.setSize(500,400);
        panel.setLocation(0,0);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.GRAY));
        this.add(panel);
    }
    
    private void crearJLabel(){
        iDimAux = new ImageIcon(iTitulo.getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
        titulo = new JLabel();
        titulo.setSize(300,200);
        titulo.setLocation(100,0);
        titulo.setIcon(iDimAux);
        panel.add(titulo);
        
        lsubTitulo = new JLabel("SELECCIONE LA EPS A LA CUAL DESEA AFILIARSE");
        lsubTitulo.setSize(400,30);
        lsubTitulo.setLocation(50,210);
        lsubTitulo.setForeground(Color.BLACK);
        lsubTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lsubTitulo.setFont(new Font ("arial black", Font.PLAIN, 14));
        panel.add(lsubTitulo);
    }
    
    private void crearJButton(){
        bSura = new JButton();
        bSura.setSize(200,110);
        bSura.setLocation(30,250);
        iDimAux = new ImageIcon(iLogoSura.getImage().getScaledInstance(200, 100, Image.SCALE_AREA_AVERAGING));
        bSura.setIcon(iDimAux);
        bSura.setFocusable(false);
        bSura.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSura.setBorder(null);
        bSura.setContentAreaFilled(false);
        bSura.setHorizontalAlignment(SwingConstants.CENTER);
        bSura.addActionListener(this.vistacomponent);
        panel.add(bSura);
        
        bSalud = new JButton();
        bSalud.setSize(200,100);
        bSalud.setLocation(270,260);
        iDimAux = new ImageIcon(iLogoSalud.getImage().getScaledInstance(200, 100, Image.SCALE_AREA_AVERAGING));
        bSalud.setIcon(iDimAux);
        bSalud.setFocusable(false);
        bSalud.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bSalud.setBorder(null);
        bSalud.setContentAreaFilled(false);
        bSalud.setHorizontalAlignment(SwingConstants.CENTER);
        bSalud.addActionListener(this.vistacomponent);
        panel.add(bSalud);
        
        bSalir = new JButton();
        bSalir.setSize(25,25);
        bSalir.setLocation(450,10);
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
    public JButton getbSura(){
        return bSura;
    }
    public JButton getbSalir(){
        return bSalir;
    }
    public JButton getbSalud(){
        return bSalud;
    }
}
