package operation;

import book.BookList;

import java.util.Scanner;

public interface IOperation {
    Scanner scaner = new Scanner(System.in);
    public void work(BookList bookList);
}
