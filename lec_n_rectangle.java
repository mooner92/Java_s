
class Rectangle {
    int w, h;
    Rectangle(int w, int h) {
        //System.out.println("사각형입니다.");
        this.w = w;
        this.h = h;
    }
}

class color_Rectangle extends Rectangle {
    String color;

    color_Rectangle(int w, int h, String color) {
        super(w,h);
        this.color = color;
    }
}

public class lec_n_rectangle {
    public static void main(String[] args) {
        color_Rectangle r = new color_Rectangle(100, 100, "BLUE");
        System.out.println(r.h + r.w + r.color);
    }
}

