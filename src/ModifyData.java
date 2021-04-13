
import java.sql.*;


public class ModifyData {
    public static void main(String[] args) throws Exception {
       // Connection con=(Connection) data.connct();
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","");
        String sql="UPDATE student SET sal=sal+101";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        con.close();
    }
    
}
