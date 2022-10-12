import java.lang.reflect.Array;
import java.util.ArrayList;
public class hw_n_8 {
    interface GetInfo {
        public double getValue(double d);
    }

    class Student implements GetInfo {
        double score;

        //@Override
        public double getValue(double d) {
            return score;
        }

         void Student() {
            this.score = Math.random() * 4.5;
        }


    }
    
    public static void main(String[] args) {
        ArrayList<Student> stl = new ArrayList<Student>();
        int t=10;
        while (0<t--) {
            Student st = new Student();
            stl.add(st);
        }
        average(stl);

    }

    double average(ArrayList array) {
        for (Student student : array) {
            System.out.println(student.score);
        }
    }//
}
