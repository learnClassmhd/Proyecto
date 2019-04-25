/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import vista.PanelNivel;

/**
 *
 * @author acer
 */
public class CartaInicio extends Carta implements ActionListener{
    
    protected static boolean inicio = false;
    protected Preguntas.Pregunta pregunta;
    
    public CartaInicio(Preguntas.Pregunta pregunta){
      
        this.pregunta = pregunta;
        addActionListener(this);
        sprite = new ImageIcon("recursos//carta start.png").getImage();
        setText("Start");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<getParent().getComponentCount(); i++){
                    
            if(getParent().getComponent(i) != this && getParent().getComponent(i) instanceof Carta){
                    
                PanelNivel nivel = (PanelNivel)getParent();
                    
                getParent().add(new CartaRespuesta(nivel.getPreguntas().generarPregunta(),pregunta), i);
                    
                getParent().remove(i+1);

            }
                    
        }
       
        JPanel componentePadre = (JPanel)getParent();
        
        for(int i=0; i<componentePadre.getComponentCount(); i++){
                    
            if(componentePadre.getComponent(i) == this){
                
                componentePadre.add(new CartaPregunta(pregunta.getPregunta()), i);
                componentePadre.remove(i+1);
                
                break;
                        
            }
                    
        }
        
        componentePadre.revalidate();
        componentePadre.repaint();
        
        inicio = true;
                
    }
    
    
}
