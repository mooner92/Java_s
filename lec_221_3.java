
class MyMetric {
    static double miles = 0.6213881811967936;

    public static double get_miles(int n) {
        return n * miles;
    }
}

public class lec_221_3 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(n+"km를 마일로 바꾸면 "+MyMetric.get_miles(n));
    }
}
