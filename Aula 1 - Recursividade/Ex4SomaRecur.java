import java.util.Scanner;

public class Ex4SomaRecur {
    public static int recur(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
             return 0;
        } else {
            return n1 + recur(n1, n2 - 1);
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
