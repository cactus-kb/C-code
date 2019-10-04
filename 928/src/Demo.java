class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }
}

public class Demo {
    private ListNode head = null;

    //尾插
    public void AddLast(int elem) {
        ListNode node = new ListNode(elem);
        if (this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void display() {
        System.out.print("[");
        for (ListNode node = this.head;
             node != null; node = node.next) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    //删除给定值的第一个节点
    public void removeElements(ListNode head, int val) {
        //空链表的情况
        if (head == null) {
            return;
        }
        //先处理后续的节点，最后处理头结点的情况
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
            //头节点的情况
            if (head.val == val) {
                head = head.next;
            }
            return;
        }
    }


    //删除给定值的所有节点
    public void removeAllKey(int toRemove) {
        if (head == null) {
            return;
        }
        // 先处理后续的节点, 最后处理头结点的情况
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == toRemove) {
                // cur 对应的节点就应该删掉
                prev.next = cur.next;  // 删除 cur 指向的节点
                cur = prev.next; // 让 cur 继续指向 prev 的下一个节点
            } else {
                // cur 对应的节点不用删除
                prev = cur;
                cur = cur.next;
            }
        }
        // 头结点的情况
        if (this.head.val == toRemove) {
            this.head = this.head.next;
        }
        return;
    }

    //反转一个单链表
    public ListNode reverseList(ListNode head) {
        //对于空链表，不需要做任何处理
        if (head == null) {
            return null;
        }
        //对于只有一个元素的链表也不需要做任何处理
        if (head.next == null) {
            return head;
        }
        //有多个节点
        ListNode newhead = null;//逆置之后的头结点newhead
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                newhead = cur;
            }
            //   翻转指针的指向
            cur.next = prev;
            // 更新 prev 和 cur
            prev = cur;
            cur = next;
        }
        return newhead;
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
// 如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode(ListNode head) {
        //得到链表的长度
        int steps = size(head) / 2;
        //根据长度的一半移动cur的位置
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public int size(ListNode head) {
        int size = 0;
        for (ListNode cur = head;
             cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }


    //输入一个链表，输出该链表中倒数第k个结点
    public ListNode findKtotail(ListNode head, int k) {
        int length = size(head);
        if (head == null || k <= 0 || k > length) {
            return null;
        }
        int offset = length - k;
        ListNode cur = head;
        for (int i = 0; i < offset; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //将两个有序链表合并为一个新的有序链表并返回。
    // 新链表是通过拼接给定的两个链表的所有节点组成的
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newhead = null;
        ListNode newtail = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                //把cur1指向的节点插入到新的链表的尾部
                if (newhead == null) {
                    //新链表是空链表
                    newhead = cur1;
                    newtail = cur1;
                    cur1 = cur1.next;
                } else {
                    //新链表不是空链表
                    newtail.next = cur1;
                    //更新指向尾部的指向
                    newtail = newtail.next;
                    cur1 = cur1.next;
                }
            } else {
                if (newhead == null) {
                    newhead = cur2;
                    newtail = cur2;
                } else {
                    newtail.next = cur2;
                    newtail = newtail.next;
                    cur2 = cur2.next;
                }
            }
        }
        if (cur1 == null) {
            newtail.next = cur2;
        } else {
            newtail.next = cur1;
        }
        return newhead;
    }


    // 以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(ListNode phead, int x) {
        if (phead == null) {
            return null;
        }
        if (phead.next == null) {
            return phead;
        }
        ListNode smallhead = new ListNode(-1);
        ListNode smalltail = smallhead;
        ListNode bighead = new ListNode(-1);
        ListNode bigtail = bighead;
        for (ListNode cur = phead;
             cur != null; cur = cur.next) {
            if (cur.val < x) {
                smallhead.next = cur;
            } else {
                bighead.next = cur;
            }
        }
        smalltail.next = bigtail.next;
        return smalltail.next;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点0
    // 重复的结点不保留，返回链表头指针
    public ListNode removesame(ListNode phead) {
        //创建一个新的链表来存放不重复的节点
        ListNode newhead = new ListNode(-1);
        ListNode newtail = newhead;
        ListNode cur = phead;
        while (cur != null) {
            if (cur.next != null
                    && cur.val == cur.next.val) {
                while (cur.next != null
                        && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            } else {
                newtail.next = new ListNode(cur.val);
                newtail = newtail.next;
                cur = cur.next;
            }
        }
        return newhead.next;
    }

    //链表的回文结构 eg :1  2  3  3  2  1
    public boolean chkpalindrome (ListNode A) {
        if (A == null) {
            return true;
        }
        if (A.next == null) {
            return true;
        }
        int length = size(A);
        int steps = length / 2;
        ListNode B = A;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        if (length % 2 != 0) {
            ListNode prev = B;
            B = B.next;//奇数个时
        }
        else {

        }
    }

    //输入两个链表，找出它们的第一个公共结点（链表相交 Y型）


}


