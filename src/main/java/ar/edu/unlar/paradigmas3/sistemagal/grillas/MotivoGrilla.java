package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Motivo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Mateo.Bazan
 */
public class MotivoGrilla extends AbstractTableModel {

    private static final String columnaNombre[] = {"Codigo", "Motivo"};
    ArrayList<Motivo> motivos = new ArrayList<>();

    public MotivoGrilla() {
    }

    public MotivoGrilla(ArrayList<Motivo> motivos) {

        this.motivos = motivos;

    }

    @Override
    public int getRowCount() {
        return motivos.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motivo m = motivos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getCodigo();
            case 1:
                return m.getMotivo();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {

        return columnaNombre[column];

    }

}
