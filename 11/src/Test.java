public class Test {
    public static void main(String[] args) {
//        addfirsttest();
//        System.out.println();
        addlasttest();
//        System.out.println();
       // addindex();
    }

    public static void addfirsttest() {
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.display();
    }

    public static void addlasttest() {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
    }
    public static void addindex() {
        LinkedList list = new LinkedList();
        list.addIndex(2,9);

    }
}
