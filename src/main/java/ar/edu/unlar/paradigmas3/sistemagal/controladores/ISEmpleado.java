package ar.edu.unlar.paradigmas3.sistemagal.controladores;

import ar.edu.unlar.paradigmas3.sistemagal.objetos.Empleado;
import java.util.ArrayList;

/**
 * @author Mateo.Bazan
 */
public interface ISEmpleado {
    
    public ArrayList<Empleado> getEmpleados();
    public void addEmpleado(Empleado empleado);
    public void updateEmpleado(Empleado empleado);
    public void deleteEmpleado(Empleado empleado);
    
}
