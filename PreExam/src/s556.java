public class s556 {
    public static<T> void printarray(T[] array){
        for(T element : array){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] iarray = {10,20,30,40,50};
        Double[] darray = {1.2,4.5,6.8,3.3,4.5};
        Character[] carray = {'a','g','t','f','y'};
        printarray(iarray);
        printarray(darray);
        printarray(carray);
    }
}
