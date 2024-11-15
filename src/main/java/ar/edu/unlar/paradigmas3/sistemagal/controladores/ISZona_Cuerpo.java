package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Zona_Cuerpo;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISZona_Cuerpo {
    
    public ArrayList<Zona_Cuerpo> getZonaCuerpos();
    public void addZonaCuerpo(Zona_Cuerpo zona_cuerpo);
    public void updateZonaCuerpo(Zona_Cuerpo zona_cuerpo);
    public void deleteZonaCuerpo(Zona_Cuerpo zona_Cuerpo);
    
}
