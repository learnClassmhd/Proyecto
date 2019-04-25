/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author acer
 */
public class Reproductor {
    
    private static Clip reproductor;
    
    private static AudioInputStream audio;
    
    public static void reproducir(File archivo){
       
        try {
        
            if(reproductor == null) reproductor = AudioSystem.getClip();
            
            else reproductor.close();
            
            audio = AudioSystem.getAudioInputStream(archivo);
            
            reproductor.open(audio);

            reproductor.start();
            
            
        } catch (LineUnavailableException ex) {
            
            System.out.println("No disponible");
            
        }
        catch (UnsupportedAudioFileException ex) {
            
            System.out.println("Formato no soportado");
            
        }
        catch (IOException ex) {
            
            System.out.println("No se ha encontrado el archivo");
                
        }
        
        
    }
    
}
