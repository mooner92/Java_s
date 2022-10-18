import java.util.Random;
public class st_foreachEx_1 {
    public static void main(String[] args){
        String[] fruits = {"apple","banana","grape","melon","strawberry"};
        for(String f : fruits) {
            System.out.println(f);
        }
        
        int[][] ragged_1 = {{10,11,12},{20,21},{30,31,32,33}};
        for(int[] a : ragged_1){
            for(int p : a){ 
                System.out.print(p+" ");
            }
            System.out.println();
        }
        
    }
}
