
public class ListaEncadeada {

    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    private int tamanho = 0;

    private void inserir(Cliente c) {
        elemento = new No(c, null, null);
        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            No atual = cabeca.proximo;
            No anterior = null;

            while (atual != null && atual.elemento.getCodigo() < c.getCodigo()) {
                anterior = atual;
                atual = atual.proximo;
            }

            if(anterior == null) {
                elemento.proximo = cabeca.proximo;
                cabeca.proximo.anterior = elemento;
                cabeca.proximo = elemento;
            } else if (atual == null) {
                elemento.anterior = cauda;
                cauda.proximo = elemento;
                cauda = elemento;
            } else {
                elemento.proximo = atual;
                elemento.anterior = anterior;
                anterior.proximo = elemento;
                atual.anterior = elemento;
            }
        }
        tamanho++;
    }
}
