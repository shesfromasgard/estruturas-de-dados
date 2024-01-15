public class ListaVeiculo {
    
    private No cabeca = new No();
    private No cauda = cabeca;

    private int tamanho = 0;

    public void inserir(Veiculo v) {

        No elemento = new No(v, null, null);

        if (tamanho == 0) {
            cabeca.proximo = elemento;
            cauda = elemento;
        } else {
            cauda.proximo = elemento;
            cauda = elemento;
        }

    }
    public void print() {

        No elemento = cabeca.proximo;

        while (elemento != null) {
            System.out.println("Marca: " + elemento.elemento.getMarca());
            System.out.println("Modelo: " + elemento.elemento.getModelo());
            System.out.println("Placa: " + elemento.elemento.getPlaca());
            System.out.println("Valor: " + elemento.elemento.getValor());

            System.out.println("");

            elemento = elemento.proximo;
        }

    }
}
