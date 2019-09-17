import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*; 
import java.lang.Exception;

 
public class Demo{
    public static void main(String[] arg){
        Connection con=null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","shruthi","abc@2");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select marks,name from student where marks>=5");
             while(rs.next()){
                System.out.println(rs.getxxx(1)+" "+rs.getxxx(2));
             }
     
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(con!=null){ 
                try{
                con.close();
                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            }
        }
    }
}   