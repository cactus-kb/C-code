//public class Test {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a,b);
//    }
//
//    public static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a = " + a + ", b = " + b);
//    }
//}


public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 20;
        swap(a,b,c);
    }

    public static void swap(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("max is: " + a);
            } else {
                System.out.println("max is: " + c);
            }
        } else {
            if (c > b) {
                System.out.println("max is: " + c);
            } else {
                System.out.println("max is: " + b);
            }
        }
        if (a > b) {
            if (b > c) {
                System.out.println("min is: " + c);
            } else {
                System.out.println("min is: " + b);
            }
        } else {
            if (c > b) {
                System.out.println("min is: " + b);
            } else {
                System.out.println("min is: " + c);
            }
        }
    }
}