/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.io.File;
import modelo.Reproductor;
import modelo.Preguntas;

/**
 *
 * @author acer
 */
public class NivelEjemplo extends PanelNivel{
    

    public NivelEjemplo(){
        
        Reproductor.reproducir(new File("recursos\\ost.wav"));
        
        Preguntas listaPreguntas = new Preguntas(3);
        
        Preguntas.Pregunta preguntas[] = new Preguntas.Pregunta[5];
       
        preguntas[0] = listaPreguntas.new Pregunta("2x3");
        
        preguntas[0].setRespuesta(0, "3");
        preguntas[0].setRespuesta(1, "6");
        preguntas[0].setRespuesta(2, "10");

        preguntas[0].setRespuestaCorrecta("6");
        
        preguntas[1] = listaPreguntas.new Pregunta("2x1");
        
        preguntas[1].setRespuesta(0, "2");
        preguntas[1].setRespuesta(1, "4");
        preguntas[1].setRespuesta(2, "10");
        
        preguntas[1].setRespuestaCorrecta("2");
        
        preguntas[2] = listaPreguntas.new Pregunta("2x5");
        
        preguntas[2].setRespuesta(0, "6");
        preguntas[2].setRespuesta(1, "10");
        preguntas[2].setRespuesta(2, "16");
        
        preguntas[2].setRespuestaCorrecta("10");
        
        preguntas[3] = listaPreguntas.new Pregunta("2x2");
        
        preguntas[3].setRespuesta(0, "4");
        preguntas[3].setRespuesta(1, "6");
        preguntas[3].setRespuesta(2, "20");
        
        preguntas[3].setRespuestaCorrecta("4");
        
        preguntas[4] = listaPreguntas.new Pregunta("2x7");
        
        preguntas[4].setRespuesta(0, "12");
        preguntas[4].setRespuesta(1, "2");
        preguntas[4].setRespuesta(2, "14");
        
        preguntas[4].setRespuestaCorrecta("14");
                
        listaPreguntas.setLista(preguntas);
 
        crearCartas(listaPreguntas);
       
        setLayout(new GridLayout(2,2));
        
        
    }
    
}
