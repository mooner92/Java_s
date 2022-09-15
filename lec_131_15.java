import java.util.Arrays;

public class lec_131_15 {
    public static void main(String[] args){
        int[][] m = new int[3][5];
        for(int i=0;i<3;i++){
            Arrays.fill(m[i],0 );
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                m[i][j] = (int)(Math.random()*100)%2;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
