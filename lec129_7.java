import java.util.Scanner;

public class lec129_7 {

    // 예제와 같이 120까지의 소수를 구하기 위해 120 선언.
    static boolean prime[] = new boolean[101];

    public static void main(String[] args) /* throws Exception */ {
        X x1 = new X();
        System.out.println(x1.i); //lec_n_class에서 선언된 X클래스의 public i 에 접근함

        Scanner sc = new Scanner(System.in);
        int N = 100;

        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= N; j += i)
                    prime[j] = true;
            }
        }

        // 소수 출력
        for (int i = 1; i <= N; i++) {
            if (!prime[i])
                System.out.print(i + " ");
        }
        sc.close();
    }
}
