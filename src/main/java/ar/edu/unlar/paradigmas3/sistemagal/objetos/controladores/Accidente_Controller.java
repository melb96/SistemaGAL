package ar.edu.unlar.paradigmas3.sistemagal.objetos.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.conexionBD.ConnectDB;
import ar.edu.unlar.paradigmas3.sistemagal.controladores.ISAccidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Empleado;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Motivo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import ar.edu.unlar.paradigmas3.sistemagal.objetos.Zona_Cuerpo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mateo.Bazan
 */
public class Accidente_Controller implements ISAccidente {

    //Creamos instancia de clase ConnectDB para establecer la conexión
    ConnectDB conexion = new ConnectDB();

    @Override
    public ArrayList<Accidente> getAccidentes() {
        ArrayList<Accidente> accidentesList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT a.numero, a.fecha_accidente, a.ubicacion, "
                    + "e.legajo AS legajoempleado, e.apellido_nombre AS empleado, "
                    + "m.codigo AS codigomotivo, m.motivo AS descripcion_motivo, "
                    + "t.codigo AS codigo_tipo_accidente, t.tipo AS descripcion_tipo, "
                    + "zn.izq_der AS zona_cuerpo, "
                    //+ "pc.codigo AS parte_cuerpo "
                    + "pc.parte AS parte_cuerpo "
                    + "FROM accidente a "
                    + "INNER JOIN empleado e ON a.legajoempleado = e.legajo "
                    + "INNER JOIN motivo m ON a.codigomotivo = m.codigo "
                    + "INNER JOIN tipo_accidente t ON a.codigotipo_accidente = t.codigo "
                    + "INNER JOIN zona_cuerpo zn ON a.numero = zn.codigo_accidente "
                    + "INNER JOIN parte_cuerpo pc ON zn.codigo_parte = pc.codigo;"
            );

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int numero = rs.getInt("numero");
                Date fecha_accidente = rs.getDate("fecha_accidente");
                String ubicacion = rs.getString("ubicacion");

                // Crear el objeto Empleado
                int legajo_empleado = rs.getInt("legajoempleado");
                String apellidoNombre = rs.getString("empleado");
                Empleado empleado = new Empleado(legajo_empleado, apellidoNombre);

                // Tipo de accidente
                int codigo_tipo_accidente = rs.getInt("codigo_tipo_accidente");
                String tipo_accidente = rs.getString("descripcion_tipo");
                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigo_tipo_accidente, tipo_accidente);

                // Motivo
                int codigo_motivo = rs.getInt("codigomotivo");
                String motivoString = rs.getString("descripcion_motivo");
                Motivo motivo = new Motivo(codigo_motivo, motivoString);

                //Zona cuerpo
                String zona_Cuerpo = rs.getString("zona_cuerpo");
                Zona_Cuerpo zonaCuerpo = new Zona_Cuerpo(zona_Cuerpo);

                //Parte cuerpo
                String parte_Cuerpo = rs.getString("parte_cuerpo");
                Parte_Cuerpo parteCuerpo = new Parte_Cuerpo(parte_Cuerpo);


                // Crear el objeto Accidente
                Accidente accidente = new Accidente(numero, fecha_accidente, ubicacion, empleado, motivo, tipo_Accidente, zonaCuerpo, parteCuerpo);

                // Agregar el accidente a la lista
                accidentesList.add(accidente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accidentesList;
    }

    public ArrayList<Accidente> getAccidentesPreZona() {
        ArrayList<Accidente> accidentesList = new ArrayList<>();

        try (Connection conn = conexion.getConnection()) {

            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT a.numero, a.fecha_accidente, a.ubicacion, "
                    + "e.legajo AS legajoempleado, e.apellido_nombre AS empleado, "
                    + "m.codigo AS codigomotivo, m.motivo AS descripcion_motivo, "
                    + "t.codigo AS codigo_tipo_accidente, t.tipo AS descripcion_tipo "
                    + "FROM accidente a "
                    + "INNER JOIN empleado e ON a.legajoempleado = e.legajo "
                    + "INNER JOIN motivo m ON a.codigomotivo = m.codigo "
                    + "INNER JOIN tipo_accidente t ON a.codigotipo_accidente = t.codigo;"
            );

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int numero = rs.getInt("numero");
                Date fecha_accidente = rs.getDate("fecha_accidente");
                String ubicacion = rs.getString("ubicacion");

                // Crear el objeto Empleado
                int legajo_empleado = rs.getInt("legajoempleado");
                String apellidoNombre = rs.getString("empleado");
                Empleado empleado = new Empleado(legajo_empleado, apellidoNombre);

                // Tipo de accidente
                int codigo_tipo_accidente = rs.getInt("codigo_tipo_accidente");
                String tipo_accidente = rs.getString("descripcion_tipo");
                Tipo_Accidente tipo_Accidente = new Tipo_Accidente(codigo_tipo_accidente, tipo_accidente);

                // Motivo
                int codigo_motivo = rs.getInt("codigomotivo");
                String motivoString = rs.getString("descripcion_motivo");
                Motivo motivo = new Motivo(codigo_motivo, motivoString);

                // Crear el objeto Accidente
                Accidente accidente = new Accidente(numero, fecha_accidente, ubicacion, empleado, motivo, tipo_Accidente);

                // Agregar el accidente a la lista
                accidentesList.add(accidente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accidentesList;
    }

    @Override
    public void addAccidente(Accidente accidente) {

        try (Connection conn = conexion.getConnection()) {

            //Querys
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO accidente (numero, fecha_accidente, ubicacion, legajoempleado, codigomotivo, codigotipo_accidente) VALUES (?,?,?,?,?,?)");

            Empleado empleado = accidente.getLegajoEmpleado(); // Obtener el objeto completo
            Tipo_Accidente tipo_Accidente = accidente.getCodigoTipoAccidente(); // Obtener el objeto completo
            Motivo motivo = accidente.getCodigoMotivo(); // Obtener el objeto completo

            int numero = accidente.getNumero();
            java.util.Date fechaUtil = accidente.getFecha();
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime()); // Conversión a java.sql.Date
            String ubicacion = accidente.getUbicacion();

            stmt.setInt(1, numero);
            stmt.setDate(2, (fechaSql));
            stmt.setString(3, ubicacion);
            stmt.setInt(4, empleado.getLegajo());
            stmt.setInt(5, motivo.getCodigo());
            stmt.setInt(6, tipo_Accidente.getCodigo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateAccidente(Accidente accidente) {
        try (Connection conn = conexion.getConnection()) {
            String sql = "UPDATE accidente SET ubicacion = ?, fecha_accidente = ?, legajoempleado = ?, "
                    + "codigomotivo = ?, codigotipo_accidente = ? WHERE numero = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Establecer los parámetros
            stmt.setString(1, accidente.getUbicacion());
            stmt.setDate(2, new java.sql.Date(accidente.getFecha().getTime())); // Conversión segura
            stmt.setInt(3, accidente.getLegajoEmpleado().getLegajo());
            stmt.setInt(4, accidente.getCodigoMotivo().getCodigo());
            stmt.setInt(5, accidente.getCodigoTipoAccidente().getCodigo());
            stmt.setInt(6, accidente.getNumero());

            // Ejecutar actualización
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al actualizar accidente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAccidente(int numero) {

        try (Connection conn = conexion.getConnection()) {
            String sql = "DELETE FROM accidente WHERE numero = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, numero);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Accidente eliminado correctamente.");
            } else {
                System.out.println("No se encontró un accidente con ese número.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
