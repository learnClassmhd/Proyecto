/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import javax.swing.JPanel;
import modelo.Carta;
import modelo.CartaInicio;
import modelo.Preguntas;

/**
 *
 * @author acer
 */
public abstract class PanelNivel extends JPanel{
    
   private Preguntas preguntas;
   
   
   public Preguntas getPreguntas(){
       
       return preguntas;
       
   }
   
   public void crearCartas(Preguntas preguntas){
       
       this.preguntas = preguntas;
       
       add(new CartaInicio(preguntas.generarPregunta()));
       
       for(int i=0; i<preguntas.getNumRespuestas(); i++){
           
           add(new Carta());
           
       }
       
   }
    
}
