public class inserirNoFim {
    //Custo computacional é constante
    public static void inserirFim(int []vet, int elemento) throws Exception{
        if(uPosicao == vet.length-1) {
            throw new Exception ("Não há posições disponíveis.");
        } else {
            vet[++uPosicao] = elemento;
        }
    }
}
