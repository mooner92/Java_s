public class lec129_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= 100; j++)
                for (int k = 1; k <= 100; k++) {
                    if (i * i + j * j == k * k)
                        System.out.print(i + "\t" + j + "\t" + k + "\n");
                }

    }
}
