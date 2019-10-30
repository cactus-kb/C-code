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
        if(this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }


    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

     //任意位置插入,第一个数据节点为0号下标
     // public boolean addIndex(int index,int data);

     public void addIndex(int index, int data) {
        Node node = new Node(data);
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == len) {
            addLast(data);
            return;
        }
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;
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

     //查找是否包含关键字key是否在单链表当中
    //public boolean contains(int key);
     public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
     }

    //删除第一次出现关键字为key的节点
    //public void remove(int key);
     public void remove(int key) {
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
     }

     private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
     }

//删除所有值为key的节点
//public void removeAllKey(int key);

     public void removeAllkey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
     }

//  public void clear();
     public void clear() {
        this.head = null;
     }

     public int size() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
     }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
