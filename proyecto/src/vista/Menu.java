/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Reproductor;

/**
 *
 * @author acer
 */
public class Menu extends JPanel implements KeyListener{
    
    private Image fondo = new ImageIcon("recursos\\fondo.jpg").getImage();;
    
    public Menu(){
        
        //Reproductor.reproducir(new File("C:\\Users\\acer\\Desktop\\Koibumi.wav"));
        setFocusable(true);
        addKeyListener(this);
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.drawImage(fondo,  0, 0, getWidth(), getHeight(), this);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
        
            JFrame ventana = (JFrame)(getParent().getParent().getParent().getParent());

            ventana.remove(this);
            ventana.add(new NivelIngles());

            ventana.validate();
            ventana.repaint();
        
        }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {

        
    }
    
}
