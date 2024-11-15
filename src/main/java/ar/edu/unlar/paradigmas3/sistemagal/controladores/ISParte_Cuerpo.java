package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Parte_Cuerpo;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISParte_Cuerpo {
    
    ArrayList<Parte_Cuerpo> getParteCuerpos();
    void addParteCuerpo(Parte_Cuerpo parte_cuerpo);
    void updateParteCuerpo(Parte_Cuerpo parte_cuerpo);
    void deleteParteCuerpo(Parte_Cuerpo parte_Cuerpo);
    
}
