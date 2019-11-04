import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login() {
        System.out.println("请输入您的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("请输入您的身份(1 表示管理员， 0 表示普通用户)");

        int choice = scanner.nextInt();
        if (choice == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();

        User user = login();

        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }
}
