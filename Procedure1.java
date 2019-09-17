import java.sql.CallableStatement;
import java.sql.*;
import java.lang.Exception;

public class Procedure1{
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
        CallableStatement cs=con.prepareCall("{call operations1(?,?,?,?,?,?)}");
        cs.setInt(1,5);
        cs.setInt(2,5);
        cs.registerOutParameter(3,Types.NUMERIC);
        cs.registerOutParameter(4,Types.NUMERIC);
        cs.registerOutParameter(5,Types.NUMERIC);
        cs.registerOutParameter(6,Types.NUMERIC);
        cs.execute();
        System.out.println("a+b :="+cs.getInt(3));
        System.out.println("a*b :="+cs.getInt(4));
        System.out.println("a-b :="+cs.getInt(5));
        System.out.println("a/b :="+cs.getInt(6));
        con.close();
    }
 }