package package1;


class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
    public Node() {

    }
}
class LinkedList {
    public Node head;

    public void addFirst(int data){
        Node node = new Node();
        if (this.head == null) {
             this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data + " ");
        }
    }
}
