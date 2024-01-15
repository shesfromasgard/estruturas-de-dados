package Ex1;

public class FilaArranjo {

    private int tam = 50;
    private Senha vet[] = new Senha[tam];
    private int inicio = 0;
    private int fim = 0;

    public void distribuir(Senha senha) throws Exception {
        if(fim == tam) {
            throw new Exception("Fila cheia.");
        } else {
            vet[fim] = senha;
            fim++;
        }
    }

    public void chamar() throws Exception {
        if(inicio == fim) {
            throw new Exception("Fila vazia");
        } else {
            Senha prox = vet[inicio];
            System.out.println("Vem, " + prox.getNome());
            inicio++;
        }
    }
    
}
