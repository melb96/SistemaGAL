package ar.edu.unlar.paradigmas3.sistemagal.grillas;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Mateo.Bazan
 */
public class AccidenteGrilla extends AbstractTableModel{

    private static final String columnaNombre[] = {"Numero", "Fecha", "Ubicacion","LegajoEmpleado","CodigoMotivo","CodigoTipoAccidente","ZonaCuerpo",
    "ParteCuerpo"};
    ArrayList<Accidente> accidentes= new ArrayList<>();

    public AccidenteGrilla() {
    }

    public AccidenteGrilla(ArrayList<Accidente> accidentes ) {

        this.accidentes = accidentes;

    }

    @Override
    public int getRowCount() {
        return accidentes.size();
    }

    @Override
    public int getColumnCount() {
        return columnaNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Accidente a = accidentes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getNumero();
            case 1:
                return a.getFecha();
            case 2:
                return a.getUbicacion();
            case 3:
                return a.getLegajoEmpleado();
            case 4:
                return a.getCodigoMotivo();
            case 5:
                return a.getCodigoTipoAccidente();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {

        return columnaNombre[column];

    }
    
}
