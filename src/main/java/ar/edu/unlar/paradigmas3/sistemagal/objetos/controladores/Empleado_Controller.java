package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISEmpleado;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public class Empleado_Controller implements ISEmpleado {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Empleado> getEmpleados() {

        ArrayList<Empleado> empleadosList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM empleado");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int legajo = rs.getInt("legajo");
                String apellido_nombre = rs.getString("apellido_nombre");

                Empleado empleado = new Empleado(legajo, apellido_nombre);

                empleadosList.add(empleado);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return empleadosList;
    }

    @Override
    public void addEmpleado(Empleado empleado) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO empleado (legajo, apellido_nombre) VALUES (?,?)");

            int legajo = empleado.getLegajo();
            String apellido_nombre = empleado.getApellido_nombre();

            stmt.setInt(1, legajo);
            stmt.setString(2, apellido_nombre);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateEmpleado(Empleado empleado) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("UPDATE empleado SET apellido_nombre = ? WHERE legajo = ? ");

            int legajo = empleado.getLegajo();
            String apellido_nombre = empleado.getApellido_nombre();

            stmt.setString(1, apellido_nombre);
            stmt.setInt(2, legajo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    @Override
    public void deleteEmpleado(Empleado empleado) {

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM empleado WHERE legajo = ?");

            int legajo = empleado.getLegajo();

            stmt.setInt(1, legajo);
            stmt.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public Empleado getEmpleadoPorLegajo(int legajo) {
    Empleado empleado = null;
    try (Connection conn = conexion.getConnection()) {
        String sql = "SELECT legajo, apellido_nombre FROM empleado WHERE legajo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, legajo);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            String nombre = rs.getString("apellido_nombre");
            empleado = new Empleado(legajo, nombre);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return empleado;
}


}
