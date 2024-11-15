package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Tipo_Accidente;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISTipo_Accidente {
    
    public ArrayList<Tipo_Accidente> getTipo_Accidentes();
    public void addTipoAccidente(Tipo_Accidente tipo_Accidente);
    public void updateTipoAccidente(Tipo_Accidente tipo_Accidente);
    public void deleteTipoAccidente(Tipo_Accidente tipo_Accidente);
    
}
