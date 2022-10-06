
class Animal {
    void speak() {
        System.out.println("animal클래스의 sound()");
    }
}

class dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class animalClass {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.speak();
        c.speak();
    }
}
