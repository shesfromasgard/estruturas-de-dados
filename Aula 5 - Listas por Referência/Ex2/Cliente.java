public class Cliente {
    public String nome;
    public int telefone;
    public int codigo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(String nome, int telefone, int codigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
    } 
}
