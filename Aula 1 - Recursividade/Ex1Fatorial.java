import java.util.Scanner;

public class Ex1Fatorial {
    public static long fatorial (int n, long resultado) {
        
        if (n == 0 || n == 1) {
            return resultado;
        }
        else {
            resultado = resultado*n;
            n--;
            return fatorial(n, resultado);
        }
        
    }
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        long fat = fatorial(num, 1);
        System.out.println(fat);

        sc.close();

    }
}