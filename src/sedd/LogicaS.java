
package sedd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class LogicaS {
    //variables de coneccion
     private String contrasena;
    private String ubicacion;
    private Connection conexion;
    
    //variables de control
   
    static String carrera;
    static String materia;
    static String anio;
    static int duracion;
    
    
    static int interruptor=1;
    static String instruccion;
    static int columna;
    
    static int sumador=0;
    
    Statement st;
    ResultSet rs;
    ResultSetMetaData rsmd;
    
    
    
      public void setConection(String ruta,String usuario,String pass,String tabla){
        
  //        Condicional(tabla);
          
        int O=0,sumador=0;  String aux;
        
        
        try{       
            Class.forName("com.mysql.jdbc.Driver");
           conexion=DriverManager.getConnection(ruta , usuario, pass);
           
            System.out.println("conectado");
            st = conexion.createStatement();
      //ACA DEBERIA PONER UN METODO QUE LLAME A DETERMINADAS INSTRUCCIONES DE QUERY
            
            
            SelectQuery(tabla);
            
        rs=st.executeQuery(getInstruccion());
      //      rs = st.executeQuery("select * from "+tabla);
 while(rs.next()){      
               //CARGAR CONTENIDO DE LA BD EN UN ATRIBUTO VECTOR 
     
         //   aux= rs.getString(2);
            aux= rs.getString(getColumna());
 //    System.out.println("sumador"+getSumador());
     System.out.println("hay"+aux);
            
            SEDD.setCadena(aux,getSumador());
              setSumador(getSumador()+1);
                
                //SABER LA CANTIDAD DE FILAS QUE TIENE LA TABLA
                SEDD.setFila(rs.getRow());
    //            System.out.println("filas"+rs.getRow());
           }//fin while
        }//fin try
        catch(Exception ex){
            
            System.out.println(ex);
            
            
            
        }//fin catch
    
}
      
   /*   static void Condicional(String tabla){
          
          if ("carrera".equals(tabla)) {setInterruptor(0);   }
          if ("anio".equals(tabla)) {setInterruptor(1);   }
          if ("materia".equals(tabla)) {setInterruptor(2);   }
          if ("profesor".equals(tabla)) {setInterruptor(3);   }
           }*/

    public static String getCarrera() {  return carrera;}

    public static void setCarrera(String carrera) {  LogicaS.carrera = carrera;  }

    public static int getInterruptor() { return interruptor; }

    public static void setInterruptor(int interruptor) {  LogicaS.interruptor = interruptor; }

    public static int getSumador() {
        return sumador; }

    public static void setSumador(int sumador) { LogicaS.sumador = sumador;}

    public static String getInstruccion() {return instruccion;}

    public static void setInstruccion(String instruccion) {LogicaS.instruccion = instruccion;}

    public static int getColumna() {return columna;}

    public static void setColumna(int columna) {LogicaS.columna = columna;}

    public static String getMateria() {return materia;}

    public static void setMateria(String materia) {LogicaS.materia = materia;}

    public static String getAnio() {return anio;}

    public static void setAnio(String anio) {LogicaS.anio = anio;}

    public static int getDuracion() {return duracion;}

    public static void setDuracion(int duracion) {LogicaS.duracion = duracion;}
    
    

  public void SelectQuery(String tabla){
  
  switch(getInterruptor()){
  
      case 1: setInstruccion("select * from "+tabla);setColumna(2);break;
      case 2: setInstruccion("select * from "+tabla+" where CarrNom = "+"'"+getCarrera()+"'"+";");
      setColumna(3);break;
      case 3: setInstruccion("select * from "+tabla);setColumna(2); break;
  
  }
  
  
  }
      
      
      
      
    
}
