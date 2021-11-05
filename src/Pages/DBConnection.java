

package  Pages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author 91936
 */
import java.sql.*;

public class DBConnection {
    private static Connection getConnection(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root");
            conn.setAutoCommit(true);
            return conn;
        }catch(SQLTimeoutException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

   //
}