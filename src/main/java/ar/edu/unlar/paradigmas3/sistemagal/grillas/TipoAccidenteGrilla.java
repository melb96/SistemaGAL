package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Mateo.Bazan
 */
public class TipoAccidenteGrilla extends AbstractTableModel {

    private static final String columnaNombre[] = {"Codigo", "Tipo"};
    ArrayList<Tipo_Accidente> tiposAccidente = new ArrayList<>();

    public TipoAccidenteGrilla() {
    }

    public TipoAccidenteGrilla(ArrayList<Tipo_Accidente> tiposAccidentes ) {

        this.tiposAccidente = tiposAccidentes;

    }

    @Override
    public int getRowCount() {
        return tiposAccidente.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tipo_Accidente ta = tiposAccidente.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ta.getCodigo();
            case 1:
                return ta.getTipo();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {

        return columnaNombre[column];

    }

}
