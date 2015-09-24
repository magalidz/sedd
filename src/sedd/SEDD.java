/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sedd;

/**
 *
 * @author polmania
 */
public class SEDD {

  
       static   String cadena[] = new String [100];
       static int fila;
       static int Mensaje,duracion;
       

    public static String getCadena(int I) { return cadena[I]; }

    public static void setCadena(String cadena,int I) {   SEDD.cadena[I] = cadena;  }

    public static int getFila() {   return fila; }

    public static void setFila(int fila) {  SEDD.fila = fila;  }

    public static int getMensaje() {  return Mensaje;}

    public static void setMensaje(int Mensaje) { SEDD.Mensaje = Mensaje;  }

    public static int getDuracion() { return duracion;  }

    public static void setDuracion(int duracion) {   SEDD.duracion = duracion;   }
    
    
    
    public static void main(String[] args) {
        
        
        AnidacionMetodologica();
       
     
     
    //    Presentacion.main(args);
        
        
    
    }
    static void AnidacionMetodologica(){
    
    Vista V=new Vista();
    
     String tabla="carrera";
       
           LogicaS Log=new LogicaS();
       
     //  con.setConection("jdbc:mysql://localhost/aseguradora","root", "anouk666");
       Log.setConection("jdbc:mysql://localhost/sedd", "root","teamo",tabla);
    
    
    
    V.LlamarFrame(1);
    
    
    
    }
}
