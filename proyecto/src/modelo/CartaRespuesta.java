/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class CartaRespuesta extends CartaInicio{
    
    private Preguntas.Pregunta pregunta;
    
    private boolean respuestaCorrecta = false;
    
    public CartaRespuesta(Preguntas.Pregunta pregunta, Preguntas.Pregunta preguntaResponder){
        
        super(pregunta);
        this.pregunta = pregunta;
        sprite = new ImageIcon("recursos//carta matematicas.png").getImage();
        
        setText(preguntaResponder.generarRespuesta());
        
        if(getText().equals(preguntaResponder.getRespuestaCorrecta())) respuestaCorrecta = true;
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        if(respuestaCorrecta) JOptionPane.showMessageDialog(getParent(), "Correcto");
        else JOptionPane.showMessageDialog(getParent(), "Incorrecto");
        
        if(inicio){
            
            super.actionPerformed(e);
            
        }
                
    }
    
}
