import java.util.Scanner;

public class st_stringRotate_1 {
    public static void main(String[] args){
        String s;
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            //System.out.println(s);
            for(int j=cnt;j<cnt+s.length();j++){
                System.out.print(String.format("%c", s.charAt(j%s.length())));
            }
            System.out.println();
            System.out.println("---------------------------------------------");
            cnt++;
        }
        sc.close();
    }
}
