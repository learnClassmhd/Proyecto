/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author acer
 */
public class Carta extends JButton implements ComponentListener{
    
    protected Image sprite;
    
    public Carta(){
        
        this.addComponentListener(this);
        sprite = new ImageIcon("recursos//carta matematicas.png").getImage();
        setFont(new Font("Arial", Font.BOLD, 80));
        setForeground(Color.WHITE);
      
    }
    
    @Override
    public void componentResized(ComponentEvent e) {
   
        setIcon(new ImageIcon(sprite.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH)));
        setHorizontalTextPosition(CENTER);
        setVerticalTextPosition(CENTER);
        
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
        
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
        
        
        
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        
        
        
    }
    
}
