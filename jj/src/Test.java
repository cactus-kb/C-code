public class Test {
    public static void main (String[] args) {
        Testremove();
    }
    public static void Testremove() {
        Demo list = new Demo();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddLast(5);
       // list.removeElements(2);
       // list.remove(2);
       // list.removeAllKey(2);
        list.display();
    }
}
