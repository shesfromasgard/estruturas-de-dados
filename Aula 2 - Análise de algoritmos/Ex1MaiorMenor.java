public class Ex1MaiorMenor {
    public static void maiorMenor() {

        //Complexidade assintótica igual a O(n).

        int vetor [] = {3, 5, 25, 1500, 2, 95, 500, 3};
    
        int maior = 0, menor = vetor[1];
    
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= maior) {
                maior = vetor[i];
            } else if (vetor[i] <= menor){
                menor = vetor[i];
            }
        }
    
        System.out.println(maior);
        System.out.println(menor);

    }
    public static void main(String[] args) {
        
        maiorMenor();

    }
}