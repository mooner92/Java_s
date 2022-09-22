class Car {
    String color;
    int speed, gear;

    @Override
    public String toString() {
        return "Car[color=" + color + ",speed=" + speed + ",gear=" + gear + "]";
    }

    void setColor(String s) {
        this.color = s;
    }

    void changeGear(int g) {
        gear = g;
    }

    void speedUp() {
        speed += 10;
    }

    void speedDown() {
        speed -= 10;
    }
};
public class lec_n_class2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor("red");
        car1.changeGear(2);
        car1.speed = 100;
        car1.speedUp();
    }
}
