import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode plus(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        ListNode ab = new ListNode(-1);
        while (a.next != null || b.next != null) {
            int ret = a.next.val + b.next.val;
            if (ret / 10 == 0) {
                ab.next.val = ret;
                a = a.next;
                b = b.next;
                ab = ab.next;
            } else {
                ab.next.val = (ret % 10);
                a = a.next;
                b = b.next;
                ab = ab.next;
                ret = ret + 1;
            }
        }
        return ab.next;
    }


    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode ab = new ListNode(-1);
        if (a == null && b == null) {
            return null;
        }
        while (a.next != null && b.next != null) {
            ab.next.val = a.val + b.val;
            if (ab.next.val < 10) {
                ab.next.val = a.val + b.val;
            } else {
                ab.next.val = a.val + b.val + 1;
            }
            ab = ab.next;
            a = a.next;
            b = b.next;
        }
        return ab.next;
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String give = scanner.next();
        String want = scanner.next();
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < give.length(); i++) {
            list.add(give.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < want.length(); i++) {
            char c = want.charAt(i);
            for (int j = 0; j < list.size(); j++) {
                if (c == list.get(j)) {
                    list.remove(j);
                    count++;
                    break;
                }
            }
        }
        if (count == want.length()) {
            System.out.println("Yes" + " " + (give.length() - count));
        } else {
            System.out.println("No" + " " + (want.length() - count));
        }
    }


    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String give = scanner.nextLine();
        List<Character> list = new LinkedList<>();
        String want = scanner.nextLine();
        for (int i = 0; i < give.length(); i++) {
            list.add(give.charAt(i));
        }
        for (int i = 0; i < want.length(); i++) {
            char c = want.charAt(i);
            if (!list.isEmpty()) {
                while (!list.isEmpty()) {
                    if (list.contains(c)) {
                        list.remove(c);
                        break;
                    }
                }
            } else {
                System.out.println("NO" + " " + want.length());
            }
        }
        System.out.println("YES" + " " + list.size());
    }
}
