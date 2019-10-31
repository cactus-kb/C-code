
class Node1 {
    public int data;
    public Node1 next;

    public Node1() {

    }

    public Node1(int data) {
        this.data = data;
    }
}

 class LinkList {
    public Node head;


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
    //删除链表中等于给定值val的所有节点
//     public void removeAll(int val) {
//         if (this.head == null) {
//             return;
//         }
//         if (this.head.data == val) {
//             this.head = this.head.next;
//         }
//         Node prev = this.head;
//         Node cur = this.head.next;
//         while (cur != null) {
//             if (cur.data == val) {
//                 prev.next = cur.next;
//                 cur = cur.next;
//             }
//             prev = cur;
//             cur = cur.next;
//         }
//     }


     public void removeAllkey(int data) {
        if (this.head == null) {
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data != data) {
                cur = cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }
        if (this.head.data == data) {
            this.head = this.head.next;
        } else {
             this.head = this.head;
        }
     }


    //反转一个单链表
     public Node reverseList() {
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


    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
     public Node middleNode() {
        int count = 0;
        Node cur = this.head;
        int len = length() / 2;
        while (count != len) {
            cur = cur.next;
            count++;
        }
        return cur;
     }

     public int length() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
     }

     public Node middleNode1() {
        if (this.head == null) {
            throw new NullPointerException("链表不存在");
        }
        if (this.head.next == null) {
            return this.head;
        }
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
     }
    //输入一个链表，输出该链表中倒数第k个结点。
     public Node findTail(int k) {
        if (this.head == null) {
            throw new NullPointerException("链表不存在");
        }
        Node slow = this.head;
        Node fast = this.head;
        int count = 0;
       while (count != k -1 && k - 1 > 0) {
           if (fast.next != null) {
               fast = fast.next;
               count++;
           } else {
               System.out.println("这个节点不存在");
               return fast;
           }
       }
       while (fast.next != null) {
           fast = fast.next;
           slow = slow.next;
       }
        return slow;
     }
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     public Node mergeTwolist(Node list1, Node list2) {
        Node cur1 = list1;
        Node cur2 = list2;
        Node newList = null;
        Node last = null;//结果链表的最后一个节点
         if (cur1 == null) {
             return cur2;
         }
         if (cur2 == null) {
             return cur1;
         }
         while (cur1 != null && cur2 != null) {
             if (cur1.data > cur2.data) {
                 Node cur2Next = cur2.next;
                 cur2.next = null;
                 if (newList == null) {
                     newList = cur2;
                 } else {
                     last.next = cur2;
                 }
                 last = cur2;
                 cur2 = cur2Next;
             } else {
                 Node cur1Next = cur1.next;
                 cur1.next = null;
                 if (newList == null) {
                     newList = cur1;
                 } else {
                     last.next = cur1;
                 }
                 last = cur1;
                 cur1 = cur1Next;
             }
         }
         if (cur1 != null) {
             last.next = cur1;
         }
         if (cur2 != null) {
             last.next = cur2;
         }
         return newList;
     }


    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
     public Node partition(int x) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        Node cur = this.head;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = null;
            if (cur.data < x) {
                if (beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                } else {
                    beforeEnd.next = cur;
                    beforeEnd = beforeEnd.next;

                }
            } else {
                if (afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                } else {
                    afterEnd.next = cur;
                    afterEnd = afterEnd.next;
                }
            }
            cur = curNext;
        }
        if (beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
     }


    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
     public Node deleteDuplication() {
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tmp = newHead;
        while (cur != null) {
            //找到相同的节点
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
                tmp.next = cur;
            } else {
                //没有找到相同的节点
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        return newHead.next;
     }



    //链表的回文结构。
     public boolean chkPalindrome() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = null;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = curNext;
            prev = cur;
            newHead = curNext;
            while (this.head != null && newHead != null) {
                if (this.head.data != newHead.data) {
                    return false;
                }
                newHead = newHead.next;
                this.head = this.head.next;
            }
        }
        return true;
     }




     //输入两个链表，找出它们的第一个公共结点。
    //给定一个链表，判断链表中是否有环。
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null

     public void display1(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
         System.out.println();
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



