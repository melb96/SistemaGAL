package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Accidente;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISAccidente {
    
    public ArrayList<Accidente> getAccidentes();
    public void addAccidente (Accidente accidente);
    public void updateAccidente(Accidente accidente);
    public void deleteAccidente(int numero);
    
}
