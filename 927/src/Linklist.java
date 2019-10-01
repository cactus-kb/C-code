class LinkNode {
    public int data;
    public LinkNode next = null;
    //构造方法
    public LinkNode (int data) {
        this.data = data;
    }
}
public class Linklist {
    private LinkNode head = null;
    //头插
    public void AddFirst (int elem) {
        LinkNode node = new LinkNode(elem);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = head;
        this.head = node;
        return;
    }

    //尾插
    public void AddLast (int elem) {
        LinkNode node = new LinkNode(elem);
        if (this.head == null) {
            this.head = node;
            return;
        }
        LinkNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入
    public void AddIndex(int index,int elem) {
        LinkNode node = new LinkNode(elem);
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {
            AddFirst(elem);
            return;
        }
        if (index == len) {
            AddLast(elem);
            return;
        }
        LinkNode prev = getindexpos(index - 1);
        node.next = prev.next;
        prev.next = node;
    }
    private LinkNode getindexpos(int index) {
        LinkNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private int size() {
        int size = 0;
        for (LinkNode cur = this.head;
                cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public boolean contains (int tofind) {
        for (LinkNode cur = this.head;
                cur != null;cur = cur.next) {
            if (cur.data == tofind) {
                return true;
            }
        }
        return false;
    }

    //删除链表中的元素
    public void remove (int toremove) {
        if (head == null) {
            return;
        }
        if (head.data == toremove) {
            this.head = this.head.next;
            return;
        }
        LinkNode prev = searchprev(toremove);
        LinkNode nodetoremove = prev.next;
        prev.next = nodetoremove.next;
    }
    private LinkNode searchprev (int toremove) {
        if (this.head ==null) {
            return null;
        }
        LinkNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == toremove) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    public void display() {
        System.out.print("[");
        for (LinkNode node = this.head;
                node != null; node = node.next) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void removeAllkey(int toremove) {
        if (head == null) {
            return;
        }
        //先处理后续的节点，最后处理头结点的情况
        LinkNode prev = head;
        LinkNode cur = head.next;
        while (cur != null) {
            if (cur.data == toremove) {
                //cur对应的节点应该删掉
                prev.next = cur.next;//删除cur指向的节点
                cur = prev.next;
            }
            else {
                prev = cur;
                cur = cur.next;
            }
        }
        //头结点的情况
        if (this.head.data == toremove) {
            this.head = this.head.next;
        }
        return;
    }

    public void clear() {
        this.head = null;
    }
}
