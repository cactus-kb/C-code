package printshape;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rect();
        Shape shape3 = new Flower();
        drawshape(shape1);
        drawshape(shape2);
        drawshape(shape3);
    }

    public static void drawshape(Shape shape) {
        shape.draw();
    }
}
