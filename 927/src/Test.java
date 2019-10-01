public class Test {
    public static void main (String[] args) {
        TestAddFirst();
        TestAddLast();
        TestAddIndex();
        Testcontains();
        Testremove();
    }

    public static void TestAddFirst() {
        System.out.println("测试头插：");
        Linklist list = new Linklist();
        list.AddFirst(1);
        list.AddFirst(2);
        list.AddFirst(3);
        list.AddFirst(4);
        list.AddFirst(5);
        list.display();
    }

    public static void TestAddLast() {
        System.out.println("测试尾插：");
        Linklist list = new Linklist();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddLast(5);
        list.display();
    }

    public static void TestAddIndex() {
        System.out.println("测试插入任意位置：");
        Linklist list = new Linklist();
        list.AddFirst(1);
        list.AddFirst(2);
        list.AddFirst(3);
        list.AddFirst(4);
        list.AddFirst(5);
        list.AddIndex(2,8);
        list.display();
    }

    public static void Testcontains() {
        System.out.println("测试是否包含某一元素：");
        Linklist list = new Linklist();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddLast(5);
        boolean ret = list.contains(5);
        System.out.println("ret的预期值是：true,实际值是：" + ret);
    }

    public static void Testremove() {
        System.out.println("测试删除链表中的元素：");
        Linklist list = new Linklist();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddLast(5);
        list.remove(2);
        list.display();
    }
}
