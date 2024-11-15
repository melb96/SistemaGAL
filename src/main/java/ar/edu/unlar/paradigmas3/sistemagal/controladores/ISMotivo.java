package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Motivo;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISMotivo {
    
    public ArrayList<Motivo> getMotivos();
    public void addMotivo(Motivo motivo);
    public void updateMotivo(Motivo motivo);
    public void deleteMotivo(Motivo motivo);
    
}
