import java.util.Date;

public class StringbufferTest {
    public static void main(String[] args) {
//        StringBuffer str = new StringBuffer("abc");
//        str.reverse();
//        System.out.println(str);
        Test();
    }

    public static void Test() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }

}
