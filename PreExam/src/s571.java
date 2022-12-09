import java.util.LinkedList;

public class s571 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("asas");
        list.add("adsadsa");
        list.add(1,"adsadsa");
        list.set(2,"grape");
        list.remove(1);
        for(String s : list){
            System.out.println(s);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
