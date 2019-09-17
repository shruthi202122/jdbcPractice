import java.sql.*;

public class PreparedSt1{
    public static void main(String[] arg){
        try{
            Class.forName("com.mysql.jdbc.Driver" );
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
            ps.setInt(1,9);
            ps.setString(2,"I");
            ps.setInt(3,76);
            ps.executeUpdate();
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
       

    }
}