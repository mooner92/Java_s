import java.util.HashSet;

public class s574 {
    public static void main(String[] args){
        HashSet<String> s = new HashSet<String>();
        String[] sample = {"sad","asdsa","asdsad","sad"};
        for(String a : sample){
            if(!s.add(a)){
                System.out.println("중복된 단어" + a);
            }
            else
            System.out.println("중복되지 않은 단어 " + a);
        }
    }
}
