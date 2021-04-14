
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataEntry {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","");
            System.out.println("Connected Succefully");
            
           String sql="INSERT INTO student VALUES(112,'SHUBHAM',100000);";
            
           Statement stmt = con.createStatement();
           
           int n=stmt.executeUpdate(sql);
           
           con.close();
           
            System.out.println(n+" Row ADDED");
            
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
//            System.out.println("Driver Not Loaded");
           
    } catch (SQLException ex) {
           ex.printStackTrace();

           
    }
    
    
}
