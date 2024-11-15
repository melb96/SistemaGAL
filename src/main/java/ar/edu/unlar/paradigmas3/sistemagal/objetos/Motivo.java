package ar.edu.unlar.paradigmas3.sistemagal.objetos;

/**
 * @author Mateo.Bazan
 */
public class Motivo {

    private int codigo;
    private String motivo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Motivo() {
    }

    public Motivo(int codigo, String motivo) {
        this.codigo = codigo;
        this.motivo = motivo;
    }
    
    public Motivo (int codigo){
        this.codigo = codigo;
    }
}
