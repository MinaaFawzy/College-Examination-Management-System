
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fady_
 */
public class ConnectDb {
        private static  Connection connectToServer;
    
    public  ConnectDb() {
        try {
            String url = "jdbc:mysql://localhost:3306/college";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = "root";
            String password = "";
            connectToServer = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println(exception);
        }
    }
    
    public static Connection getConnection(){
        return connectToServer;
    }
}
