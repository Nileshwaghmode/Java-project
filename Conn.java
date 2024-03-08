
package tourism.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourismmanagementsystem","root","rohitK2906*");
            s=c.createStatement();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
