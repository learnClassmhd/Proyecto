/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import javax.swing.ImageIcon;

/**
 *
 * @author acer
 */
public class CartaPregunta extends Carta {
    
    public CartaPregunta(String pregunta){

        sprite = new ImageIcon("recursos//carta matematicas.png").getImage();
        setText(pregunta);
        
    }
    
}
