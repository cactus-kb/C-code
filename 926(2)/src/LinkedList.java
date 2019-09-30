//java中的一个.java文件中其实可以存放多个class
//但是这多个class中只有一个才允许是public,
// 这个public的class类名必须和文件名完全一致
class LinkedNode{
    public int data = 0;
    public LinkedNode next = null;
    //构造方法
    public LinkedNode(int data){
        this.data = data;
    }
}

public class LinkedList {
    private LinkedNode head = null;

    public void addfirst(int elem){
        //先创建一个节点，让这个节点的值就是elem
    LinkedNode node = new LinkedNode(elem);
    if (this.head == null){
        //空链表的情况
        this.head = node;
        return;
        }
        //不是空链表，就需要把新的节点放到链表的开始位置上
        node.next = head;
        this.head = node;
        return;
    }

    public void display(){
        System.out.print("[");
        for (LinkedNode node = this.head;
             node != null; node = node.next){
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void addlast(int elem) {
        LinkedNode node = new LinkedNode(elem);
        //如果是空链表，直接把这个节点放上去即可
        if (this.head == null) {
            this.head = node;
            return;
        }
        //非空情况下，需要先找到最后一个节点
        LinkedNode cur = this.head;
        //这个循环结束后，cur势必就是最后一个节点
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void addindex(int index,int elem){
        LinkedNode node = new LinkedNode(elem);
        //先对pos进行一个合法性的校验，需要知道链表的长度
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        //处理头插的情况
        if(index == 0){
            addfirst(elem);
            return;
        }
        //尾插
        if (index == len) {
            addlast(elem);
            return;
        }
        //处理插入到中间位置的情况
        //prev这个引用就对应到index - 1 的位置
        LinkedNode prev = getindexpos(index - 1);
        //完成具体的插入过程
        node.next = prev.next;
        prev.next = node;
    }

    private LinkedNode getindexpos(int index){
        LinkedNode cur = this.head;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }

    public int size(){
        int size = 0;
        for(LinkedNode cur = this.head;
            cur != null; cur = cur.next){
            size++;
        }
        return size;
    }


    public boolean contains(int tofind){
        //直接遍历链表，依次比较每个元素
        for (LinkedNode cur = this.head;
             cur != null;
             cur = cur.next){
            if (cur.data ==tofind) {
                return true;
            }
        }
        return false;
    }

    public void remove (int toremove) {
        if (head == null) {
            return;
        }
        if (head.data == toremove) {
            this.head = this.head.next;
            return;
        }
        LinkedNode prev = searchprev(toremove);
        LinkedNode nodetoremove = prev.next;
        prev.next = nodetoremove.next;
    }
    private LinkedNode searchprev(int toremove) {
        if (this.head == null) {
            return null;
        }
        LinkedNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == toremove) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }



}
