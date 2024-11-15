package ar.edu.unlar.paradigmas3.sistemagal.objetos;

import java.util.Date;

/**
 * @author Mateo.Bazan
 */
public class Accidente {

    private int numero;
    private Date fecha;
    private String ubicacion;
    private Empleado legajoEmpleado; // Relación con Empleado
    private Motivo codigoMotivo; // Relación con Motivo
    private Tipo_Accidente codigoTipoAccidente; // Relación con TipoAccidente
    private Zona_Cuerpo zonaCuerpo;
    private Parte_Cuerpo parteCuerpo;

    // Constructor vacío
    public Accidente() {
    }

    public Accidente(int numero) {
        this.numero = numero;
    }

    // Constructor básico
    public Accidente(int numero, Date fecha, String ubicacion) {
        this.numero = numero;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    // Constructor completo
    public Accidente(int numero, Date fecha, String ubicacion, Empleado legajoEmpleado, Motivo codigoMotivo, Tipo_Accidente codigoTipoAccidente) {
        this.numero = numero;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.legajoEmpleado = legajoEmpleado;
        this.codigoMotivo = codigoMotivo;
        this.codigoTipoAccidente = codigoTipoAccidente;
    }

    //Constructor completo 2
    public Accidente(int numero, Date fecha, String ubicacion, Empleado legajoEmpleado, Motivo codigoMotivo, Tipo_Accidente codigoTipoAccidente, Zona_Cuerpo zonaCuerpo, Parte_Cuerpo parteCuerpo) {
        this.numero = numero;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.legajoEmpleado = legajoEmpleado;
        this.codigoMotivo = codigoMotivo;
        this.codigoTipoAccidente = codigoTipoAccidente;
        this.zonaCuerpo = zonaCuerpo;
        this.parteCuerpo = parteCuerpo;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Empleado getLegajoEmpleado() {
        return legajoEmpleado;
    }

    public void setLegajoEmpleado(Empleado legajoEmpleado) {
        this.legajoEmpleado = legajoEmpleado;
    }

    public Motivo getCodigoMotivo() {
        return codigoMotivo;
    }

    public void setCodigoMotivo(Motivo codigoMotivo) {
        this.codigoMotivo = codigoMotivo;
    }

    public Tipo_Accidente getCodigoTipoAccidente() {
        return codigoTipoAccidente;
    }

    public void setCodigoTipoAccidente(Tipo_Accidente codigoTipoAccidente) {
        this.codigoTipoAccidente = codigoTipoAccidente;
    }

    public Zona_Cuerpo getZonaCuerpo() {
        return zonaCuerpo;
    }

    public void setZonaCuerpo(Zona_Cuerpo zonaCuerpo) {
        this.zonaCuerpo = zonaCuerpo;
    }

    public Parte_Cuerpo getParteCuerpo() {
        return parteCuerpo;
    }

    public void setParteCuerpo(Parte_Cuerpo parteCuerpo) {
        this.parteCuerpo = parteCuerpo;
    }

    @Override
    public String toString() {
        return "Accidente{"
                + "numero=" + numero
                + ", fecha=" + fecha
                + ", ubicacion='" + ubicacion + '\''
                + ", legajoEmpleado=" + legajoEmpleado
                + ", codigoMotivo=" + codigoMotivo
                + ", codigoTipoAccidente=" + codigoTipoAccidente
                + '}';
    }
}
