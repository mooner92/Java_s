import java.util.ArrayList;

class Person {
        String name;
        String tel;

        public Person(String name, String tel) {
            this.name = name;
            this.tel = tel;
        }
    };

public class lec_n_AL {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("asd", "01099994444"));
        System.out.println(p.get(0).tel);
    }
}
