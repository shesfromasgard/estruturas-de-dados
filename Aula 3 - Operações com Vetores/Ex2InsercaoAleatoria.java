import java.util.Random;

public class Ex2InsercaoAleatoria {
    public static void main(String[] args) {
        Random random = new Random();

        int ultimo = 0;
        int topo = -1;
        int tamanho = 100;

        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int op = random.nextInt(3) + 1;
            int num = random.nextInt(1000) + 1;

            if (i == 0 || op == 1) {
                insereInicio(vetor, num, topo);
                topo++;
                ultimo = 0;
            } else if (op == 2) {
                insereFim(vetor, num, topo);
                topo++;
                ultimo = topo;
            } else if (op == 3) {
                if (ultimo == 0) {
                    insereInicio(vetor, num, topo);
                    topo++;
                    ultimo = topo;
                } else {
                    insereEntre(vetor, num, ultimo, topo);
                    topo++;
                }
            }

        }

        for (int i = 0; i <= topo; i++) {
            System.out.println(vetor[i]);
        }

    }

    public static void insereInicio(int vet[], int elemento, int topo) {
        if (topo == -1)
            vet[0] = elemento;
        else {
            for (int i = topo + 1; i > 0; --i)
                vet[i] = vet[i - 1];
            vet[0] = elemento;
        }

    }

    public static void insereFim(int vet[], int elemento, int topo) {
        vet[++topo] = elemento;

    }

    public static void insereEntre(int vet[], int elemento, int ultimo, int topo) {
        for (int i = topo + 1; i > ultimo - 1; --i) {
            vet[i] = vet[i - 1];
        }
        vet[ultimo - 1] = elemento;
        ultimo = ultimo - 1;
    }
}
