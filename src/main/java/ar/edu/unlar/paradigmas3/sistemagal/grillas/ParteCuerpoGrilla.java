package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Mateo.Bazan
 */
public class ParteCuerpoGrilla extends AbstractTableModel{

    private static final String columnaNombre[] = {"Codigo", "Parte"};
    ArrayList<Parte_Cuerpo> partesCuerpo = new ArrayList<>();

    public ParteCuerpoGrilla() {
    }

    public ParteCuerpoGrilla(ArrayList<Parte_Cuerpo> partesCuerpo) {

        this.partesCuerpo = partesCuerpo;

    }

    @Override
    public int getRowCount() {
        return partesCuerpo.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Parte_Cuerpo p = partesCuerpo.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getCodigo();
            case 1:
                return p.getParte();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {

        return columnaNombre[column];

    }
}
