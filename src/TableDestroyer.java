    
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class TableDestroyer {
     public static void main(String[] args) throws Exception {
        
       
             //Connection con=(Connection) data.connct()
             Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","");
             
             Statement stmt=con.createStatement();
             String sql="DROP TABLE Test";
             int n=stmt.executeUpdate(sql);
             System.out.println(n);
             con.close();
               
    }
    
}

    

