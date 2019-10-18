package package1;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rect();
        Shape shape3 = new Flower();
//        drawshape(shape1);
//        drawshape(shape2);
//        drawshape(shape3);

        //drawshape();

        drawshpes();
    }


    public static void drawshpes() {
        Shape[] shapes = {
                new Circle(),
                new Rect(),
                new Flower(),
                new Rect(),
                new Flower()
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }





//    public static void drawshape(Shape shape) {
//        shape.draw();
//    }

//    public static void drawshape() {
//        Rect rect = new Rect();
//        Circle circle = new Circle();
//        Flower flower = new Flower();
//        String[] shapes = {"circle","rect","circle","flower","circle","flower"};
//
//        for (String shape : shapes) {
//            if (shape.equals("circle")) {
//                circle.draw();
//            } else if (shape.equals("rect")) {
//                rect.draw();
//            } else if (shape.equals("flower")) {
//                flower.draw();
//            }
//        }
//    }
}
