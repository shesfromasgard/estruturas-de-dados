import java.util.Scanner;

public class Ex2Base2 {
    public static int recur(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 2;
        } else {
            return 2 * recur(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(recur(num));

        sc.close();
    }
    
}
