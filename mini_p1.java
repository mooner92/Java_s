import java.util.*;
import java.util.Scanner;

public class mini_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ondo = sc.nextInt();

        System.out.format("%f", ((ondo - 32) * 5.) / 9);
    }
}
