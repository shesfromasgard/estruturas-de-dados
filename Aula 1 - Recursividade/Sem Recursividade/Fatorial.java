import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        int contador = num -1;

        while (contador != 0) {

            num *= contador;
            contador--;

        } 

        System.out.println(num);

        sc.close();

    }
    
}
