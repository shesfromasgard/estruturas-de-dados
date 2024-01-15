package Ex1Filmes;

public class Filme {

    public String nome;
    public String genero;
    public int codigo;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Filme(String nome, String genero, int codigo) {
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
    }
}
