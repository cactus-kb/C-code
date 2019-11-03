import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        * ArrayList每次扩容，扩大到原容量的1.5倍
        * Vector每次扩容，扩大到原容量的2倍
        * java不支持运算符重载。自定制的类，或者标准库中的一些类，都不能使用[]这样的方式访问
        *
        * */
        //创建List实例
        List<String> list = new ArrayList<>();
        //插入元素
        list.add("C语言");
        list.add("C++语言");
        list.add("java语言");
        list.add("python语言");
//        System.out.println(list);
        //按下标访问
//        System.out.println(list.get(0));
//        list.set(0,"PHP");
//        System.out.println(list.get(0));
        //截取部分内容
      //  System.out.println(list.subList(1,3));//前闭后开
//        List<String> list2 = list.subList(1,3);
//        list2.set(0,"PHP");
//        System.out.println(list);
//        System.out.println(list2);
//
        //重新构造
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list);
        System.out.println(list2);
        list2.set(0,"PHP");
        System.out.println(list);
        System.out.println(list2);

    }
}
