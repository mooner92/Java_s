import java.util.*;
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return x + " + " + y;
    }
}

public class s568 {
        public static void main(String[] args){
            ArrayList<Point> list = new ArrayList<>();
            list.add(new Point(0,0));
            list.add(new Point(4,5));
            System.out.println(list);
        }
    
}
