import java.util.Scanner;

public class Ex5MDC {
    public static int recur(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        } else if (n2 == 0) {
            return n1;
        } else {
            return recur(n2, n1 % n2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(recur(n1, n2));

        sc.close();

    }
    
}
