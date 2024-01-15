package Ex1Filmes;

public class ListaFilmes {
    private int tam = 10;
    private Filme[] F;
    private int ultimo = 0;
    public ListaFilmes(){
        F = new Filme[tam];
    }

    public void inserir(Filme filme) throws Exception {
        if(tam == ultimo) {
            throw new Exception("Vetor cheio.");
        } else if (ultimo == 0) {
            F[0] = filme;
        } else {
            int i;
            for (i = ultimo - 1; i >= 0 && F[i].getCodigo() > filme.getCodigo(); i--) {
                F[i + 1] = F[i];
            }
            F[i + 1] = filme;
        }
        ultimo++;
        System.out.println(filme.getNome() + " inserido com sucesso.");
    }

    public void excluir(int cod) {
        int pos = -1;
        for (int i = 0; i < ultimo; ++i) {
            if (F[i].getCodigo() == cod) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Filme não encontrado.");
        } else {
            for (int i = pos; i < ultimo - 1; i++) {
                F[i] = F[i + 1];
            }
            ultimo--;
            System.out.println("Filme excluído com sucesso.");
        }
    }

    public void aumentarTamanho(int novoTam) throws Exception {

        if (novoTam < tam) {
            throw new Exception("O novo tamanho deve ser maior que o atual.");
        } else if (novoTam == tam) {
            throw new Exception("Esse já é o tamanho do vetor, seu animal.");
        } else {
            Filme aux [] = F;
            tam = novoTam;
            Filme F[] = new Filme [tam];
    
            for(int i = 0; i < ultimo; ++i) {
                F[i] = aux[i];
            }
    
            System.out.println("Tamanho reajustado para " + novoTam + " posições.");
        }
    }

    public void buscar(String nome) throws Exception {
        if(ultimo == 0) {
            throw new Exception("Vetor vazio.");
        }
        int pos = -1;
        for(int i = 0; i < ultimo; ++i) {
            if (F[i].getNome().equalsIgnoreCase(nome)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println("Filme encontrado na posição " + (pos + 1) + " do vetor.");
        }
    } 
}
