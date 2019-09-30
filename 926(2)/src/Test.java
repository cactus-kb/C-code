public class Test {
    public static void main(String[] args){
        TestAddfirst();
        Testaddlast();
        Testaddindex();
        Testcontains();
        Testremove();
    }

    public static void TestAddfirst(){
        System.out.println("测试头插");
        LinkedList list = new LinkedList();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        list.display();
    }

    public static void Testaddlast(){
        System.out.println("测试尾插");
        LinkedList list = new LinkedList();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.display();
    }

    public static void Testaddindex(){
        System.out.println("测试插入任意位置：");
        LinkedList list = new LinkedList();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.addindex(2,6);
        list.display();
    }
    public static void Testcontains(){
        System.out.println("测试是否在链表中存在");
        LinkedList list = new LinkedList();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        boolean ret = list.contains(3);
        System.out.println("ret的预期值是 true,实际值是：" + ret);
    }

    public static void Testremove(){
        System.out.println("测试删除链表中的元素");
        LinkedList list = new LinkedList();
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.addlast(4);
        list.addlast(5);
        list.remove(2);
        list.display();
    }
}
