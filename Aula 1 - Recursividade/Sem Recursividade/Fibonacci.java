import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int anterior = 1, anterior1 = 1;
        int resultado;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num == 1 || num == 0) 
            System.out.println("O Fibonacci é igual a " + num);
        else if (num == 2) {
            System.out.println(1);
        } else {
            resultado = 2;
            anterior = resultado;
            for (int i = 3; i == num; i++) {
                anterior += anterior1;
                anterior1 = anterior;
            }
            resultado = anterior;
            System.out.println(resultado);
        }

        sc.close();

    }
    
}
