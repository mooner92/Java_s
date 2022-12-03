package PreExam.src;

import java.util.Arrays;

public class s349 {
    public static void main(String[] args){
        int[] arrays = {1,2,3,4,5,6};
        Arrays.sort(arrays);
        pa(arrays);
        Arrays.fill(arrays,8);
        pa(arrays);
    }
    private static void pa(int[] arrays){
        System.out.print("[ ");
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i] + " ");
        }
        System.out.println("]");
    }
}
