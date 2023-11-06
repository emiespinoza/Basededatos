
package basededatos;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author HP
 */
public class MSQLconexion {
    
    Connection SQLConexion;
    
    public MSQLconexion (){
        
        //Ruta URL Base de datos
        String host= "Localhost";
        String puerto= "3306";
        String nameDB="proyecto";
        
        //Acceder URL
        
        String usuario="root";
        String pass="";
        
        //Driver
        
        String driver= "Com.mysql.cj.jdbc.Driver";
        
        //Contruir URL
        
        String databaseURL="jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
       
        try{
            Class.forName(driver);
            SQLConexion =DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.print("Base de datos conectada");
            
        }catch(Exception ex) {
            
        }
               
    }
    
    public Connection getConectarDB(){
        return SQLConexion;
    }
}
