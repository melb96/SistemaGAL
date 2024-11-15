package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISMotivo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Motivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public class Motivo_Controller implements ISMotivo {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Motivo> getMotivos() {

        ArrayList<Motivo> motivosList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM motivo");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("codigo");
                String motivo = rs.getString("motivo");

                Motivo motivo1 = new Motivo(codigo, motivo);

                motivosList.add(motivo1);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return motivosList;
    }

    @Override
    public void addMotivo(Motivo motivo) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO motivo (motivo, codigo) VALUES (?,?)");

            String motivo1 = motivo.getMotivo();
            int codigo = motivo.getCodigo();

            stmt.setString(1, motivo1);
            stmt.setInt(2, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateMotivo(Motivo motivo) {
        
        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("UPDATE motivo SET  motivo = ?  WHERE codigo = ? ");

            String motivo1 = motivo.getMotivo();
            int codigo = motivo.getCodigo();
            
            stmt.setString(1, motivo1);
            stmt.setInt(2, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    @Override
    public void deleteMotivo(Motivo motivo) {
        
            try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM motivo WHERE codigo = ?");

            int codigo = motivo.getCodigo();

            stmt.setInt(1, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
    
    public Motivo getMotivoPorCodigo(int codigo) {
    Motivo motivo = null;
    try (Connection conn = conexion.getConnection()) {
        String sql = "SELECT motivo, codigo FROM motivo WHERE codigo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, codigo);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String motivoString = rs.getString("motivo");
            motivo = new Motivo(codigo, motivoString);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return motivo;
}


}
