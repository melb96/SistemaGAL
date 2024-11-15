package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISZona_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Zona_Cuerpo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public class ZonaCuerpo_Controller implements ISZona_Cuerpo {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Zona_Cuerpo> getZonaCuerpos() {

        ArrayList<Zona_Cuerpo> zonaCuerposList = new ArrayList<>();

        String queryAccidente = "SELECT * FROM accidente WHERE numero = ?";
        String queryParteCuerpo = "SELECT * FROM parte_cuerpo WHERE codigo = ?";
        String queryZonaCuerpo = "SELECT * FROM zona_cuerpo";

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmtZonaCuerpo = conn.prepareStatement(queryZonaCuerpo);
            ResultSet rsZonaCuerpo = stmtZonaCuerpo.executeQuery();

            while (rsZonaCuerpo.next()) {
                int codigoAccidente = rsZonaCuerpo.getInt("codigo_accidente");
                int codigoParte = rsZonaCuerpo.getInt("codigo_parte");
                String izqDer = rsZonaCuerpo.getString("izq_der");

                // Obtener el objeto Accidente
                Accidente accidente = null;
                try (PreparedStatement stmtAccidente = conn.prepareStatement(queryAccidente)) {
                    stmtAccidente.setInt(1, codigoAccidente);
                    ResultSet rsAccidente = stmtAccidente.executeQuery();
                    if (rsAccidente.next()) {
                        int numero = rsAccidente.getInt("numero");
                        accidente = new Accidente(numero); // Constructor de ejemplo
                    }
                }

                // Obtener el objeto Parte_Cuerpo
                Parte_Cuerpo parteCuerpo = null;
                try (PreparedStatement stmtParteCuerpo = conn.prepareStatement(queryParteCuerpo)) {
                    stmtParteCuerpo.setInt(1, codigoParte);
                    ResultSet rsParteCuerpo = stmtParteCuerpo.executeQuery();
                    if (rsParteCuerpo.next()) {
                        int codigo = rsParteCuerpo.getInt("codigo");
                        String parte = rsParteCuerpo.getString("parte");
                        parteCuerpo = new Parte_Cuerpo(codigo, parte); // Constructor de ejemplo
                    }
                }

                // Crear el objeto Zona_Cuerpo
                Zona_Cuerpo zonaCuerpo = new Zona_Cuerpo(accidente, parteCuerpo, izqDer);
                zonaCuerposList.add(zonaCuerpo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return zonaCuerposList;
    }

    @Override
    public void addZonaCuerpo(Zona_Cuerpo zona_cuerpo) {

        String query = "INSERT INTO zona_cuerpo (codigo_accidente, codigo_parte, izq_der) VALUES (?, ?, ?)";

        try (Connection conn = conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            // Establecer los valores de los parámetros
            stmt.setInt(1, zona_cuerpo.getCodigo_accidente().getNumero());
            stmt.setInt(2, zona_cuerpo.getCodigo_parte().getCodigo());
            stmt.setString(3, zona_cuerpo.isIzq_der());

            // Ejecutar la consulta
            stmt.executeUpdate();

            System.out.println("Zona_Cuerpo agregada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar Zona_Cuerpo: " + e.getMessage());
        }
    }

    @Override
    public void deleteZonaCuerpo(Zona_Cuerpo zona_Cuerpo) {
        
        String query = "DELETE FROM zona_cuerpo WHERE codigo_accidente = ? AND codigo_parte = ?";

        try (Connection conn = conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            // Establecer los valores de los parámetros
            stmt.setInt(1, zona_Cuerpo.getCodigo_accidente().getNumero());
            stmt.setInt(2, zona_Cuerpo.getCodigo_parte().getCodigo());

            // Ejecutar la consulta
            stmt.executeUpdate();

                System.out.println("Zona_Cuerpo eliminada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar Zona_Cuerpo: " + e.getMessage());
        }
    }

    @Override
    public void updateZonaCuerpo(Zona_Cuerpo zona_cuerpo) {
        
                try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("UPDATE zona_cuerpo SET izq_der = ?  WHERE codigo_accidente = ? AND codigo_parte= ? ");

            String izq_der = zona_cuerpo.getIzq_der();
            int codigo_accidente = zona_cuerpo.getCodigo_accidente().getNumero();
            int codigo_parte = zona_cuerpo.getCodigo_parte().getCodigo();

            stmt.setString(1, izq_der);
            stmt.setInt(2, codigo_accidente);
            stmt.setInt(3, codigo_parte);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

}
