/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Preguntas {
    
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private int numRespuestas;
    private static int conteo = 0;
    private static int memoria[];
    
    public Preguntas(int numRespuestas){
        
       this.numRespuestas = numRespuestas;
       memoria = new int[numRespuestas];
        
    }
    
    public void setLista(Pregunta[] listaPreguntas){
        
        for(int i=0; i<listaPreguntas.length; i++){
            
            preguntas.add(listaPreguntas[i]);
            
        }
  
    }
    
    public int getNumRespuestas(){
        
        return numRespuestas;
        
    }
    

    
    public Pregunta generarPregunta(){
        
        int numAleatorio = (int)(Math.random()*preguntas.size());

        return preguntas.get(numAleatorio);
        
    }
    
    public class Pregunta{
        
  
        private String pregunta;
        
        private String[] respuestas;
        
        private String respuestaCorrecta;
    
        public Pregunta(String pregunta){
            
            this.pregunta = pregunta;
            
            respuestas = new String[numRespuestas];
            
        }
        
        public String getRespuestaCorrecta(){
            
            return respuestaCorrecta;
            
        }
        
        public void setRespuestaCorrecta(String respuestaCorrecta){
            
            this.respuestaCorrecta = respuestaCorrecta;
            
        }
        
        public String getPregunta(){
            
            return pregunta;
            
        }
        
        public void setRespuesta(int indice, String respuesta){
            
            respuestas[indice] = respuesta;
            
        }
        
        public String generarRespuesta(){
            
            int numAleatorio = (int)(Math.random()*respuestas.length);
           
            
            for(int i=0; i<conteo; i++){
                
                
                if(numAleatorio == memoria[i]){
                    
                    numAleatorio = (int)(Math.random()*respuestas.length);
                    i = -1;
                    
                }
                
            }
            
            memoria[conteo] = numAleatorio;
            conteo++;
            
            if(conteo == respuestas.length) {
                
                conteo = 0;
            
                for(int i=0; i<respuestas.length; i++){

                    memoria[i] = -1;

                }
            }
            
            return respuestas[numAleatorio];
            
        }
        
        
    }

   
    
}
