/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import java.io.File;
import modelo.Preguntas;
import modelo.Reproductor;

/**
 *
 * @author acer
 */
public class NivelIngles extends PanelNivel{
    
    public NivelIngles(){
        
        Reproductor.reproducir(new File("recursos\\ost.wav"));
        
        Preguntas listaPreguntas = new Preguntas(3);
        
        Preguntas.Pregunta preguntas[] = new Preguntas.Pregunta[4];
       
        preguntas[0] = listaPreguntas.new Pregunta("Run");
        
        preguntas[0].setRespuesta(0, "Caminar");
        preguntas[0].setRespuesta(1, "Nadar");
        preguntas[0].setRespuesta(2, "Correr");

        preguntas[0].setRespuestaCorrecta("Correr");
        
        preguntas[1] = listaPreguntas.new Pregunta("Walk");
        
        preguntas[1].setRespuesta(0, "Trabajar");
        preguntas[1].setRespuesta(1, "Escribir");
        preguntas[1].setRespuesta(2, "Caminar");
        
        preguntas[1].setRespuestaCorrecta("Caminar");
        
        preguntas[2] = listaPreguntas.new Pregunta("Write");
        
        preguntas[2].setRespuesta(0, "Correr");
        preguntas[2].setRespuesta(1, "Dibujar");
        preguntas[2].setRespuesta(2, "Escribir");
        
        preguntas[2].setRespuestaCorrecta("Escribir");
        
        preguntas[3] = listaPreguntas.new Pregunta("Sing");
        
        preguntas[3].setRespuesta(0, "Correr");
        preguntas[3].setRespuesta(1, "Cantar");
        preguntas[3].setRespuesta(2, "Saltar");
        
        preguntas[3].setRespuestaCorrecta("Cantar");
          
        listaPreguntas.setLista(preguntas);
 
        crearCartas(listaPreguntas);
       
        setLayout(new GridLayout(2,2));
        
    }
    
}
