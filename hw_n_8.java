interface GetInfo {
    double getValue();
}

class Student implements GetInfo {
    double score;

    Student() {
        this.score = Math.random() * 4.5;
    }

    public double getValue() {
        return this.score;
    }//
}

public class hw_n_8 {

    static double average(Student[] object) {
        double sum = 0.0;
        for (int i = 0; i < object.length; i++) {
            sum += object[i].getValue();
        }
        return sum / object.length;
    }

    public static void main(String[] args) {
        final int c = 10;  //n명
        Student[] stl = new Student[c];
        for (int i = 0; i < c; i++) {
            Student st = new Student();
            stl[i] = st;
        }
        System.out.printf("%.1f",average(stl));
    }
}