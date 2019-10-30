package package1;


class Node {
    public int data;
    public Node next;
    public Node perv;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }
}
class DoubleList {
    public Node head;
    public Node last;
    public DoubleList() {
        this.head = null;
        this.last = null;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node();
        if (this.head == null) {
            this.head = node;
        }
        node.next = head;
        node.next.perv = node;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node();
        if (this.head == null) {
            this.head = node;
        }
        this.last.next = node;
        node.perv = this.last;
        this.last = node;
    }


    //长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public boolean addIndex(int index, int data) {
        Node node = new Node(data);
        int len = size();
        if (index < 0 || index > len) {
            throw new IndexOutOfBoundsException("index 不合法");
            //return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == len) {
            addLast(data);
            return true;
        }
        Node cur = searchInsex(index);
        node.next = cur;
        node.perv = cur.perv;
        cur.perv = node;
        cur.perv.next = node;
        return true;
    }


    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
        }
        return false;
    }
    private Node searchInsex(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public int remove (int key) {
        Node cur = this.head;
        int olddata = -1;
        while (cur != null) {
            if (cur.data == key) {
                olddata = cur.data;
                if (cur == this.head) {
                    this.head = cur.next;
                    this.head.perv = null;
                } else {
                    while (cur != last) {
                        cur.perv.next = cur.next;
                        cur.next.perv = cur.perv;
                    }
                    this.last = cur.perv;
                    cur.perv.next = cur.next;
//                    cur = last.perv.next;
//                    cur.next = null;
                }
                return olddata;
            } else {
                cur = cur.next;
            }
        }
        return olddata;
    }

    public void removaAll(int key) {
        Node cur = this.head;
        int oldData = -1;
        while (cur != null) {
            if(cur.data == key) {
                oldData = cur.data;
                //删除的节点是头节点
                if(cur == this.head) {
                    this.head = cur.next;
                    if (this.head != null) {
                        this.head.perv = null;
                    }
                }else {
                    //不是头节点
                    if(cur.next != null) {
                        cur.next.perv  = cur.perv ;
                    }else {
                        this.last = cur.perv ;
                    }
                    cur.perv .next = cur.next;
                }
            }
            cur = cur.next;
        }
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        Node cur = this.head;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = null;
            cur.perv = null;
            cur = curNext;
        }
        this.head = null;
        this.last = null;
    }
}
