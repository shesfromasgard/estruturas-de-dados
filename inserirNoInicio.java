public class inserirNoInicio {
    //Custo computacional é linear
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
    public static void main(String[] args) {
        int vet [] = new int [10];
    }
    
}
