import java.util.Scanner;

public class lec129_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n - 2) + fibo(n - 1);
    }
}
