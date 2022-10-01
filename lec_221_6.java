import java.util.Scanner;
import java.util.ArrayList;;
class Contact {
    String name, tel, email;
    static int count = 0;

    public static void cnt_add() {
        count++;
    }
    Contact(String s1, String s2, String s3) {
        this.name = s1;
        this.tel = s2;
        this.email = s3;
    }
}

public class lec_221_6 {
    public static void main(String[] args) {
        ArrayList<Contact> book = new ArrayList<Contact>();
        String s1, s2, s3;
        System.out.println("연락처를 입력하십시오(종료 -1");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("이름과 전화번호, 이메일을 입력하십시오: ");
            s1 = sc.next();
            if ("-1".equals(s1))
                break;
            s2 = sc.next();
            s3 = sc.next();
            book.add(new Contact(s1, s2, s3));
            Contact.cnt_add();
        }
        System.out.println(Contact.count);
        sc.close();//
    }//
}
