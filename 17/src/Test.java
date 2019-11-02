public class Test {
    //输入两个链表，找出它们的第一个公共结点
    public  static Node getIntersectionNode(Node headA, Node headB) {
        //分别求两个单链表的长度，计算差值，让最长的单链表先走差值部分的长度，然后再一起走

        int lenA = 0;
        int lenB = 0;
        Node pl = headA;//假设pl代表长的单链表
        Node ps = headB;//ps代表短的单链表
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if (len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //pl肯定指向最长的单链表，ps肯定指向最短的单链表，len肯定是一个正数
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //pl和ps此时已经在同一起跑线，可以一人一步走
        while (pl != null && ps != null && pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        if (pl == null || ps == null) {
            return null;
        }
        return pl;
    }

    public void createCut(Node headA, Node headB) {
        headA.next = headB.next.next;
    }


    public static void main(String[] args) {

    }
}
