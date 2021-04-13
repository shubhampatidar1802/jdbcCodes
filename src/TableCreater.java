import java.sql.Connection;
import java.sql.Statement;

public class TableCreater {
    public static void main(String[] args) {
        Connection con=Data.connct;
        Statement stmt=con.createStatement();
        String sql="CREATE TABLE test(col1 char,col2 char )";
        int n=stmt.executeUpdate("DROP TABLE student");
        System.out.println(n);    
        System.out.println("Table Created");        
        con.close();        
        
    }
    
}
