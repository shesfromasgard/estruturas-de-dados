package Ex1;

public class Senha {

    private int senha;
    private String nome;

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Senha(int senha, String nome) {
        this.senha = senha;
        this.nome = nome;
    }
    
}
