class Node {
    public int data;
    public Node next;

    public Node() {

    }
    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    public Node head;
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }
        else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
             this.head = node;
             return;
        }
        else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    private Node searchIndex(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > getLength()) {

        }
    }

    public int getLength() {
        int length = 0;
        for (Node cur = this.head; cur != null; cur = cur.next) {
            length++;
        }
        return length;
    }
    public boolean addIndex(int index,int data) {
        if (index == 0) {
            addFirst(data);
            return true;
        }
        Node cur = searchIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        return true;
    }


    public void remove(int toRemove) {
        // 1. 先单独处理下空链表的情况
        if (head == null) {
            return;
        }
        // 2. 先考虑是否要删除的是头结点
        if (head.data == toRemove) {
            this.head = this.head.next;
            return;
        }
        // 3. 删除中间的节点, 找到要删除元素的前一个元素
        Node prev = searchPrev(toRemove);
        // prev.next = prev.next.next;  // 这种写法虽然没错, 但是比较抽象
        Node nodeToRemove = prev.next;
        prev.next = nodeToRemove.next;
    }

    private Node searchPrev(int toRemove) {
        // 找到要删除元素的前一个位置
        if (this.head == null) {
            return null;
        }
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == toRemove) {
                return prev;
            }
            prev = prev.next;
        }
        // 返回 null 表示没找到
        return null;
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}
