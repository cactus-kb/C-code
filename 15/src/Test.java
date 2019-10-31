import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
//        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        //list.addLast(7);
        boolean ret = list.chkPalindrome();
        System.out.println(ret);


//        Node node = list.deleteDuplication();
//        System.out.println(node.data);


//        LinkList list = new LinkList();
//        list.addLast(1);
//        list.addLast(6);
//        list.addLast(5);
//        list.addLast(7);
//        list.addLast(8);
//        list.addLast(2);
//        list.addLast(4);
//        list.addLast(9);
//        list.addLast(0);
//        Node node = list.partition(4);
//        list.display1(node);



//        LinkList list = new LinkList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.addLast(5);
//        Node ret2 = list.findTail(6);
//        System.out.println(ret2.data);
//        Node ret1 = list.middleNode1();
//        System.out.println(ret1.data);
//        list.addLast(6);
//        list.display();
//        Node ret = list.middleNode();
//        System.out.println(ret.data);
//        Node node1 = list.reverseList();
//        list.display1(node1);
//        int len = list.length();
//        System.out.println(len);


//        LinkList list = new LinkList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(2);
//        list.addLast(4);
//        list.addLast(2);
//        list.addLast(5);
//        list.addLast(2);
//        list.addLast(3);
//        list.display();
//        list.removeAllkey(2);
//        list.display();
//        LinkedList list = new LinkedList();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        list.display();


//        LinkedList list = new LinkedList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        int len = list.size();
//        System.out.println(len);
//        list.display();
//        list.addIndex(3,4);
//        list.display();
//        boolean ret = list.contains(2);
//        System.out.println(ret);

//        LinkedList list = new LinkedList();
//        list.addLast(2);
//        list.addLast(1);
//        list.addLast(3);
//        list.addLast(2);
//        list.addLast(4);
//        list.addLast(5);
//        list.addLast(2);
//        list.removeAllkey(2);
//        list.display();
//        list.clear();
//        System.out.println("jj");
    }
}
