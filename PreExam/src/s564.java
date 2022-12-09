import java.util.*;
public class s564 {
    public static void main(String[] args){
        Vector<Double> v = new Vector<Double>();
        v.add(3.4);
        v.add(434.6);
        v.add(17.4);
        System.out.println("vector의 크기 : "+v.size());
        Collections.sort(v);
        for(Double s : v)
        System.out.println(s);

    }
}
