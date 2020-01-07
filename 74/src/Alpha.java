public class Alpha extends Base {
    public static void main(String[] args) {
        new Alpha();
        new Base();
    }
}

class Base {
    Base() {
        System.out.println("Base");
    }
}
