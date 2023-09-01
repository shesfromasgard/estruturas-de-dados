import java.util.Scanner;

public class Ex2BuscaLogN {

    public static boolean busca(int[] vetor, int elemento) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == elemento) {
                return true;
            }
            
            if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int elemento;

        elemento = sc.nextInt();

        if (busca(vetor, elemento)) {
            System.out.println("Está no vetor.");
        } else {
            System.out.println("Não está no vetor.");
        }

        sc.close();
    }
}
