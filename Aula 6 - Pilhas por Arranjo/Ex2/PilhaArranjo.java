public class PilhaArranjo {
    static final int MAX_TAM = 100;
    Processo[] pilha = new Processo[MAX_TAM];
    int topo = -1;
    public boolean isVazia() {
        return topo == -1;
    }
    public int getTamanho() {
        return topo + 1;
    }
    public void push(Processo p) throws Exception {
        if(topo == MAX_TAM - 1)
            throw new Exception ("Não há espaço disponível no vetor.");
        pilha[++topo] = p;
    }
    public Processo pop() throws Exception {
        if(isVazia())
            throw new Exception("O vetor está vazio.");
        return pilha[topo--];
    }

    public int busca(int codigo) throws Exception {
        if(getTamanho() == 0) {
            throw new Exception("Pilha vazia.");
        } else {
            for(int i = 0; i <= topo; ++i) {
                if(pilha[i].getCodigo() == codigo) {
                    return i;
                }
            }
        }
        throw new Exception("O processo " + codigo + " não foi encontrado.");
    }
}