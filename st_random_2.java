import java.util.Random;

public class st_random_2 {
    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(100));
        int n = (int)(Math.random()*156 + 100);
        System.out.println(n);
    }
}
