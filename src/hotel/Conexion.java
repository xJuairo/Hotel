package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection connect = null;
        public Connection conexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        return connect;
        }

}
