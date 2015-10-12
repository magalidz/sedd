/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sedd;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Vista extends Frame {
    private String[] args;
    
   public void LlamarFrame(int intframe){
   
       switch(intframe){
       
           case 1: Presentacion.main(args);break;
           case 2: Confirmacion.main(args);break;
           case 3: Encuesta.main(args);break; }
   }
     static void MostrarMensaje(int M){
         String mensaje="";
   switch (M){
   
       case 1:mensaje="Bienvenido al Sistema de Evaluacion de Desempeño Doscente";break;
       case 2: mensaje="Queda/n campo/s sin seleccionar";break;
   
   }
   
   JOptionPane.showMessageDialog(null, mensaje);
   
   
   }
    
    
    
    
    
}
