import java.sql.*;

public class PreparedStatementDemo{
    public static void main(String[] ar){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
            PreparedStatement pst=con.prepareStatement("select name sname from student where marks>=?");
            pst.setInt(1,60);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("sname"));
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        } 

    }
}