/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.sql.Connection;
import java.sql.DriverManager;



 

public class ConnectionClient {
    
    Connection con ;
    java.util.Date fdate,edate,gdate;
    java.sql.Date myfabdate,myexpdate;
    
    public  ConnectionClient (){
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/badge?","root","");
                 System.out.println("connexion etablie");
                 
        } catch ( Exception e) {
            
             System.out.println("erreur de connexion");
            e.printStackTrace();
        }


    
}
    
public  Connection maConnection(){


    
return con;



}
}


