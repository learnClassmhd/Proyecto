/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author acer
 */
public class Ventana extends JFrame{
    

    
   public Ventana(){
       
       setTitle("Juego");
       setSize(1000, 700);
       setLocationRelativeTo(null);
       
       add(new Menu());
       
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }

    
}
