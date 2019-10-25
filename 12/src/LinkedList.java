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

    public Node reverse() {
        Node prev = null;
        Node cur = this.head;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }


    public int size() {
        int size = 0;
        for (Node cur = this.head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }


    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        } else {
            node.next = head;
            this.head = node;
            return;
        }
    }



    public void display() {
        Node cur = this.head;
        System.out.println("[");
        for (Node node = this.head; node != null; node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" ,");;
            }
        }
        System.out.println("]");
    }
}
