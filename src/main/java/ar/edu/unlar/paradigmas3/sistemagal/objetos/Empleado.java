package ar.edu.unlar.paradigmas3.sistemagal.objetos;

/**
 * @author Mateo.Bazan
 */
public class Empleado {

    private int legajo;
    private String apellido_nombre;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido_nombre() {
        return apellido_nombre;
    }

    public void setApellido_nombre(String apellido_nombre) {
        this.apellido_nombre = apellido_nombre;
    }

    public Empleado() {
    }

    public Empleado(int legajo, String apellido_nombre) {
        this.legajo = legajo;
        this.apellido_nombre = apellido_nombre;
    }
    
    public Empleado (int legajo){
        
        this.legajo = legajo;
        
    }
    
    public Empleado (String apellido_nombre){
        
        this.apellido_nombre = apellido_nombre;
    }

}
