import java.util.*;

public class st_characterEx_1{
    public static void main(String[] args){
        char a;
        Scanner cs = new Scanner(System.in);
        a = cs.next().charAt(0);
        int k = a-97;
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k-i;j++){
                System.out.print(String.format("%c", j+97));
            }
            System.out.println();
        }
        cs.close();
    }
}