package PreExam.src;

public class s356 {
    public static void main(String[] args){
        try{
        int num = Integer.parseInt("ABC");  //ABC를 정수로 파싱하려함
        System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("예외 오류가 발생함");
        }
    }
}
