public class Demo {
    class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {
            val = x;
        }
    }

    // 删除链表中等于给定值 **val** 的所有节点
    public class Demo {
        public void removeElements(int val) {
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



        //尾插
        private ListNode head = null;
        public void addlast(int elem) {
            ListNode node =new ListNode(elem);
            if (this.head == null) {
                this.head = node;
                return;
            }
            node.next = head.next;
            head = node;
            return;
        }

        public void display() {
            System.out.println("[");
            for (ListNode node = this.head;
                 node != null; node = node.next) {
                if (node.next != null) {
                    System.out.println(", ");
                }
            }
            System.out.println("]");
        }
    }





}

