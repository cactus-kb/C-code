package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
       // Scanner scaner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scaner.next();
        System.out.println("请输入图书的作者：");
        String author = scaner.next();
        System.out.println("请输入图书的价格：");
        int price = scaner.nextInt();
        System.out.println("请输入图书的类型： ");
        String type = scaner.next();

        Book book = new Book(name,author,price,type);

        int size = bookList.getUsedSize();
        bookList.setBooks(size,book);
        bookList.setUsedSize(size + 1);
    }
}
