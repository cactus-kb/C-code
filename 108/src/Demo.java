class ListNode{
    int data;
    ListNode next;
    public ListNode (int val){
        this.data = val;
    }
}
public class Demo {
    //给定一个链表，判断是否有环
    //快慢指针，快指针一次走两步，慢指针一次走一步，带环则两个指针一定会重合
    public boolean hascycle (ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detetcycle (ListNode head) {
        //从链表头部出发，到入口点的距离
        //从和慢指针重合的地方，到入口点的距离
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //不带环
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        ListNode cur = head;
        ListNode cur2 = fast;
        while (cur != cur2) {
            cur = cur.next;
            cur2 = cur2.next;
        }
        return cur;
    }



    public ListNode removeElements(ListNode head,int val){
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode node = head.next;
        while (node != null) {
            if (node.data == val) {
                prev.next = node.next;
                node = prev.next;
            }
            else {
                prev = node;
                node = node.next;
            }
        }
        if (head.data == val) {
            head = head.next;
        }
        return head;
    }

    public int size (ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public ListNode getin(ListNode headA,ListNode headB) {
        int lenA = size(headA);
        int lenB = size(headB);
        if (lenA > lenB) {
            int offset = lenA - lenB;
            for (int i = 0; i < offset; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
