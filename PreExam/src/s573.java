import java.util.HashSet;

public class s573 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("asdsad");
        set.add("sadsad");
        set.add("hgf");
        System.out.println(set);
        if(set.contains("hgf")){
            System.out.println("hgf도 포함되어 있음");
        }
    }
}
