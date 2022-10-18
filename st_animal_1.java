class Animal{
    void sound(){};
}
class Dog extends Animal{
    
    void sound(){
        System.out.println("bark bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("maw maw");
    }
}

public class st_animal_1 {
    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();
        c.sound();
        d.sound();
    }
}
