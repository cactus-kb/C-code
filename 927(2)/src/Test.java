public class Test {
    public static void main (String args) {
        Testremove();
    }
    public static void Testremove() {
        Solution list = new Solution();
        list.addlast(1);
        list.addlast(2);
        list.addlast(2);
        list.addlast(4);
        list.addlast(5);
        list.removeElements(2);
        list.display();
    }
}
