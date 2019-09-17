import java.sql.*;
import java.lang.Exception;

public class UpdatableDemo{
    public static void main(String[] ar)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
        Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select eno,ename,salary from employee");
       // rs.absolute(8);
       // rs.deleteRow();
       // System.out.println("row deleted");
       rs.moveToInsertRow();
       rs.updateInt(1,8);
       rs.updateString(2,"YYY");
       rs.updateInt(3,20500);
       rs.insertRow();
       System.out.println("row inserted");
       
       rs.absolute(8);
       rs.updateString(2,"RSS"); 
       rs.updateRow();
       System.out.println("row Updated");
       
        
    }
}