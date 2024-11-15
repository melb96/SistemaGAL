package ar.edu.unlar.paradigmas3.sistemagal.objetos;

/**
 * @author Mateo.Bazan
 */
public class Zona_Cuerpo {

    private Accidente codigo_accidente;
    private Parte_Cuerpo codigo_parte;
    private String izq_der;

    public String isIzq_der() {
        return izq_der;
    }

    public void setIzq_der(String izq_der) {
        this.izq_der = izq_der;
    }

    public String getIzq_der() {
        return izq_der;
    }

    public Accidente getCodigo_accidente() {
        return codigo_accidente;
    }

    public void setCodigo_accidente(Accidente codigo_accidente) {
        this.codigo_accidente = codigo_accidente;
    }

    public Parte_Cuerpo getCodigo_parte() {
        return codigo_parte;
    }

    public void setCodigo_parte(Parte_Cuerpo codigo_parte) {
        this.codigo_parte = codigo_parte;
    }

    public Zona_Cuerpo() {
    }

    public Zona_Cuerpo(String izq_der) {
        this.izq_der = izq_der;
    }

    public Zona_Cuerpo(Accidente codigo_accidente, Parte_Cuerpo codigo_parte) {
        this.codigo_accidente = codigo_accidente;
        this.codigo_parte = codigo_parte;
    }

    public Zona_Cuerpo(Accidente codigo_accidente, Parte_Cuerpo codigo_parte, String izq_der) {
        this.codigo_accidente = codigo_accidente;
        this.codigo_parte = codigo_parte;
        this.izq_der = izq_der;
    }

}
