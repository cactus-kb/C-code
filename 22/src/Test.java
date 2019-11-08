import java.util.Arrays;

public class Test {
    public static void main1(String[] args) {
        String str = "helloworld";

        //将字符串变为字符数组
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println(new String(data));
        System.out.println(new String(data,5,5));
//        String str1 = "hello";
//        System.out.println(str1.charAt(1));
//        System.out.println(str1.charAt(0));


//        char[] ch = {'a','b','c'};
//        System.out.println(ch);
//        String str = new String(ch);
//        System.out.println(str);


//        String str = "hello";
//        str = "H" + str.substring(1);
//        System.out.println(str);



    }
}
