
interface GetInfo {
    double getValue();
}

class Student implements GetInfo {
    double score;

    Student() {
        score = (int) Math.random() * 4.5;
    }

    double getValue() {
        return this.score;
    }
}


public class hw_n_8 {
    double average(double[] object) {
        double sum = 0.0;
        for (int i = 0; i < object.length(); i++) {
            sum += object[i].getValue();
        }
        return sum / object.length();
    }

    public static void main(String[] args) {
        Student[100] stl;
        System.out.println(average(stl));
    }
}