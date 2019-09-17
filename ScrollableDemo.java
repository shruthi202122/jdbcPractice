import java.sql.*;
import java.sql.ResultSet;
import java.lang.Exception;

public class ScrollableDemo{
    public static void main(String[] arg)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
        Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs=st.executeQuery("select * from employee");
        rs.absolute(5);
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        rs.first();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
       // rs.last();
        //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        rs.relative(2);
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        rs.getRow();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        rs.afterLast();
        rs.previous();
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        con.close();

        

    }
}