import java.sql.*;

public class LoginDao {
    public static boolean checkUser(String email,String password) 
    {
        boolean st =false;
        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/furniture","ssk","ssk");
            PreparedStatement ps = con.prepareStatement("select * from login where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}