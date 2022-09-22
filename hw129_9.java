import java.util.Scanner;

public class hw129_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 항의 개수 : ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }
    public static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n - 2) + fibo(n - 1);
    }
}
