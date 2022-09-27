public class lec_185_7 {
    

    public static void main(String[] args) {
        Student st = new Student(3, "sdf");
        Student st1 = new Student("lee");
        Student st2 = new Student();
    }

}
class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student(String name) {
            this.name = name;
            id = 0;
        }

        public Student() {
            this.id = 0;
            this.name = "abcd";
        }
    }