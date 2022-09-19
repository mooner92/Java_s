import java.util.Scanner;

public class hw_123_숫자 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100),k,cnt=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            k = sc.nextInt();
            cnt++;
            if (k == n) {
                System.out.print("축하합니다.  ");
                break;
            } else if (k > n) {
                System.out.println("제시한 정수가 높습니다.");
            } else {
                System.out.println("제시한 정수가 낮습니다.");
            }
        }
        System.out.println("시도횟수=" + cnt);
        sc.close();
    }
}
