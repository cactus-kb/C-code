package P1;

public class Testseqlist {
    public static void main(String[] args) {
        SeqList list = new SeqList();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,5);
        list.add(1,9);
        list.display();
        boolean ret = list.contains(4);
        System.out.println(ret);
        int ret1 = list.search(6);
        System.out.println(ret1);
        int ret2 = list.getPos(-2);
        System.out.println(ret2);
        list.setPos(1,8);
        list.display();
        list.remove(8);
        list.display();
        int ret3 = list.size();
        System.out.println(ret3);
        list.clear();
        System.out.println("haha");
    }
}
