package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Empleado;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Mateo.Bazan
 */
public class EmpleadoGrilla extends AbstractTableModel {

    private static final String columnaNombre[] = {"Legajo", "Apellidos y Nombres"};
    ArrayList<Empleado> empleados = new ArrayList<>();

    public EmpleadoGrilla() {
    }

    public EmpleadoGrilla(ArrayList<Empleado> empleados) {

        this.empleados = empleados;

    }

    @Override
    public int getRowCount() {
        return empleados.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado e = empleados.get(rowIndex);
        switch (columnIndex) {
            case 0: return e.getLegajo();
            case 1: return e.getApellido_nombre();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column){
        
        return columnaNombre[column];
        
    }
    
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
        fireTableDataChanged(); // Notifica a la tabla que los datos han cambiado
    }
    
        // Agrega el método para establecer el número de filas en la tabla
    public void setRowCount(int rowCount) {
        if (rowCount < empleados.size()) {
            empleados.subList(rowCount, empleados.size()).clear(); // Elimina filas extras si rowCount es menor
        } else {
            for (int i = empleados.size(); i < rowCount; i++) {
                empleados.add(new Empleado()); // Agrega instancias vacías si rowCount es mayor
            }
        }
        fireTableDataChanged(); // Actualiza la vista de la tabla
    }

}
