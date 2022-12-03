package PreExam.src;

import java.util.*;
public class s348 {
    public static void main(String[] args){
        Random r = new Random();
        for(int i=0;i<100;i++){
            System.out.println(r.nextInt(2));
        }
        System.out.println("랜덤 사인 값 = " + Math.sin(r.nextInt(360)) + "\n랜덤 코사인 값 = " + Math.cos(360));
    }
}
