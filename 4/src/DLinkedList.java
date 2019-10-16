class DLinkedNode {
    public int val = 0;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;
    public DLinkedNode(int val) {
        this.val = val;
    }
}
public class DLinkedList {
    private DLinkedNode head = null;

    public DLinkedList() {
        head = new DLinkedNode(-1);
        head.next = head;
        head.prev = head;
    }

    public void addFirst(int data) {
        DLinkedNode newnode = new DLinkedNode(data);
        DLinkedNode next = head.next;
        newnode.next = next;
        next.prev = newnode;
        head.next = newnode;
        newnode.prev = head;
    }

    public void addlast(int data) {
        DLinkedNode newnode = new DLinkedNode(data);
        DLinkedNode prev = head.prev;
        newnode.next = head;
        head.prev = newnode;
        prev.next = newnode;
        newnode.prev = prev;
    }
}
