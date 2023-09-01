import java.util.Scanner;

public class Ex3Primo {

    public static boolean isPrimo(int num, int div) {

        if(num == 1) {
            return false;
        }
        if (div <= 1) {
            return true;
        }
        if (num % div == 0) {
            return false;
        }

        return isPrimo(num, div - 1);

    }
    public static boolean isPrimo(int num) {
        return isPrimo(num, num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isPrimo(num)) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

        sc.close();
    }
    
}
