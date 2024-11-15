package ar.edu.unlar.paradigmas3.sistemagal.objetos;

/**
 * @author Mateo.Bazan
 */
public class Tipo_Accidente {

    private int codigo;
    private String tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tipo_Accidente() {
    }

    public Tipo_Accidente(int codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }
    
    public Tipo_Accidente(int codigo){
        this.codigo = codigo;
    }

}
