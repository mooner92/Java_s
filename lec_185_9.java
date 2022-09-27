public class lec_185_9 {
    public static void main(String[] args) {
        tts ts1 = new tts(3, 4);
        ts1.get_num1(1);
        ts1.print_num2();
    }
}

class tts {
    int num1, num2;

    public tts(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void get_num1(int n) {
        this.num1 = n;
    }

    public void print_num2(){
        System.out.println(this.num2);
    }
}
