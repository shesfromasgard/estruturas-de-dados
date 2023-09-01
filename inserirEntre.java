public class inserirEntre {
    //Custo computacional é log n (com base 2, garota)
    public static void inserirEntreElementos(int[] vet, int elemento, int p) throws Exception{
        if (uPosicao == vet.length-1) {
            throw new Exception("Não há posições disponíveis.");
        } else if (p > uPosicao) {
            inserirFim(vet, elemento);
        } else {
            for (int i = uPosicao+1; i > p; --i) {
                vet[i] = vet [i - 1];
            }
            vet[p] = elemento;
            uPosicao++;
        }
    }
    public static void insereInicio (int [] vet, int elemento) throws Exception {

        if (uPosicao == vet.length) {
            throw new Exception("Não há posições disponíveis.");
        }
        for (int i = uPosicao + 1; i > 0; --i) {
            vet[i] = vet[i - 1];
        }
        vet[0] = elemento;
        uPosicao++;

    }
    public static void inserirFim(int []vet, int elemento) throws Exception{
        if(uPosicao == vet.length-1) {
            throw new Exception ("Não há posições disponíveis.");
        } else {
            vet[++uPosicao] = elemento;
        }
    }
}
