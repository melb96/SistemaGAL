package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISTipo_Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public class Tipo_Accidente_Controller implements ISTipo_Accidente {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Tipo_Accidente> getTipo_Accidentes() {

        ArrayList<Tipo_Accidente> tipoAccidentesList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tipo_accidente");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("codigo");
                String tipo = rs.getString("tipo");

                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigo, tipo);

                tipoAccidentesList.add(tipo_Accidente);
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return tipoAccidentesList;

    }

    @Override
    public void addTipoAccidente(Tipo_Accidente tipo_Accidente) {
        
        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tipo_accidente (codigo, tipo) VALUES (?,?)");

            int codigo = tipo_Accidente.getCodigo();
            String tipo = tipo_Accidente.getTipo();

            stmt.setInt(1, codigo);
            stmt.setString(2, tipo);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateTipoAccidente(Tipo_Accidente tipo_Accidente) {
        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("UPDATE tipo_accidente SET  tipo = ?  WHERE codigo = ? ");

            int codigo = tipo_Accidente.getCodigo();
            String tipo = tipo_Accidente.getTipo();

            stmt.setString(1, tipo);
            stmt.setInt(2, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    @Override
    public void deleteTipoAccidente(Tipo_Accidente tipo_Accidente) {
        
            try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM tipo_accidente WHERE codigo = ?");

            int codigo = tipo_Accidente.getCodigo();

            stmt.setInt(1, codigo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
    
    public Tipo_Accidente getTipoAccidentePorCodigo(int codigo) {
    Tipo_Accidente tipo_Accidente = null;
    try (Connection conn = conexion.getConnection()) {
        String sql = "SELECT codigo, tipo FROM tipo_accidente WHERE codigo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, codigo);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String tipoAccString = rs.getString("tipo");
            tipo_Accidente = new Tipo_Accidente(codigo, tipoAccString);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return tipo_Accidente;
}


}
