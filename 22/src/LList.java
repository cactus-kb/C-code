import java.util.Arrays;

public class LList {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("i'm a student");
        System.out.println(s.reverse());

        System.out.println(fistUpper("good"));
        System.out.println(fistUpper(""));
        System.out.println("a");



//        StringBuffer s = new StringBuffer();
//        s.append("hello").append("world");
//        fun(s);
//        System.out.println(s);
//
//        StringBuffer sb = new StringBuffer("helloworld");
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(5,7));
//        System.out.println(sb.insert(1,"kk你"));

//        String str = " hello world  ";
//        String st = "HAHAHAHAHA";
//        String str1 = str.trim();
//        System.out.println(str1);
//        String str2 = str.toUpperCase();
//        System.out.println(str2);
//        String str3 = st.toLowerCase();
//        System.out.println(str3);
//        String s1 = str.concat("good night");
//        System.out.println(s1);
//        int ret = str.length();
//        System.out.println(ret);
//        boolean b = str.isEmpty();
//        System.out.println(b);

//        String str = "hello";
//
//        //从指定索引截取到结尾
//        String str1 = str.substring(2);
//        System.out.println(str1);//ll0
//
//        //截取部分内容
//        String str2 = str.substring(2,4);
//        System.out.println(str2);//ll

//        String str = "good time Helen";
//
//        //将字符串全部拆分
//        String[] str1 = str.split(" ");
//        System.out.println(Arrays.toString(str1));//[good, time, Helen]
//
//        //将字符串部分拆分,数组长度就是limit极限
//        String[] str2 = str.split(" ",2);
//        System.out.println(Arrays.toString(str2));//[good, time Helen]
//        String[] str3 = str.split(" ",4);
//        System.out.println(Arrays.toString(str3));//[good, time, Helen]

//        String str = "goodmorning";
//
//        //替换所有的指定内容
//        String str1 = str.replace("morning","time");
//        System.out.println(str1);//goodtime
//
//        //替换首个内容
//        String str2 = str.replace("m","M");
//        System.out.println(str2);//goodMorning
//        String str3 = str.replace("oo","*");
//        System.out.println(str3);//g*dmorning


//        String str1 = "goodtime";
//
//        //判断一个字符串是否存在
//        boolean b = str1.contains("ood");
//        System.out.println(b);//true
//
//        /*
//        * 使用indexOf()时，如果内容重复，它只能返回查找的第一个位置
//        * */
//        //从头开始查找指定字符串的位置，查到返回位置的索引，查不到返回-1
//        int index = str1.indexOf("im");
//        System.out.println(index);//5
//        int index1 = str1.indexOf("l");
//        System.out.println(index1);//-1
//
//        //从指定位置开始查找字符串位置
//        int index2 = str1.indexOf("im",4);//从4号位置开始查找“im”的位置,查不到返回-1
//        System.out.println(index2);//5
//
//        //由后向前查找字符串位置
//        int index3 = str1.lastIndexOf("o");
//        System.out.println(index3);//2
//
//        //从指定位置由后向前查找
//        int index4 = str1.lastIndexOf("t",6);
//        System.out.println(index4);//4
//
//        //判断是否以指定字符串开头
//        boolean b1 = str1.startsWith("goo");
//        System.out.println(b1);//true
//        boolean b2 = str1.startsWith("oo");
//        System.out.println(b2);//false
//
//        //从指定位置开始判断是否以指定字符串开头
//        boolean b3 = str1.startsWith("tim",4);
//        System.out.println(b3);//true
//        boolean b4 = str1.startsWith("tim",2);
//        System.out.println(b4);///false
//
//        //判断是否以指定字符串结尾
//        boolean b5 = str1.endsWith("me");
//        System.out.println(b5);//true
//


//        String str1 = "hello";
//        String str2 = "Hello";
//        //区分大小写的比较
//        System.out.println(str1.equals(str2));//false
//        //不区分大小写的比较
//        System.out.println(str1.equalsIgnoreCase(str2));//true
//        /*
//        * compareTo()比较两个字符串大小关系
//        * 1.相等：返回0；
//        * 2.小于：返回内容小于0；
//        * 3.大于：返回内容大于0
//        * */
//        System.out.println("A".compareTo("A"));//0
//        System.out.println("A".compareTo("a"));//-32
//        System.out.println("a".compareTo("A"));//32


//        String str = "1234u";
//        boolean b = isNumber(str);
//        System.out.println(b);

//        byte[] by = {97,98,99,100};
//        String s = new String(by);
//        System.out.println(s);//abcd
//        String str = new String(by,1,3);
//        System.out.println(str);//bcd
//        String str1 = "hello";
//        byte[] b = str1.getBytes();
//        System.out.println(Arrays.toString(b));//[104,101,108,108,111]

//        String str = "hello";
//        System.out.println(str.charAt(0));
//
//        char[] value = {'z','c','f','h','j'};
//        String str1 = new String(value);//zcfhj
//        System.out.println(str1);
//        String str2 = new String(value,1,3);//cfh
//        System.out.println(str2);
//        String str3 = "abcdefg";
//        System.out.println(str3.charAt(3));
//
//        String string = "hello";
//        char[] ch = string.toCharArray();
//        System.out.println(Arrays.toString(ch));//[h,e,l,l,o]
    }

    public static boolean isNumber(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < '0' || ch[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }

    public static String fistUpper(String str) {
        if ("".equals(str) || str == null) {
            return str;
        }
        if (str.length() > 1) {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        return str.toUpperCase();
    }
}