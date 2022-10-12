public class lec_314_6 {
    interface A {
        int add();

        int sun();
    }

    class c implements A {
        @Override
        public int add(int a, int b) {return a+b};

        public int sub(int a, int b) {return a-b};
    }

    public static void main(String[] args) {
        c abb = new c();
        System.out.println(abb.add(3,4));
    }
}
