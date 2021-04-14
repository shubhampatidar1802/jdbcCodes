
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class MenualDataEntry {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Emp id       :  ");
        int eno=sc.nextInt();
        System.out.println("Emp Name     :  ");
        String name=sc.next();
        System.out.println("Emp Salary   :  ");
        int sal=sc.nextInt();
        
        
        
        String sql="INSERT INTO student VALUES(?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","");
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        
        ps.setInt(1,eno);
        ps.setString(2,name);
        ps.setInt(3,sal);
        int n=ps.executeUpdate();
        System.out.println(n+" ROW ADDED");
        con.close();
        
    }

    