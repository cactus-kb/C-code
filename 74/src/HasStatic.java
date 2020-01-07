import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HasStatic {
    private static  int x = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if (!builder.toString().contains(tmp + "")) {
                    builder.append(tmp);
                }
            }
            System.out.println(builder);
        }
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            set.add(c);
        }
        System.out.println(set);
    }

    public static void main2(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }


    public static void main1(String[] args) {
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1 = new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println("x=" + x);
    }
}
