
import java.sql.Connection;
import java.sql.DriverManager;


public class data {
         public static Connection connct() throws Exception {
           
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","");
             return con;
             
    }
    
}
