import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.lang.Exception;

public class BatchEx{
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
        ps.setInt(1,6);
        ps.setString(2,"Suma1");
        ps.setInt(3,30000);
        ps.addBatch();
        ps.setInt(1,7);
        ps.setString(2,"DEF");
        ps.setInt(3,2100);
        ps.addBatch();
        ps.executeBatch();    
    }
}