package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Zona_Cuerpo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ZonaCuerpoGrilla extends AbstractTableModel {

    private static final String columnaNombre[] = {"Codigo Accidente","Codigo Parte","Zonas Cuerpo"};
    ArrayList<Zona_Cuerpo> zonasCuerpo = new ArrayList<>();

    public ZonaCuerpoGrilla() {
    }

    public ZonaCuerpoGrilla(ArrayList<Zona_Cuerpo> zonasCuerpo) {
        this.zonasCuerpo = zonasCuerpo;
    }

    @Override
    public int getRowCount() {
        return zonasCuerpo.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zona_Cuerpo zc = zonasCuerpo.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return zc.isIzq_der();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnaNombre[column];
    }
}