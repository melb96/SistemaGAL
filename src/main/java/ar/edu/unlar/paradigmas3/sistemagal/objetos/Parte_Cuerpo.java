package ar.edu.unlar.paradigmas3.sistemagal.objetos;

/**
 * @author Mateo.Bazan
 */
public class Parte_Cuerpo {

    private int codigo;
    private String parte;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public Parte_Cuerpo() {
    }

    public Parte_Cuerpo(int codigo, String parte) {
        this.codigo = codigo;
        this.parte = parte;
    }
    
    public Parte_Cuerpo(int codigo){
    this.codigo = codigo;
}
    
    public Parte_Cuerpo(String parte){
        
        this.parte = parte;
    }

}
