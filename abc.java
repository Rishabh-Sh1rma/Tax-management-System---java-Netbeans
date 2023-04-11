package team;
import java.sql.*;

public class abc {
    public static void main(String [] args){
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/just", "root", "root");
            
            if(con!=null){
                System.out.println("database connected");
            }
        }
        catch (Exception e){
            System.out.println("not connected");
        }
    } 
}
