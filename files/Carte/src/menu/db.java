
package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class db {
    
    
    public static Connection mycon()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/badge?","root","");
            
        } catch (Exception e) {
            System.out.println("inter.db.connect()");
            JOptionPane.showMessageDialog(null, e);
        }
       return con;
       
    
}    
}
