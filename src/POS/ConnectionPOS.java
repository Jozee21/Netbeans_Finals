package POS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose Tapic
 */
public class ConnectionPOS {
    public static Connection mycon(){
    Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/grubbitespossys", "root","");
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(POSAdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(POSAdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }
}
