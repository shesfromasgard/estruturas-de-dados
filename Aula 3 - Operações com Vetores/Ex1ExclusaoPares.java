import java.lang.Math;

public class Ex1ExclusaoPares {

    public static void Exclusao() {
        int vet[] = new int[10];
        int qtd = 0;

        System.out.println("Vetor inicial: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random()*100) + 0;
            System.out.println(vet[i]);
        }
        System.out.println("");

        System.out.println("Vetor somente com números pares: ");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0) {
                vet[qtd] = vet[i];
                qtd++;
            }
        }

        for (int i = 0; i < qtd; i++) {
            System.out.println(vet[i]);
        }
    }
    public static void main(String[] args) {
        Exclusao();
    }
}