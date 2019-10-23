package package1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Linklist list = new Linklist();
//        list.add( 0, 1);
//        list.add( 1, 2);
//        list.add( 2, 3);
//        list.add( 3, 4);
//        list.add( 4, 5);
//        list.display();
        //System.out.println(Arrays.toString());
        MyArrayList list = new MyArrayList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.display();
    }
}
