import java.util.Scanner;

public class Ex11Fibonacci {

    public static long fibonacci(long n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (op != 2) {

            System.out.println("Digite um número: ");
            long num = sc.nextInt();
    
            long fib = fibonacci(num);
            System.out.println(fib);
    
            System.out.println("Quer vazar do sistema? \n 1 - Não; \n 2 - Sim.");
            op = sc.nextInt(); 

        }

        sc.close();

    }
    
}
