package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISParte_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public class ParteCuerpo_Controller implements ISParte_Cuerpo {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Parte_Cuerpo> getParteCuerpos() {

        ArrayList<Parte_Cuerpo> parteCuerposList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM parte_cuerpo");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("codigo");
                String parte = rs.getString("parte");

                Parte_Cuerpo parte_Cuerpo = new Parte_Cuerpo(codigo, parte);

                parteCuerposList.add(parte_Cuerpo);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return parteCuerposList;
    }

    @Override
    public void addParteCuerpo(Parte_Cuerpo parte_cuerpo) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO parte_cuerpo (codigo, parte) VALUES (?,?)");

            int codigo = parte_cuerpo.getCodigo();
            String parte = parte_cuerpo.getParte();

            stmt.setInt(1, codigo);
            stmt.setString(2, parte);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateParteCuerpo(Parte_Cuerpo parte_cuerpo) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("UPDATE parte_cuerpo SET  parte = ?  WHERE codigo = ? ");

            String parte = parte_cuerpo.getParte();
            int codigo = parte_cuerpo.getCodigo();

            stmt.setString(1, parte);
            stmt.setInt(2, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    @Override
    public void deleteParteCuerpo(Parte_Cuerpo parte_Cuerpo) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM parte_cuerpo WHERE codigo = ?");

            int codigo = parte_Cuerpo.getCodigo();

            stmt.setInt(1, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}
