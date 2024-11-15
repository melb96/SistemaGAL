package ar.edu.unlar.paradigmas3.sistemagal.conexionBD;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Mateo.Bazan
 */
public class ConnectDB {
    
     //Conexion
    private Connection conexion;
    //Cargamos archivo .env
    Dotenv dotenv = Dotenv.load();
    //Parametros de conexión:
    String url = dotenv.get("URL");
    String user = dotenv.get("POSTGRES_USER");
    String password = dotenv.get("POSTGRES_PASSWORD");
    
    public ConnectDB() {

        try {
            //Inicializamos conexion
            conexion = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null,"Se conectó correctamente a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR"+e.toString());
            e.printStackTrace();
        }

    }

    public Connection getConnection() {

        return conexion;

    }
    
}
