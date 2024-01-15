public class Processo {
    int codigo;
    String responsavel;
    String cliente;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Processo(int codigo, String responsavel, String cliente) {
        this.codigo = codigo;
        this.responsavel = responsavel;
        this.cliente = cliente;
    }
    public Processo() {
        
    }
}
